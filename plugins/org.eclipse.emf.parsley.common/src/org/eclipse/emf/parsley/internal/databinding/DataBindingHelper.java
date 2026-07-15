/*******************************************************************************
 * Copyright (c) 2016 RCP Vision (http://www.rcp-vision.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public
 * License v2.0 which accompanies this distribution, and is
 * available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 * Francesco Guidieri - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.parsley.internal.databinding;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.swt.SWT;

import com.google.inject.Inject;

/**
 * Helper class for performing databinding
 *
 * @author Francesco Guidieri - initial API and implementation
 *
 * @noextend This class is not intended to be subclassed by clients.
 * @noinstantiate This class is not intended to be instantiated by clients.
 * @since 1.1
 */
public class DataBindingHelper {

	@Inject
	private DatabindingValidationUtil databindingValidationUtil;

	@SuppressWarnings("rawtypes")
	public Binding bindValue(EStructuralFeature feature, IObservableValue target, IObservableValue source,
			EObject owner, DataBindingContext dataBindingContext) {
		EmfValidationTargetToModelUpdateValueStrategy targetToModelUpdateValueStrategy = new EmfValidationTargetToModelUpdateValueStrategy(
				owner, feature, databindingValidationUtil);

		@SuppressWarnings("unchecked")
		Binding bindValue = dataBindingContext.bindValue(target, source, targetToModelUpdateValueStrategy, null);
		ControlDecorationSupport.create(bindValue, SWT.TOP | SWT.LEFT);
		return bindValue;
	}

}
