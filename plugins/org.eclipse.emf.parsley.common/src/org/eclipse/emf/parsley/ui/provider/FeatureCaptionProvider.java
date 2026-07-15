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
package org.eclipse.emf.parsley.ui.provider;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.parsley.runtime.util.PolymorphicDispatcherExtensions;

/**
 * Provides captions for EStructuralFeatures that uses polymorphic dispatch to
 * invoke methods at runtime. If you define methods with a specific signature
 * convention, the framework will select the correct implementation depending on
 * runtime type of the input. You can defines methods with a prefix 'text'
 * followed by the EClass and EStructuralFeature names separated by an
 * underscore character, like in the example:
 *
 * <pre>
 * {@code
 *    public String text_MyClass_myFeature(EStructuralFeature feature)
 * }
 * </pre>
 *
 * @author Lorenzo Bettini - Initial Contribution and API
 * @author Francesco Guidieri - Javadocs
 */
public class FeatureCaptionProvider {

	public String getText(EClass eClass, EStructuralFeature feature) {
		String text = polymorphicGetText(eClass, feature);
		if (text != null) {
			return text;
		}
		return defaultText(feature);
	}

	protected String polymorphicGetText(EClass eClass, EStructuralFeature feature) {
		return PolymorphicDispatcherExtensions.
			<String>polymorphicInvokeBasedOnFeature
				(this, eClass, feature, "text_", feature);
	}

	protected String defaultText(EStructuralFeature feature) {
		return feature.getName();
	}
}
