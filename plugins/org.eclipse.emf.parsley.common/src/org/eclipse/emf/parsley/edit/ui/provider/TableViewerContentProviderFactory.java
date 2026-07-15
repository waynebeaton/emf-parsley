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
package org.eclipse.emf.parsley.edit.ui.provider;

import org.eclipse.emf.ecore.EClass;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * Factory methods to create specific {@link TableViewerContentProvider}.
 *
 * @author Lorenzo Bettini - Initial contribution and API
 *
 */
public class TableViewerContentProviderFactory {

	@Inject
	private Provider<TableViewerContentProvider> provider;

	public TableViewerContentProvider createTableViewerContentProvider(EClass type) {
		TableViewerContentProvider contentProvider = provider.get();
		contentProvider.setEClass(type);
		return contentProvider;
	}
}
