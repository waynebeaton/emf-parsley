/**
 * Copyright (c) 2013 RCP Vision (http://www.rcp-vision.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * Contributors:
 * Lorenzo Bettini - initial API and implementation
 * SPDX-License-Identifier: EPL-2.0
*/
package org.eclipse.emf.parsley.dsl.scoping;

import java.util.List;

import org.eclipse.emf.parsley.util.DatabindingUtil;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.xtext.xbase.scoping.batch.ImplicitlyImportedFeatures;

public class EmfParsleyDslImplicitlyImportedFeatures extends ImplicitlyImportedFeatures {
	@Override
	protected List<Class<?>> getExtensionClasses() {
		var extensionClasses = super.getExtensionClasses();
		extensionClasses.add(Widget.class);
		extensionClasses.add(DatabindingUtil.class);
		return extensionClasses;
	}
}
