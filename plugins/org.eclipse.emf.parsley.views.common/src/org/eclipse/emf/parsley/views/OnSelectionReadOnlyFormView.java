/*******************************************************************************
 * Copyright (c) 2013 RCP Vision (http://www.rcp-vision.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 * Lorenzo Bettini - Initial contribution and API
 ******************************************************************************
 * SPDX-License-Identifier: EPL-2.0
*/
package org.eclipse.emf.parsley.views;

import org.eclipse.emf.parsley.composite.FormDetailComposite;
import org.eclipse.swt.SWT;

/**
 * @author Lorenzo Bettini - Initial contribution and API
 *
 */
public class OnSelectionReadOnlyFormView extends OnSelectionFormView {

	@Override
	protected FormDetailComposite createFormDetailComposite() {
		return formFactory.createFormDetailReadOnlyComposite(
				parent, SWT.NONE);
	}
}
