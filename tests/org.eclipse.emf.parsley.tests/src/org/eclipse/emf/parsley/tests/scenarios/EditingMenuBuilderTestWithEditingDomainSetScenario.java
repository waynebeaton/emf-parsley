/*******************************************************************************
 * Copyright (c) 2016 RCP Vision (http://www.rcp-vision.com) and others.
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
package org.eclipse.emf.parsley.tests.scenarios;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.parsley.tests.AbstractEditingMenuBuilderTest;

/**
 * In this scenario the EditingDomain is set from outside
 */
public class EditingMenuBuilderTestWithEditingDomainSetScenario extends AbstractEditingMenuBuilderTest {

	@Override
	protected Resource createResourceForTest() {
		return fixtures.createTestLibrayResourceAndInitialize();
	}

}
