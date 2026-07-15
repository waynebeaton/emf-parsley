/*******************************************************************************
 * Copyright (c) 2014 RCP Vision (http://www.rcp-vision.com) and others.
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
package org.eclipse.emf.parsley.junit4.ui.util;

/**
 * A runnable that returns an object of type T.
 *
 * @author Lorenzo Bettini
 *
 */
public interface RunnableWithResult<T> {
	/**
	 * @return an object of type T.
	 */
	T run();
}
