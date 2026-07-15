/*******************************************************************************
 * Copyright (c) 2013 RCP Vision (http://www.rcp-vision.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 * Francesco Guidieri - initial API and implementation
 ******************************************************************************
 * SPDX-License-Identifier: EPL-2.0
*/
package org.eclipse.emf.parsley.edit.action;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.ValidateAction;

/**
 * A custom version where we can explicitly set the {@link EditingDomain}
 *
 * @author Francesco Guidieri - initial API and implementation
 *
 */
public class EditingDomainValidateAction extends ValidateAction {

	public void setEditingDomain(EditingDomain domain) {
		this.domain = domain;
	}
}