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
package org.eclipse.emf.parsley.resource;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author Lorenzo Bettini
 *
 */
public class LoadResourceResponse {

	protected Resource resource;

	protected Exception exception;

	public LoadResourceResponse(Resource resource, Exception exception) {
		super();
		this.resource = resource;
		this.exception = exception;
	}

	public Resource getResource() {
		return resource;
	}

	public Exception getException() {
		return exception;
	}

}
