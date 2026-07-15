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

package org.eclipse.emf.parsley.dialogs;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.parsley.composite.AbstractDetailComposite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

import com.google.inject.Inject;

/**
 * @author Lorenzo Bettini - Initial contribution and API
 */
public class DetailDialog extends AbstractDetailDialog {

	@Inject
	private DialogFactory dialogFactory;

	public DetailDialog(Shell parentShell, String title, EObject original,
			EditingDomain domain) {
		super(parentShell, title, original, domain);
	}

	@Override
	protected AbstractDetailComposite createDetailComposite(Composite composite) {
		return dialogFactory.createDialogDetailComposite(composite, SWT.NONE);
	}

}
