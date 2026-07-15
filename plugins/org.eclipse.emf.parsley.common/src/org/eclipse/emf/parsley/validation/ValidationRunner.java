/*******************************************************************************
 * Copyright (c) 2015 RCP Vision (http://www.rcp-vision.com) and others.
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
package org.eclipse.emf.parsley.validation;

import java.util.List;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EObjectValidator;

import com.google.inject.Inject;

/**
 * Executes EMF Validation.
 *
 * @author Lorenzo Bettini - initial API and implementation
 *
 */
public class ValidationRunner {

	@Inject
	private Diagnostician diagnostician;

	/**
	 * Validates, reports diagnostics through the passed {@link IssueReporter}
	 * and returns the list of reported diagnostics.
	 *
	 * @param eObject
	 * @param reporter
	 * @return
	 */
	public List<Diagnostic> validate(EObject eObject, IssueReporter reporter) {
		return reporter.report(validate(eObject));
	}

	public Diagnostic validate(EObject eObject) {
		return diagnostician.validate(eObject);
	}

	/**
	 * Validates, reports diagnostics through the passed {@link IssueReporter}
	 * and returns the list of reported diagnostics.
	 *
	 * @param resource
	 * @param reporter
	 * @return
	 */
	public List<Diagnostic> validate(Resource resource, IssueReporter reporter) {
		return reporter.report(validate(resource));
	}

	/**
	 * Validates the passed {@link Resource} by calling {@link Diagnostician#validate(EObject)} on
	 * all the root contents of the resource (this will trigger validation on all the contents
	 * of the resource).
	 *
	 * @param resource
	 * @return
	 */
	public Diagnostic validate(Resource resource) {
		BasicDiagnostic diagnosticChain = new BasicDiagnostic(EObjectValidator.DIAGNOSTIC_SOURCE, 0,
				"Validation of resource " + resource.toString(), null);
		for (EObject root : resource.getContents()) {
			diagnostician.validate(root, diagnosticChain);
		}
		return diagnosticChain;
	}

}
