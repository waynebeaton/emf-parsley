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
package org.eclipse.emf.parsley.examples.mail.accountsview.unifiedfolders;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * Acts as a container for folder; this is not part of the mail model but we can
 * represent it in a view.
 * 
 * @author Lorenzo Bettini
 * 
 */
public class UnifiedFolderContainer {

	private String containerName;
	private Resource resource;

	public UnifiedFolderContainer(String containerName, Resource resource) {
		super();
		this.containerName = containerName;
		this.resource = resource;
	}

	public String getContainerName() {
		return containerName;
	}

	public void setContainerName(String containerName) {
		this.containerName = containerName;
	}

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

}
