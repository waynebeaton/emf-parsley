/*******************************************************************************
 * Copyright (c) 2014 RCP Vision (http://www.rcp-vision.com) and others.
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
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class ClassLoaderImageHelperTest extends AbstractImageBasedTest {
	
	@Test
	public void testGetImageOk() {
		assertNotNull(loadTestImage());
	}

	@Test
	public void testGetImageNonExistent() {
		assertNull(getImageHelper().getImage("non-existent.png"));
	}

}
