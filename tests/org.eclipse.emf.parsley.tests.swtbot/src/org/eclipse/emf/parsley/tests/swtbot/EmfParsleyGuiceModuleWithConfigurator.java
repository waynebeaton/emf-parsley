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
package org.eclipse.emf.parsley.tests.swtbot;

import org.eclipse.emf.parsley.EmfParsleyGuiceModule;
import org.eclipse.emf.parsley.config.Configurator;
import org.eclipse.emf.parsley.tests.swtbot.views.TestConfigurator;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * The base module for all the tests that want to use a {@link Configurator}.
 * 
 * @author Lorenzo Bettini - Initial contribution and API
 *
 */
public class EmfParsleyGuiceModuleWithConfigurator extends
		EmfParsleyGuiceModule {

	public EmfParsleyGuiceModuleWithConfigurator(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends Configurator> bindConfigurator() {
		return TestConfigurator.class;
	}
}
