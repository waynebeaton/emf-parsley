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
package org.eclipse.emf.parsley.tests.swtbot.labeling;


import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.parsley.ui.provider.FormFeatureCaptionProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.IFormColors;

/**
 * Note that we will bind also a {@link CustomLibraryFeatureCaptionProvider} so we
 * will use automatically also its customizations.
 * 
 * @author Lorenzo Bettini
 * 
 */
public class CustomLibraryFormFeatureCaptionProvider extends
		FormFeatureCaptionProvider {

	/**
	 * This will have the precedence over the one in
	 * {@link CustomLibraryFeatureCaptionProvider}
	 */
	public String text_Person_lastName(EStructuralFeature feature) {
		return "Last name";
	}

	public Label label_Writer_name(Composite parent, EStructuralFeature feature) {
		Label label = defaultLabel(parent, feature.getEContainingClass(), feature);
		label.setBackground(getFormToolkit().getColors().getColor(
				IFormColors.TITLE));
		return label;
	}
}
