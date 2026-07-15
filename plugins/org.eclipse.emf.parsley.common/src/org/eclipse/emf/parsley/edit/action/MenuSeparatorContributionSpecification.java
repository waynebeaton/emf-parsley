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

import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.IStructuredSelection;

/**
 * The implementation wrapping a {@link Separator}
 *
 * @author Lorenzo Bettini - initial contribution and API
 *
 */
public class MenuSeparatorContributionSpecification implements IMenuContributionSpecification {

	public MenuSeparatorContributionSpecification() {
		// nothing to do
	}

	@Override
	public void updateSelection(IStructuredSelection selection) {
		// nothing to update for a standard Action
	}

	@Override
	public IContributionItem getContributionItem() {
		return new Separator();
	}

}
