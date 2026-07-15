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
 * Vincenzo Caselli - initial API and implementation
 *******************************************************************************/
 
package org.eclipse.emf.parsley.examples.eclipse4.parsleypart.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

import jakarta.inject.Inject;

public class ShowParsleyPartHandler {

	@Inject
	private EPartService partService;
	
	@Execute
	public void execute(MApplication application) {
		System.out.println("PARSLEY: showing e4 Parsley part");
		System.out.println("EPartService: " + partService);
		MPart part = partService.findPart("org.eclipse.emf.parsley.examples.eclipse4.parsleypart.part.0");
		System.out.println("PARSLEY: found e4 Parsley part");
		part.setVisible(true);
		System.out.println("PARSLEY: set visibile Parsley part");
		partService.showPart(part, EPartService.PartState.VISIBLE);
		System.out.println("PARSLEY: shown e4 Parsley part");
	}

}