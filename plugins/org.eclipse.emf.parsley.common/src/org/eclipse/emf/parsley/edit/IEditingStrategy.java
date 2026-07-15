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

package org.eclipse.emf.parsley.edit;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;

/**
 * Represents the strategy for preparing an {@link EObject} for editing
 * and for updating it.
 *
 * @author Lorenzo Bettini - Initial contribution and API
 *
 */
public interface IEditingStrategy {

	void prepare(EObject original);

	void update(EObject edited);

	void rollback(EObject edited);

	EditingDomain getEditingDomain(EObject edited);
}
