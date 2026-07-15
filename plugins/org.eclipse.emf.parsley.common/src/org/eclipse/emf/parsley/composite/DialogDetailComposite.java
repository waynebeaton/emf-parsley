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
package org.eclipse.emf.parsley.composite;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import com.google.inject.Inject;

public class DialogDetailComposite extends AbstractDetailComposite {

	@Inject
	private DialogControlFactory dialogControlFactory;

	public DialogDetailComposite(Composite parent, int style) {
		super(parent, style);

		setLayout(new GridLayout(2, false));
	}

	@Override
	protected void initControlFactory(EditingDomain domain, EObject model) {
		dialogControlFactory.init(domain, model, this);
	}

	@Override
	protected void createControlForFeature(EClass eClass, EStructuralFeature feature) {
		dialogControlFactory.createEditingField(feature);
	}

}
