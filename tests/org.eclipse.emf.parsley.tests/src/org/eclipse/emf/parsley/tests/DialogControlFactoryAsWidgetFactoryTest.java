/*******************************************************************************
 * Copyright (c) 2015 RCP Vision (http://www.rcp-vision.com) and others.
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

import org.eclipse.emf.parsley.composite.DialogControlFactory;

public class DialogControlFactoryAsWidgetFactoryTest extends DialogWidgetFactoryTest {

	@Override
	public void setupWidgetFactory() {
		DialogControlFactory dialogControlFactory = new DialogControlFactory();
		initialize(dialogControlFactory, classForControlsInstance);
		factory = dialogControlFactory;
	}

}
