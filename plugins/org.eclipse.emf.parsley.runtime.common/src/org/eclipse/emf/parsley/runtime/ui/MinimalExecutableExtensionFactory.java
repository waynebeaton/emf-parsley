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
 * Lorenzo Bettini - Initial contribution and API
 *******************************************************************************/
package org.eclipse.emf.parsley.runtime.ui;

import static com.google.inject.Guice.createInjector;

import org.eclipse.emf.parsley.runtime.service.AbstractGenericModule;

import com.google.inject.Injector;

/**
 * @author Lorenzo Bettini
 *
 */
public abstract class MinimalExecutableExtensionFactory extends
		AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Injector getInjector() {
		return createInjector(getModule());
	}

	protected abstract AbstractGenericModule getModule();

}
