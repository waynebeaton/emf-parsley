/*******************************************************************************
 * Copyright (c) 2015 RCP Vision (http://www.rcp-vision.com) and others.
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
package org.eclipse.emf.parsley.viewers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.ColumnViewer;

import com.google.inject.Inject;
import com.google.inject.MembersInjector;

/**
 * Factory for {@link TableViewerEditingSupport}.
 *
 * @author Lorenzo Bettini - Initial contribution and API
 *
 */
class TableViewerEditingSupportFactory {

	@Inject
	private MembersInjector<TableViewerEditingSupport> membersInjector;

	public TableViewerEditingSupport createTableViewerEditingSupport(ColumnViewer viewer,
			EStructuralFeature eStructuralFeature) {
		TableViewerEditingSupport editingSupport = new TableViewerEditingSupport(viewer, eStructuralFeature);
		membersInjector.injectMembers(editingSupport);
		return editingSupport;
	}

}