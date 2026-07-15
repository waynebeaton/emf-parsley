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
 * Lorenzo Bettini - Initial contribution and API
 *******************************************************************************/
package org.eclipse.emf.parsley.views;

import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

/**
 * A View that visualizes the tree of an emf selected resource (it also acts as
 * a selection provider).
 *
 * @author Lorenzo Bettini
 *
 */
public class OnSelectionTreeView extends AbstractOnSelectionViewerView {

	private TreeViewer treeViewer;

	public OnSelectionTreeView() {
		// nothing to do
	}

	@Override
	public StructuredViewer getViewer() {
		return treeViewer;
	}

	@Override
	protected void createViewer(Composite parent) {
		treeViewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
	}
}
