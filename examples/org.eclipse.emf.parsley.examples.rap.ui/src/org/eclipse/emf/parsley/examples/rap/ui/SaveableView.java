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
package org.eclipse.emf.parsley.examples.rap.ui;

import org.eclipse.emf.parsley.views.AbstractSaveableTreeFormView;

import org.eclipse.emf.common.util.URI;

public class SaveableView extends AbstractSaveableTreeFormView {
	public static final String ID = "org.eclipse.emf.parsley.examples.rap.ui.saveableview";

	@Override
	protected URI createResourceURI() {
		return URI.createFileURI(System.getProperty("java.io.tmpdir")
				+ "/My.model");
	}
}