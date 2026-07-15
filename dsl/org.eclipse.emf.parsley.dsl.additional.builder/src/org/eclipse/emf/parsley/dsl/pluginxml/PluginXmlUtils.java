/*******************************************************************************
 * Copyright (c) 2016 RCP Vision (http://www.rcp-vision.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *     Lorenzo Bettini - initial API and implementation
 ******************************************************************************
 * SPDX-License-Identifier: EPL-2.0
*/
package org.eclipse.emf.parsley.dsl.pluginxml;

import static org.eclipse.xtext.xbase.lib.IterableExtensions.filter;

import java.util.Map;

import org.eclipse.pde.internal.core.text.DocumentElementNode;
import org.eclipse.pde.internal.core.text.IDocumentAttributeNode;
import org.eclipse.pde.internal.core.text.plugin.PluginAttribute;
import org.eclipse.pde.internal.core.text.plugin.PluginElementNode;

/**
 * Utility methods that abstract from the specific internal implementation of
 * PDE across several Eclipse versions from Indigo on.
 *
 * {@link DocumentElementNode#getNodeAttributesMap()} returns a parameterized
 * TreeMap, while in Indigo it is not parameterized.
 *
 * @author Lorenzo Bettini - initial API and implementation
 */
public class PluginXmlUtils {

	private PluginXmlUtils() {
		// only static utility methods
	}

	public static Iterable<Map.Entry<String, IDocumentAttributeNode>> getPluginAttributesEntrySet(
			final PluginElementNode node) {
		return filter(
				node.getNodeAttributesMap().entrySet(),
				it -> it.getValue() instanceof PluginAttribute);
	}

	public static IDocumentAttributeNode getId(final DocumentElementNode node) {
		return (node.getNodeAttributesMap().get("id"));
	}

	public static Map<String, IDocumentAttributeNode> getNodeAttributesMap(final DocumentElementNode node) {
		return node.getNodeAttributesMap();
	}
}
