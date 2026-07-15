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
package org.eclipse.emf.parsley.tests.swtbot.providers;

import static org.eclipse.emf.parsley.examples.library.EXTLibraryPackage.Literals.*;

import org.eclipse.emf.parsley.ui.provider.FeaturesProvider;

/**
 * @author Lorenzo Bettini
 * 
 */
public class LibraryEStructuralFeaturesProvider extends
		FeaturesProvider {

	@Override
	protected void buildMap(EClassToEStructuralFeatureMap map) {
		super.buildMap(map);
		map.mapTo(LIBRARY,
				LIBRARY__NAME, ADDRESSABLE__ADDRESS);
		map.mapTo(PERSON,
				PERSON__FIRST_NAME, PERSON__LAST_NAME,
				ADDRESSABLE__ADDRESS);
		map.mapTo(WRITER,
				PERSON__FIRST_NAME, PERSON__LAST_NAME,
				WRITER__BOOKS);
	}

}
