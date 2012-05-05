/**
 * Copyright (c) 2012 University of Vienna, Austria.
 * All rights reserved.
 *
 * Developed by: Software Architecture Group
 *               Faculty of Computer Science
 *               University of Vienna, Austria.
 *               http://cs.univie.ac.at/swa
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to
 * deal with the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 *   1. Redistributions of source code must retain the above copyright notice,
 *      this list of conditions and the following disclaimers.
 *   2. Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimers in the
 *      documentation and/or other materials provided with the distribution.
 *   3. Neither the names of Software Architecture Group, Faculty of Computer
 *      Science, University of Vienna, Austria, nor the names of its contributors 
 *      may be used to endorse or promote products derived from this Software 
 *      without specific prior written permission.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.  IN NO EVENT SHALL THE
 * CONTRIBUTORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * WITH THE SOFTWARE.
 */

package at.ac.univie.cs.swa.soa.ui;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.builder.BuilderParticipant;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;

import at.ac.univie.cs.swa.soa.generator.IGenerator2;

import com.google.inject.Inject;

/**
 * @author Huy Tran (huy.tran_at_univie.ac.at)
 * 
 */
public class JavaProjectBasedBuilderParticipant2 extends BuilderParticipant
{
	@Inject
	private ResourceDescriptionsProvider	resourceDescriptionsProvider;

	@Inject
	private IContainer.Manager				containerManager;

	@Inject(optional = true)
	private IGenerator2						generator2;

	protected ThreadLocal<Boolean>			buildSemaphor	= new ThreadLocal<Boolean>();

	@Override
	public void build(IBuildContext context, IProgressMonitor monitor) throws CoreException
	{
		buildSemaphor.set(false);
		super.build(context, monitor);
	}

	@Override
	protected void handleChangedContents(Delta delta, IBuildContext context, EclipseResourceFileSystemAccess2 fileSystemAccess) throws CoreException
	{
		super.handleChangedContents(delta, context, fileSystemAccess);
		if (!buildSemaphor.get() && generator2 != null)
		{
			invokeGenerator(delta, context, fileSystemAccess);
		}
	}

	private void invokeGenerator(Delta delta, IBuildContext context, IFileSystemAccess fileSystemAccess)
	{
		buildSemaphor.set(true);
		Resource resource = context.getResourceSet().getResource(delta.getUri(), true);
		if (shouldGenerate(resource, context))
		{
			IResourceDescriptions index = resourceDescriptionsProvider.createResourceDescriptions();
			IResourceDescription resDesc = index.getResourceDescription(resource.getURI());
			List<IContainer> visibleContainers = containerManager.getVisibleContainers(resDesc, index);
			for (IContainer c : visibleContainers)
			{
				for (IResourceDescription rd : c.getResourceDescriptions())
				{
					context.getResourceSet().getResource(rd.getURI(), true);
				}
			}

			generator2.doGenerate(context.getResourceSet(), fileSystemAccess);
		}
	}
}
