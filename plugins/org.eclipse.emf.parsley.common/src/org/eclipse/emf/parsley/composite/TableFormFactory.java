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


import org.eclipse.emf.ecore.EClass;
import org.eclipse.swt.widgets.Composite;

import com.google.inject.Inject;
import com.google.inject.MembersInjector;

/**
 * @author Lorenzo Bettini
 *
 */
public class TableFormFactory {

	@Inject
	private MembersInjector<TableFormComposite> tableFormCompositeMembersInjector;

	@Inject
	public TableFormFactory() {
		// nothing to do
	}

	public TableFormComposite createTableFormMasterDetailComposite(Composite parent, int style, EClass type) {
		TableFormComposite tableFormComposite = new TableFormComposite(parent, style);
		tableFormCompositeMembersInjector.injectMembers(tableFormComposite);
		tableFormComposite.buildTable(type);
		return tableFormComposite;
	}

}
