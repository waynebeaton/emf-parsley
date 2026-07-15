/*******************************************************************************
 * Copyright (c) 2013 RCP Vision (http://www.rcp-vision.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 * Francesco Guidieri - Initial contribution and API
 ******************************************************************************
 * SPDX-License-Identifier: EPL-2.0
*/
package org.eclipse.emf.parsley.views;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.parsley.composite.TableFormComposite;
import org.eclipse.emf.parsley.composite.TableFormFactory;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import com.google.inject.Inject;

/**
 * @author Francesco Guidieri - Initial contribution and API
 * @author Lorenzo Bettini - aligned to {@link AbstractSaveableTableView}
 *
 */
public abstract class AbstractSaveableTableFormView extends AbstractSaveableViewerView {

	@Inject
	private TableFormFactory tableFormFactory;

	private TableFormComposite tableFormComposite;

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);

		tableFormComposite = tableFormFactory
			.createTableFormMasterDetailComposite(parent, SWT.BORDER, getEClass());
		tableFormComposite.update(getResource());

		afterCreateViewer();
	}

	@Override
	public void setFocus() {
		tableFormComposite.setFocus();
	}

	@Override
	public StructuredViewer getViewer() {
		return tableFormComposite.getViewer();
	}

	/**
	 * @return the {@link EClass} for objects to be shown in the table
	 */
	protected abstract EClass getEClass();

}
