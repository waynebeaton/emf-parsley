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

import static org.eclipse.emf.parsley.examples.library.EXTLibraryPackage.Literals.LENDABLE;
import static org.eclipse.emf.parsley.examples.library.EXTLibraryPackage.Literals.LENDABLE__COPIES;

import org.eclipse.emf.parsley.examples.library.Periodical;
import org.eclipse.emf.parsley.tests.models.testmodels.TestmodelsPackage;
import org.eclipse.emf.parsley.ui.provider.EClassToEStructuralFeatureAsStringsMap;
import org.eclipse.emf.parsley.ui.provider.FeaturesProvider;


/**
 * @author Lorenzo Bettini
 * 
 */
public class TestFeaturesProvider extends FeaturesProvider {

	@Override
	protected void buildMap(EClassToEStructuralFeatureMap map) {
		super.buildMap(map);
		map.mapTo(LENDABLE, LENDABLE__COPIES);
	}

	@Override
	protected void buildStringMap(
			EClassToEStructuralFeatureAsStringsMap stringMap) {
		super.buildStringMap(stringMap);
		stringMap.mapTo(Periodical.class.getName(), "title");
		// the actual feature's name is UpperCaseNameFeature
		// but we specify it with the initial lowercase
		addToStringMap(TestmodelsPackage.eINSTANCE.getTestEClass(), 
				"upperCaseNameFeature");
	}
}
