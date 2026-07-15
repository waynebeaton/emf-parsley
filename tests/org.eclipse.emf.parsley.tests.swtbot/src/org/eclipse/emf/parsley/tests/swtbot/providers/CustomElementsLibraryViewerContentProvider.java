/**
 * Copyright (c) 2013 RCP Vision (http://www.rcp-vision.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public
 * License v2.0 which accompanies this distribution, and is
 * available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 * Lorenzo Bettini - Initial contribution and API
 */
package org.eclipse.emf.parsley.tests.swtbot.providers;

import static com.google.common.collect.Iterators.filter;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.parsley.examples.library.Book;

import com.google.inject.Inject;

public class CustomElementsLibraryViewerContentProvider extends CustomLibraryViewerContentProvider {
	@Inject
	public CustomElementsLibraryViewerContentProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	public Object elements(Resource resource) {
		return filter(resource.getAllContents(), Book.class);
	}
}
