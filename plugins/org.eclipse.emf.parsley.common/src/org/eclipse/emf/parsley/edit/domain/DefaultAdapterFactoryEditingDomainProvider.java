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
package org.eclipse.emf.parsley.edit.domain;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * @author Lorenzo Bettini - Initial contribution and API
 *
 */
public class DefaultAdapterFactoryEditingDomainProvider implements Provider<AdapterFactoryEditingDomain> {

	@Inject
	protected Provider<AdapterFactory> adapterFactoryProvider;

	@Override
	public AdapterFactoryEditingDomain get() {
		return new InjectableAdapterFactoryEditingDomain(adapterFactoryProvider.get());
	}

}
