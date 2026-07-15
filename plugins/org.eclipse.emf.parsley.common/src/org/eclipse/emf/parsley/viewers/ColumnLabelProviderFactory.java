/*******************************************************************************
 * Copyright (c) 2013 RCP Vision (http://www.rcp-vision.com) and others.
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
package org.eclipse.emf.parsley.viewers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.parsley.ui.provider.TableColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * @author Lorenzo Bettini, Francesco Guidieri
 *
 *         factory for ColumnLabelProvider
 *
 */
public class ColumnLabelProviderFactory {

	@Inject
	private Provider<TableColumnLabelProvider> tableColumnProviderProvider;

	public ColumnLabelProvider createColumnLabelProvider(EStructuralFeature eStructuralFeature) {
		TableColumnLabelProvider columnProvider = tableColumnProviderProvider.get();
		columnProvider.seteStructuralFeature(eStructuralFeature);
		return columnProvider;
	}

}
