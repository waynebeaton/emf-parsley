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
 * Francesco Guidieri - Initial contribution and API
 *******************************************************************************/
package org.eclipse.emf.parsley.runtime.exception;

/**
 * A {@link RuntimeException} that can be thrown during the reflective
 * operations that are done on plugins.
 *
 * @author Francesco Guidieri - Initial contribution and API
 */
public class PluginConfigurationException extends RuntimeException {

	private static final long serialVersionUID = 6353093444599316450L;

	public PluginConfigurationException(String message, Throwable cause) {
		super(message, cause);
	}

}
