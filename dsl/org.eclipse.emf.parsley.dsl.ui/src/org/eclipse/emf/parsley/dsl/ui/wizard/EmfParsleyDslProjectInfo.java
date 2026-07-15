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
 * Francesco Guidieri - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.parsley.dsl.ui.wizard;

import org.eclipse.emf.parsley.dsl.ui.wizard.template.TemplateWizardConfiguration;
import org.eclipse.xtext.ui.wizard.DefaultProjectInfo;

/**
 * @author Francesco Guidieri
 *
 */
public class EmfParsleyDslProjectInfo extends DefaultProjectInfo {

	private TemplateWizardConfiguration selectedTemplate;
	private boolean isRapOption;

	public TemplateWizardConfiguration getSelectedTemplate() {
		return selectedTemplate;
	}

	public void setSelectedTemplate(TemplateWizardConfiguration selectedTemplate) {
		this.selectedTemplate = selectedTemplate;
	}

	public boolean isRapOption() {
		return isRapOption;
	}

	public void setRapOption(boolean isRapOption) {
		this.isRapOption = isRapOption;
	}

}
