/*******************************************************************************
s * Copyright (c) 2013 RCP Vision (http://www.rcp-vision.com) and others.
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
package org.eclipse.emf.parsley.editors;


import org.eclipse.emf.parsley.viewers.ViewerFactory;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.IPageSite;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;

import com.google.inject.Inject;

/**
 * @author Lorenzo Bettini
 *
 */
public class EmfEditorContentOutlinePage extends ContentOutlinePage {

	protected EmfAbstractEditor editor;

	@Inject
	protected ViewerFactory viewerFactory;

	public void init(EmfAbstractEditor editor) {
		this.editor = editor;
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);

		TreeViewer contentOutlineViewer = getTreeViewer();

		// Set up the tree viewer.
		viewerFactory.initialize(contentOutlineViewer,
				editor.getEditingDomain());
		// Make sure our popups work.
		editor.createContextMenuFor(contentOutlineViewer);
		// select the root
		editor.setSelectionOnRoot(contentOutlineViewer);
	}

	@Override
	public void init(IPageSite pageSite) {
		super.init(pageSite);
		editor.getActionBarContributor().shareGlobalActions(this,
				pageSite.getActionBars());
	}

}
