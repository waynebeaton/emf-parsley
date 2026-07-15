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
 *     Lorenzo Bettini - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.parsley.ui.provider;

import org.eclipse.emf.edit.command.SetCommand;

/**
 * Specialization for a combo that also provides a null element for unset a
 * reference.
 *
 * @author Lorenzo Bettini - initial API and implementation
 *
 */
public class ComboViewerLabelProvider extends DelegatingColumnLabelProvider {

	@Override
	public String getText(Object element) {
		if (element == SetCommand.UNSET_VALUE) {
			return "";
		}
		return super.getText(element);
	}
}
