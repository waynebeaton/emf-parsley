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
package org.eclipse.emf.parsley.dsl.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author Lorenzo Bettini
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	EmfParsleyDslGeneratorUtilsTest.class,
	EmfParsleyDslParsingTest.class,
	EmfParsleyDslGuiceModuleHelperTest.class,
	EmfParsleyDslSmokeTest.class,
	EmfParsleyDslScopingTest.class,
	EmfParsleyDslValidatorTest.class,
	EmfParsleyDslPluginXmlGeneratorTest.class,
	EmfParsleyDslGeneratorTest.class,
	EmfParsleyDslOrganizeImportsTest.class,
	EmfParsleyDslNewProjectFilesTest.class,
	EmfParsleyProjectFilesGeneratorUtilTest.class,
	EmfParsleyTemplateWizardConfigurationTest.class,
	EmfParsleyTemplateWizardConfigurationFactoryTest.class,
	EmfParsleyDslFormatterTest.class,
	EmfParsleyDslPluginXmlLoaderTest.class
})
public class EmfParsleyDslAllTests {

}
