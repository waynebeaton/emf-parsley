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
package org.eclipse.emf.parsley.util;

import static org.eclipse.emf.parsley.util.EmfParsleyUtil.getEObjectOrNull;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;

/**
 * Utility methods for retrieving EMF stuff from {@link ISelection}
 *
 * @author Lorenzo Bettini - Initial contribution and API
 */
public class EmfSelectionHelper {

	public Object getFirstSelectedElement(ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ss = (IStructuredSelection) selection;
			return ss.getFirstElement();
		}
		return null;
	}

	public EObject getFirstSelectedEObject(ISelection selection) {
		Object selected = getFirstSelectedElement(selection);
		return getEObjectOrNull(selected);
	}

}
