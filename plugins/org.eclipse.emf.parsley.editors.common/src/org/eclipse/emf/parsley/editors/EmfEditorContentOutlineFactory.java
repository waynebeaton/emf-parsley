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
package org.eclipse.emf.parsley.editors;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * @author Lorenzo Bettini
 *
 */
public class EmfEditorContentOutlineFactory {


	@Inject
	protected Provider<EmfEditorContentOutlinePage> outlinePageProvider;

	public EmfEditorContentOutlinePage create(EmfAbstractEditor editor) {
		EmfEditorContentOutlinePage outlinePage = outlinePageProvider.get();
		outlinePage.init(editor);
		return outlinePage;
	}
}
