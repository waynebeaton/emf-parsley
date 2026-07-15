/*******************************************************************************
 * Copyright (c) 2016 RCP Vision (http://www.rcp-vision.com) and others.
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

/**
 * The editing domain is preset and never changed; it is assumed that the
 * editing domain is explicitly set after the creation of an instance of this
 * class.
 *
 * @author Lorenzo Bettini - initial API and implementation
 *
 */
public class EditingDomainPresetStrategy extends EditingDomainFinderStrategy {

	@Override
	public void updateEditingDomain(Object object) {
		// no update, the editing domain is never changed once initialized
	}

}
