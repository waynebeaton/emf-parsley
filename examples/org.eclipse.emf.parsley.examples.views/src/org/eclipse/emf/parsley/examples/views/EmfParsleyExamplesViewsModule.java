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
package org.eclipse.emf.parsley.examples.views;


import org.eclipse.emf.parsley.EmfParsleyGuiceModule;
import org.eclipse.emf.parsley.viewers.TableViewerColumnBuilder;
import org.eclipse.emf.parsley.viewers.TableViewerEditableColumnBuilder;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class EmfParsleyExamplesViewsModule extends EmfParsleyGuiceModule {

	public EmfParsleyExamplesViewsModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	@Override
	public Class<? extends TableViewerColumnBuilder> bindTableViewerColumnBuilder() {
		return TableViewerEditableColumnBuilder.class;
	}


}
