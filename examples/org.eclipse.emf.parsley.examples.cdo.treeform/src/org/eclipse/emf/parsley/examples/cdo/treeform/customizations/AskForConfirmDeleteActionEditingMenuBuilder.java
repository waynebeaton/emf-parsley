/*******************************************************************************
 * Copyright (c) 2013 RCP Vision (http://www.rcp-vision.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * Contributors:
 * Vincenzo Caselli - initial API and implementation
 ******************************************************************************
 * SPDX-License-Identifier: EPL-2.0
*/
package org.eclipse.emf.parsley.examples.cdo.treeform.customizations;


import org.eclipse.emf.edit.ui.action.DeleteAction;
import org.eclipse.emf.parsley.edit.action.EditingMenuBuilder;
import org.eclipse.jface.dialogs.MessageDialog;

public class AskForConfirmDeleteActionEditingMenuBuilder extends EditingMenuBuilder {

	@Override
	protected DeleteAction createDeleteAction() {
		return new ConfirmDeleteAction();
	}
	
	class ConfirmDeleteAction extends DeleteAction{

		public ConfirmDeleteAction() {
			super(true);
		}
		
		@Override
		public void run() {
			if(MessageDialog.openConfirm(null, "Delete", "Do you want to delete this?")){
				super.run();
			}
		}
		
	}

}
