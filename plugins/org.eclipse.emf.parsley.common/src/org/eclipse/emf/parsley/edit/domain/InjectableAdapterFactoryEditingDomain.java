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
package org.eclipse.emf.parsley.edit.domain;

import java.util.HashMap;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;

import com.google.inject.Inject;

/**
 * @author Lorenzo Bettini
 *
 *         Injectable {@link AdapterFactoryEditingDomain}
 */
public class InjectableAdapterFactoryEditingDomain extends
		AdapterFactoryEditingDomain {

	@Inject
	public InjectableAdapterFactoryEditingDomain(AdapterFactory adapterFactory) {
		super(adapterFactory, new BasicCommandStack(),
				new HashMap<>());

		// in the future we might try and computePlatformURIMap
		// using the target platform.
		getResourceSet().getURIConverter().getURIMap()
				.putAll(EcorePlugin.computePlatformURIMap(false));
	}
}
