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

import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;

/**
 * This ensures that only one instance of {@link AdapterFactoryEditingDomain}
 * will be used in the same JVM.
 *
 * @author Lorenzo Bettini - Initial contribution and API
 *
 */
public class GlobalAdapterFactoryEditingDomainProvider extends DefaultAdapterFactoryEditingDomainProvider {

	private static AdapterFactoryEditingDomain singleton;

	@Override
	public AdapterFactoryEditingDomain get() {
		if (singleton == null) {
			singleton = super.get(); // NOSONAR we have to use a static field in an instance method
		}
		return singleton;
	}

}
