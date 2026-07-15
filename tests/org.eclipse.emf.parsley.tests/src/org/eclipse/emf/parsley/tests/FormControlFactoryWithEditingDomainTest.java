/*******************************************************************************
 * Copyright (c) 2014 RCP Vision (http://www.rcp-vision.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * Contributors:
 * Lorenzo Bettini - Initial contribution and API
 ******************************************************************************
 * SPDX-License-Identifier: EPL-2.0
*/
package org.eclipse.emf.parsley.tests;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.Before;

public class FormControlFactoryWithEditingDomainTest extends FormControlFactoryTest {
	
	private EditingDomain editingDomain = null;
	
	@Before
	public void setEditingDomainToNull() {
		editingDomain = null;
	}
	
	@Override
	protected EditingDomain getEditingDomain() {
		if (editingDomain == null) {
			editingDomain = getOrCreateInjector().getProvider(EditingDomain.class).get();
		}
		return editingDomain;
	}

	@Override
	protected ResourceSet createResourceSet() {
		return getEditingDomain().getResourceSet();
	}
	
}
