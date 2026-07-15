/*******************************************************************************
 * Copyright (c) 2016 RCP Vision (http://www.rcp-vision.com) and others.
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
package org.eclipse.emf.parsley.internal.databinding;

import static com.google.common.collect.Iterables.contains;
import static com.google.common.collect.Iterables.filter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator.SubstitutionLabelProvider;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.parsley.ui.provider.FeatureLabelCaptionProvider;
import org.eclipse.emf.parsley.validation.DiagnosticUtil;
import org.eclipse.jface.viewers.ILabelProvider;

import com.google.inject.Inject;

/**
 * Some utilities for validation used in databinding.
 *
 * @author Lorenzo Bettini - initial API and implementation
 *
 * @noextend This class is not intended to be subclassed by clients.
 * @noinstantiate This class is not intended to be instantiated by clients.
 */
public class DatabindingValidationUtil {

	@Inject
	private Diagnostician diagnostician;

	@Inject
	private DiagnosticUtil diagnosticUtil;

	@Inject
	private ILabelProvider labelProvider;

	@Inject
	private FeatureLabelCaptionProvider featureLabelCaptionProvider;

	/**
	 * Retrieves the {@link Diagnostic} for the specified object and related to
	 * the specified feature.
	 *
	 * @param eObject
	 * @param feature
	 * @param context
	 * @return
	 */
	public Iterable<Diagnostic> getDiagnostic(final EObject eObject, final EStructuralFeature feature) {
		Map<Object, Object> context = new HashMap<>();
		context.put(SubstitutionLabelProvider.class,
			new DatabindingSubstitutionLabelProvider(eObject, labelProvider, featureLabelCaptionProvider));
		List<Diagnostic> diagnostics = diagnosticUtil.flatten(diagnostician.validate(eObject, context));
		return filter(diagnostics, d -> contains(d.getData(), feature));
	}
}
