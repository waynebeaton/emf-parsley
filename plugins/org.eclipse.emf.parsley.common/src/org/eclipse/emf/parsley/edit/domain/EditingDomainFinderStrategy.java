/*******************************************************************************
 * Copyright (c) 2016 RCP Vision (http://www.rcp-vision.com) and others.
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
package org.eclipse.emf.parsley.edit.domain;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.parsley.edit.EditingDomainFinder;

import com.google.inject.Inject;

/**
 * Delegates to {@link EditingDomainFinder}
 *
 * @author Lorenzo Bettini - initial API and implementation
 *
 */
public class EditingDomainFinderStrategy {

	@Inject
	private EditingDomainFinder editingDomainFinder;

	private EditingDomain editingDomain;

	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	public void setEditingDomain(EditingDomain editingDomain) {
		this.editingDomain = editingDomain;
	}

	public void updateEditingDomain(Object object) {
		setEditingDomain(editingDomainFinder.getEditingDomainFor(object));
	}

}
