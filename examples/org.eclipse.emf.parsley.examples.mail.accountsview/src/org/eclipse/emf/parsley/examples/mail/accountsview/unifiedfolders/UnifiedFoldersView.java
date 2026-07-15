/*******************************************************************************
 * Copyright (c) 2013 RCP Vision (http://www.rcp-vision.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * Contributors:
 * Lorenzo Bettini - initial API and implementation
 ******************************************************************************
 * SPDX-License-Identifier: EPL-2.0
*/
package org.eclipse.emf.parsley.examples.mail.accountsview.unifiedfolders;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.parsley.examples.mail.accountsview.views.AccountsView;

public class UnifiedFoldersView extends AccountsView {

	public static final String ID = "org.eclipse.emf.parsley.examples.mail.unifiedfoldersview";

	@Override
	public void mostRecentCommandAffectsResource(Command mostRecentCommand) {
		super.mostRecentCommandAffectsResource(mostRecentCommand);
		// if a child changes the parent is not refreshed by default
		getViewer().refresh();
		getViewer().expandAll();
	}
}
