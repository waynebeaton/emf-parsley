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

import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPart;

/**
 * Utility methods to retrieve action bars from a part and site
 *
 * @author Lorenzo Bettini
 *
 */
public class ActionBarsUtils {

	private ActionBarsUtils() {
	}

	public static IActionBars getActionBars(IWorkbenchPart part) {
		if (part instanceof IViewPart) {
			return ((IViewPart) part).getViewSite().getActionBars();
		} else if (part instanceof IEditorPart) {
			return ((IEditorPart) part).getEditorSite().getActionBars();
		}
		return null;
	}
}
