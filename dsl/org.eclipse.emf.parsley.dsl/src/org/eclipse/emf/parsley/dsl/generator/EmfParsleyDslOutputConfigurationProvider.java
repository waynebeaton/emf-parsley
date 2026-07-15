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
package org.eclipse.emf.parsley.dsl.generator;

import java.util.Set;

import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.generator.OutputConfigurationProvider;

public class EmfParsleyDslOutputConfigurationProvider extends
		OutputConfigurationProvider {

	public static final String EMFPARSLEY_GEN = "./emfparsley-gen";

	public static final String PLUGIN_XML_EMFPARSLEY_GEN_EXTENSION = "xml_emfparsley_gen";

	public static final String PLUGIN_XML_GEN_FILE = "plugin." + PLUGIN_XML_EMFPARSLEY_GEN_EXTENSION;

	@Override
	public Set<OutputConfiguration> getOutputConfigurations() {
		Set<OutputConfiguration> outputconfigurations = super
				.getOutputConfigurations();
		OutputConfiguration outputConfiguration = outputconfigurations
				.iterator().next();
		outputConfiguration.setOutputDirectory(EMFPARSLEY_GEN);

		return outputconfigurations;
	}

}