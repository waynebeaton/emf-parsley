/*******************************************************************************
 * Copyright (c) 2014 RCP Vision (http://www.rcp-vision.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 * Lorenzo Bettini - initial contribution and API
 ******************************************************************************
 * SPDX-License-Identifier: EPL-2.0
*/
package org.eclipse.emf.parsley.edit.action;

import org.eclipse.emf.edit.ui.action.CommandActionHandler;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.viewers.IStructuredSelection;

/**
 * The implementation wrapping an actual {@link CommandActionHandler}
 *
 * @author Lorenzo Bettini - initial contribution and API
 *
 */
public class MenuCommandActionHandlerContributionSpecification implements IMenuContributionSpecification {

	private CommandActionHandler action;

	public MenuCommandActionHandlerContributionSpecification(CommandActionHandler action) {
		this.action = action;
	}

	@Override
	public void updateSelection(IStructuredSelection selection) {
		action.updateSelection(selection);
	}

	@Override
	public IContributionItem getContributionItem() {
		return new ActionContributionItem(action);
	}

}
