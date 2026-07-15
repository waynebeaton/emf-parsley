/**
 * Copyright (c) 2024 Lorenzo Bettini and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * Contributors:
 * Lorenzo Bettini - initial API and implementation
 * SPDX-License-Identifier: EPL-2.0
*/
package org.eclipse.emf.parsley.dsl.generator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.util.JavaVersion;
import org.eclipse.xtext.xbase.compiler.GeneratorConfig;
import org.eclipse.xtext.xbase.compiler.GeneratorConfigProvider;

/**
 * @author Lorenzo Bettini - initial API and implementation
 */
public class EmfParsleyDslGeneratorConfigProvider extends GeneratorConfigProvider {

	@Override
	public GeneratorConfig get(EObject context) {
		final var generatorConfig = super.get(context);
		generatorConfig.setJavaSourceVersion(JavaVersion.JAVA11);
		return generatorConfig;
	}
}
