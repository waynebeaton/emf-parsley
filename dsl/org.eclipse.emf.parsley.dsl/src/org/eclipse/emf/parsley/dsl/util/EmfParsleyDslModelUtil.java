/**
 * Copyright (c) 2013 RCP Vision (http://www.rcp-vision.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * Contributors:
 * Lorenzo Bettini - initial API and implementation
 * SPDX-License-Identifier: EPL-2.0
*/
package org.eclipse.emf.parsley.dsl.util;

import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.parsley.dsl.model.EmfFeatureAccess;

public class EmfParsleyDslModelUtil {

	private EmfParsleyDslModelUtil() {
		// only static utility methods
	}

	public static EmfFeatureAccess containingEmfFeatureAccess(final EObject o) {
		return getContainerOfType(o, EmfFeatureAccess.class);
	}

	public static org.eclipse.emf.parsley.dsl.model.Module containingModule(final EObject o) {
		return getContainerOfType(o,
				org.eclipse.emf.parsley.dsl.model.Module.class);
	}
}
