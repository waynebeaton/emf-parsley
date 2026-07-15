/*******************************************************************************
 * Copyright (c) 2009, 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *   itemis AG - Initial API and implementation
 *   Lorenzo Bettini - refactoring for EmfParsley
 ******************************************************************************
 * SPDX-License-Identifier: EPL-2.0
*/
package org.eclipse.emf.parsley.composite;

import org.eclipse.core.databinding.observable.value.AbstractObservableValue;
import org.eclipse.core.databinding.observable.value.ValueDiff;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;

/**
 * @author Dennis Huebner - Initial contribution and API
 * @author Lorenzo Bettini - Refactoring and adaptations
 */
@SuppressWarnings("rawtypes")
public class MultipleFeatureControlObservable extends AbstractObservableValue implements ISelectionChangedListener {

	private final MultipleFeatureControl mfc;

	public MultipleFeatureControlObservable(MultipleFeatureControl mfc) {
		this.mfc = mfc;
		mfc.getInternalSelectionProvider().addSelectionChangedListener(this);
	}

	@Override
	protected Object doGetValue() {
		return mfc.getValue();
	}

	@Override
	protected void doSetValue(Object value) {
		mfc.setValue(value);
	}

	@Override
	public Object getValueType() {
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void selectionChanged(final SelectionChangedEvent event) {
		fireValueChange(new ValueDiff() {

			@Override
			public Object getOldValue() {
				return null;
			}

			@Override
			public Object getNewValue() {
				return ((IStructuredSelection) event.getSelection()).toList();
			}
		});
	}

}
