/*******************************************************************************
 * Copyright (c) 2013 RCP Vision (http://www.rcp-vision.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public
 * License v2.0 which accompanies this distribution, and is
 * available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0ù
 *
 * Contributors:
 * Lorenzo Bettini - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.parsley.composite;

import org.eclipse.core.databinding.observable.value.AbstractObservableValue;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Text;

/**
 * To perform data binding between a Text and an EObject (representing
 * a reference)
 *
 * @author Lorenzo Bettini - Initial contribution and API
 *
 */
@SuppressWarnings("rawtypes")
public class EObjectTextObservable extends AbstractObservableValue {

	private ILabelProvider labelProvider;

	private Text text;

	private EObject current;

	public EObjectTextObservable(ILabelProvider labelProvider, Text text) {
		super();
		this.labelProvider = labelProvider;
		this.text = text;
	}

	@Override
	public Object getValueType() {
		return null;
	}

	@Override
	protected Object doGetValue() {
		return current;
	}

	@Override
	protected void doSetValue(Object value) {
		if (!(value instanceof EObject)) {
			return;
		}

		current = (EObject) value;

		text.setText(labelProvider.getText(current));
	}

}
