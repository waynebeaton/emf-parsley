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


import org.eclipse.swt.widgets.Composite;

import com.google.inject.Inject;
import com.google.inject.MembersInjector;

/**
 * @author Lorenzo Bettini - Initial contribution and API
 *
 */
public class FormFactory {

	@Inject
	protected MembersInjector<FormDetailComposite> formDetailCompositeMembersInjector;

	@Inject
	protected MembersInjector<FormDetailReadOnlyComposite> formDetailReadOnlyCompositeMembersInjector;

	@Inject
	public FormFactory() {
		// nothing to do
	}

	public FormDetailComposite createFormDetailComposite(Composite parent,
			int style) {
		FormDetailComposite formDetailComposite = new FormDetailComposite(parent, style);
		formDetailCompositeMembersInjector.injectMembers(formDetailComposite);
		return formDetailComposite;
	}

	public FormDetailReadOnlyComposite createFormDetailReadOnlyComposite(Composite parent,
			int style) {
		FormDetailReadOnlyComposite formDetailComposite = new FormDetailReadOnlyComposite(parent, style);
		formDetailReadOnlyCompositeMembersInjector.injectMembers(formDetailComposite);
		return formDetailComposite;
	}

}
