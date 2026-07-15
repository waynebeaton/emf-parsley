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
package org.eclipse.emf.parsley.examples.rap.ui;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.parsley.composite.TreeFormComposite;
import org.eclipse.emf.parsley.composite.TreeFormFactory;
import org.eclipse.emf.parsley.resource.ResourceManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import com.google.inject.Inject;

public class View extends ViewPart {
	public static final String ID = "org.eclipse.emf.parsley.examples.rap.ui.view";

	@Inject private ResourceManager resourceManager;
	
	@Inject private TreeFormFactory treeFormFactory;
	
	protected TreeFormComposite treeFormComposite;

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		treeFormComposite = treeFormFactory.createTreeFormComposite(parent,
				SWT.BORDER);
		
		Resource resource = new ResourceImpl();
		resourceManager.initialize(resource);
		
		treeFormComposite.update(resource);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		treeFormComposite.setFocus();
	}
}