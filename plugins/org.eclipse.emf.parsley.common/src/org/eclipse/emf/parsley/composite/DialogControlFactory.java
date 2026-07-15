/**
 * <copyright>
 *
 * Copyright (c) 2008, 2013 itemis AG and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *   itemis AG - Initial API and implementation
 *   Lorenzo Bettini - refactoring for EmfParsley
 *
 * </copyright>
 *
 * SPDX-License-Identifier: EPL-2.0
*/
package org.eclipse.emf.parsley.composite;

import org.eclipse.emf.parsley.ui.provider.DialogFeatureCaptionProvider;
import org.eclipse.emf.parsley.ui.provider.FeatureLabelCaptionProvider;
import org.eclipse.emf.parsley.widgets.DialogWidgetFactory;
import org.eclipse.emf.parsley.widgets.IWidgetFactory;
import org.eclipse.swt.widgets.Composite;

import com.google.inject.Inject;

/**
 * An implementation specific for dialogs.
 *
 * @author Dennis Huebner initial code
 * @author Lorenzo Bettini refactoring for EmfParsley
 *
 */
public class DialogControlFactory extends AbstractControlFactory {

	@Inject
	private DialogWidgetFactory dialogWidgetFactory;

	@Inject
	private DialogFeatureCaptionProvider dialogFeatureCaptionProvider;

	@Override
	protected IWidgetFactory createWidgetFactory() {
		return dialogWidgetFactory;
	}

	@Override
	public void init(Composite parent) {
		dialogWidgetFactory.init(parent);
	}

	@Override
	protected FeatureLabelCaptionProvider createFeatureLabelCaptionProvider() {
		return dialogFeatureCaptionProvider;
	}
}
