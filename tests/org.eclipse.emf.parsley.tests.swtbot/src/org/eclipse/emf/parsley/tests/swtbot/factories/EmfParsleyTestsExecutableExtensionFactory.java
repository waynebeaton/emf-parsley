/*******************************************************************************
 * Copyright (c) 2013 RCP Vision (http://www.rcp-vision.com) and others.
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
package org.eclipse.emf.parsley.tests.swtbot.factories;


import org.eclipse.emf.parsley.EmfParsleyExtensionFactory;
import org.eclipse.emf.parsley.tests.swtbot.activator.EmfParsleySwtBotTestsActivator;
import org.osgi.framework.Bundle;

/**
 * Uses a custom label provider
 * 
 * @author Lorenzo Bettini
 * 
 */
public class EmfParsleyTestsExecutableExtensionFactory extends
		EmfParsleyExtensionFactory {

	/**
	 * We override it since we use guice to load a class from this very plugin.
	 * 
	 * @see org.eclipse.emf.parsley.EmfParsleyExtensionFactory#getBundle()
	 */
	@Override
	protected Bundle getBundle() {
		return EmfParsleySwtBotTestsActivator.getDefault().getBundle();
	}

}
