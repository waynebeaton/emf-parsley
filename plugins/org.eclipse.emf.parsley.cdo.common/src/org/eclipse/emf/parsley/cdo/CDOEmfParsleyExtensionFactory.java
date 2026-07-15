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
package org.eclipse.emf.parsley.cdo;

import org.eclipse.emf.parsley.EmfParsleyExtensionFactory;
import org.eclipse.emf.parsley.EmfParsleyGuiceModule;

/**
 * @author Lorenzo Bettini - initial API and implementation
 *
 */
public class CDOEmfParsleyExtensionFactory extends
		EmfParsleyExtensionFactory {

	@Override
	protected EmfParsleyGuiceModule getModule() {
		return new CDOEmfParsleyModule(EmfParsleyCDOActivator.getDefault());
	}




}
