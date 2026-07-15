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

package org.eclipse.emf.parsley.edit;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;

/**
 * Retrieves the EditingDomain for an Object. The default implementation simply
 * uses {@link AdapterFactoryEditingDomain#getEditingDomainFor(Object)} and also
 * considers the case for {@link Resource}.
 *
 * @author Lorenzo Bettini
 *
 */
public class EditingDomainFinder {

	public EditingDomain getEditingDomainFor(Object object) {
		final EditingDomain editingDomainFor = AdapterFactoryEditingDomain.getEditingDomainFor(object);
		if (editingDomainFor == null && object instanceof Resource) {
			final Resource resource = (Resource) object;
			ResourceSet resourceSet = resource.getResourceSet();
			if (resourceSet instanceof IEditingDomainProvider) {
				return ((IEditingDomainProvider) resourceSet).getEditingDomain();
			}
		}
		return editingDomainFor;
	}
}
