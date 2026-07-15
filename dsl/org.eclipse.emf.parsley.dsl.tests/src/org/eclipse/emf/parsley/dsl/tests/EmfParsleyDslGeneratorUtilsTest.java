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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.eclipse.emf.parsley.dsl.jvmmodel.EmfParsleyDslGeneratorUtils;
import org.junit.Test;

public class EmfParsleyDslGeneratorUtilsTest {

	private EmfParsleyDslGeneratorUtils utils = new EmfParsleyDslGeneratorUtils();

	@Test
	public void testGetPropertyNameForGetterSetterMethod() {
		assertEquals("foo", utils.getPropertyNameForGetterSetterMethod("getFoo"));
		assertEquals("foo", utils.getPropertyNameForGetterSetterMethod("foo"));
		assertEquals("get", utils.getPropertyNameForGetterSetterMethod("get"));
		assertEquals("geteFoo", utils.getPropertyNameForGetterSetterMethod("geteFoo"));
		
		assertEquals("foo", utils.getPropertyNameForGetterSetterMethod("isFoo"));
		assertEquals("is", utils.getPropertyNameForGetterSetterMethod("is"));
		assertEquals("iseFoo", utils.getPropertyNameForGetterSetterMethod("iseFoo"));
	}

	@Test
	public void testShouldGenerateExtensionsWithNull() {
		assertFalse(utils.shouldGenerateExtensions(null));
	}
}
