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
 * Lorenzo Bettini - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.parsley.ui.provider;

import java.util.HashMap;
import java.util.List;

import com.google.common.collect.Lists;

public class EClassToEStructuralFeatureAsStringsMap extends
		HashMap<String, List<String>> {

	private static final long serialVersionUID = -5838485782229839444L;

	public void mapTo(String eClass, String... features) {
		put(eClass, Lists.newArrayList(features));
	}
}