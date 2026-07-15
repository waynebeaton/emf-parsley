/*******************************************************************************
 * Copyright (c) 2013 RCP Vision (http://www.rcp-vision.com) and others.
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
package org.eclipse.emf.parsley.tests.swtbot.factories;

import org.eclipse.emf.parsley.EmfParsleyGuiceModule;
import org.eclipse.emf.parsley.edit.UndoableEditingStrategy;
import org.eclipse.emf.parsley.edit.IEditingStrategy;
import org.eclipse.emf.parsley.listeners.IEditorMouseListener;
import org.eclipse.emf.parsley.listeners.OpenDialogMouseAdapter;
import org.eclipse.emf.parsley.tests.swtbot.activator.EmfParsleySwtBotTestsActivator;



/**
 * The editing takes place on a copy of the object.
 * 
 * @author Lorenzo Bettini
 * 
 */
public class UndoableEditingStrategyExecutableExtensionFactory extends
		EmfParsleyTestsExecutableExtensionFactory {

	@Override
	protected EmfParsleyGuiceModule getModule() {
		return new EmfParsleyGuiceModule(
				EmfParsleySwtBotTestsActivator.getDefault()) {
			
			@Override
			public Class<? extends IEditorMouseListener> bindIEditorMouseListener() {
				return OpenDialogMouseAdapter.class;
			}

			@Override
			public Class<? extends IEditingStrategy> bindIEditingStrategy() {
				return UndoableEditingStrategy.class;
			}

		};
	}

}
