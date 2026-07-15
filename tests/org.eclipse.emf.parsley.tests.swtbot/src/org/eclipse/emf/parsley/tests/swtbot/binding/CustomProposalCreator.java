/**
 * Copyright (c) 2014 RCP Vision (http://www.rcp-vision.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * Contributors:
 * Lorenzo Bettini - Initial contribution and API
 * SPDX-License-Identifier: EPL-2.0
*/
package org.eclipse.emf.parsley.tests.swtbot.binding;

import java.util.List;

import org.eclipse.emf.parsley.composite.ProposalCreator;
import org.eclipse.emf.parsley.tests.models.testmodels.ClassForControls;

public class CustomProposalCreator extends ProposalCreator {
	public List<String> proposals_ClassForControls_stringFeature(ClassForControls e) {
		return List.of("First Proposal", "Second Proposal");
	}
}
