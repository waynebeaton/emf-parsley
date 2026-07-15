/*******************************************************************************
 * Copyright (c) 2015 RCP Vision (http://www.rcp-vision.com) and others.
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
package org.eclipse.emf.parsley.resource;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;

import com.google.inject.Inject;

/**
 * Strategy for saving a {@link Resource}
 *
 * @author Lorenzo Bettini
 *
 */
public class ResourceSaveStrategy {

	@Inject
	private ResourceManager resourceManager;

	/**
	 * Simply delegates saving to the {@link ResourceManager}.
	 *
	 * @param resource
	 * @return
	 * @throws IOException
	 */
	public boolean save(Resource resource) throws IOException {
		return resourceManager.save(resource);
	}
}
