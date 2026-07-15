/*******************************************************************************
 * Copyright (c) 2015 RCP Vision (http://www.rcp-vision.com) and others.
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
package org.eclipse.emf.parsley.validation;

import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;

/**
 * Reports EMF validation issues
 *
 * @author Lorenzo Bettini - initial API and implementation
 *
 */
public interface IssueReporter {

	/**
	 * This method should report the diagnostics, possibly after
	 * filtering, and return the list of the reported diagnostics.
	 *
	 * @param diagnostic
	 * @return
	 */
	List<Diagnostic> report(Diagnostic diagnostic);
}
