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

package org.eclipse.emf.parsley.composite;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.swt.widgets.Control;

/**
 * @author Lorenzo Bettini
 *
 */
public class ControlObservablePair {

	protected Control control;

	@SuppressWarnings("rawtypes")
	protected IObservableValue observableValue;

	public ControlObservablePair() {
	}

	@SuppressWarnings("rawtypes")
	public ControlObservablePair(Control control, IObservableValue observableValue) {
		this.control = control;
		this.observableValue = observableValue;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}

	@SuppressWarnings("rawtypes")
	public IObservableValue getObservableValue() {
		return observableValue;
	}

	@SuppressWarnings("rawtypes")
	public void setObservableValue(IObservableValue observableValue) {
		this.observableValue = observableValue;
	}

}
