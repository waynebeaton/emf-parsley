/*******************************************************************************
 * Copyright (c) 2016 RCP Vision (http://www.rcp-vision.com) and others.
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
package org.eclipse.emf.parsley.views;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.parsley.config.Configurator;

import com.google.inject.Inject;

/**
 * This implements the abstract methods by delegating to an injected
 * {@link Configurator}.
 *
 * @author Lorenzo Bettini - Initial contribution and API
 *
 */
public class SaveableTreeWithColumnsView extends AbstractSaveableTreeWithColumnsView {

	@Inject
	private Configurator configurator;

	@Override
	protected URI createResourceURI() {
		return configurator.createResourceURI(this);
	}

	@Override
	protected EClass getEClass() {
		return configurator.getEClass(this);
	}

}
