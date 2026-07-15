/*******************************************************************************
 * Copyright (c) 2013 RCP Vision (http://www.rcp-vision.com) and others.
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
package org.eclipse.emf.parsley.tests.swtbot.factories;

import org.eclipse.emf.parsley.tests.swtbot.activator.EmfParsleySwtBotTestsActivator;

import com.google.inject.Injector;

/**
 * Uses a custom label provider
 * 
 * @author Lorenzo Bettini
 * 
 */
public class CustomElementsContentProviderLibraryExecutableExtensionFactory extends
		EmfParsleyTestsExecutableExtensionFactory {

	@Override
	public Injector getInjector() {
		return EmfParsleySwtBotTestsActivator.getDefault().getInjector(
				this.getClass());
	}

}
