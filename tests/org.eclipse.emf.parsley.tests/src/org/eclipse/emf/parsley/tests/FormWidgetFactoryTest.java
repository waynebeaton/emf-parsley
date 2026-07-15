/*******************************************************************************
 * Copyright (c) 2015 RCP Vision (http://www.rcp-vision.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public
 * License v2.0 which accompanies this distribution, and is
 * available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 * Lorenzo Bettini - Initial contribution and API
 *******************************************************************************/
package org.eclipse.emf.parsley.tests;

import static org.junit.Assert.assertNotNull;

import org.eclipse.emf.parsley.widgets.FormWidgetFactory;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.junit.Test;

public class FormWidgetFactoryTest extends DialogWidgetFactoryTest {

	@Override
	protected void setupWidgetFactory() {
		factory = getOrCreateInjector().getInstance(FormWidgetFactory.class);
		((FormWidgetFactory) factory).init(getShell(), new FormToolkit(getShell().getDisplay()));
	}

	@Test
	public void testToolkit() {
		assertNotNull(((FormWidgetFactory) factory).getToolkit());
	}
}
