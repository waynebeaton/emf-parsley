/*******************************************************************************
 * Copyright (c) 2016 RCP Vision (http://www.rcp-vision.com) and others.
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
package org.eclipse.emf.parsley.edit.domain;

import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;

import com.google.inject.Singleton;

/**
 * This ensures that only one instance of {@link AdapterFactoryEditingDomain}
 * will be used by the same injector (according to the semantics of
 * {@link Singleton}).
 *
 * @author Lorenzo Bettini - Initial contribution and API
 *
 */
@Singleton
public class SingletonAdapterFactoryEditingDomainProvider extends DefaultAdapterFactoryEditingDomainProvider {

	private AdapterFactoryEditingDomain singleton;

	@Override
	public AdapterFactoryEditingDomain get() {
		if (singleton == null) {
			singleton = super.get();
		}
		return singleton;
	}
}
