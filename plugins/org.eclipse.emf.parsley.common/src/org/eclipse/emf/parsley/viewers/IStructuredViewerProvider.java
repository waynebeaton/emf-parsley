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
package org.eclipse.emf.parsley.viewers;

import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.jface.viewers.StructuredViewer;

/**
 * Common interfaces for objects that provide a {@link StructuredViewer}
 *
 * @author Lorenzo Bettini - Initial contribution and API
 *
 */
public interface IStructuredViewerProvider extends IViewerProvider {

	@Override
	StructuredViewer getViewer();

}
