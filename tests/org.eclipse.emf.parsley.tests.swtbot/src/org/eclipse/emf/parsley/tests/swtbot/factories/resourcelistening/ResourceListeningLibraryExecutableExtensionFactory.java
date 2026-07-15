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
 * Francesco Guidieri - Initial contribution and API
 *******************************************************************************/
package org.eclipse.emf.parsley.tests.swtbot.factories.resourcelistening;

import org.eclipse.emf.parsley.tests.swtbot.activator.EmfParsleySwtBotTestsActivator;
import org.eclipse.emf.parsley.tests.swtbot.factories.EmfParsleyTestsExecutableExtensionFactory;

import com.google.inject.Injector;

/**
 * Uses an editable table
 * 
 * @author Francesco Guidieri
 * 
 */
public class ResourceListeningLibraryExecutableExtensionFactory extends
		EmfParsleyTestsExecutableExtensionFactory {

	@Override
	public Injector getInjector() {
		return EmfParsleySwtBotTestsActivator.getDefault().getInjector(
				this.getClass());
	}

}
