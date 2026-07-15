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

import org.eclipse.emf.common.ui.dialogs.DiagnosticDialog;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.ui.PlatformUI;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

/**
 * Reports error issues using a {@link DiagnosticDialog}.
 *
 * @author Lorenzo Bettini - initial API and implementation
 *
 */
public class DialogErrorReporter implements IssueReporter {

	@Inject
	private DiagnosticUtil diagnosticUtil;

	@Override
	public List<Diagnostic> report(Diagnostic diagnostic) {
		List<Diagnostic> errors = Lists.newArrayList(diagnosticUtil.errors(diagnostic));

		if (!errors.isEmpty()) {
			DiagnosticDialog.open(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Validation Errors",
					"Problems encountered during validation", diagnostic, Diagnostic.ERROR);
		}

		return errors;
	}

}
