/*
 * generated by Xtext
 */
package at.ac.univie.cs.swa.soa.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;

/**
 * Use this class to register components to be used within the IDE.
 */
public class ServiceDslUiModule extends at.ac.univie.cs.swa.soa.ui.AbstractServiceDslUiModule {
	public ServiceDslUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	@Override
	public Class<? extends IXtextBuilderParticipant> bindIXtextBuilderParticipant()
	{
		return JavaProjectBasedBuilderParticipant2.class;
	}
}