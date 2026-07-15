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
 * Lorenzo Bettini - Initial contribution and API
 *******************************************************************************/
package org.eclipse.emf.parsley.runtime.ui;

import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

/**
 * An implementation of {@link IImageHelper} that loads images using the
 * current class loader.
 *
 * @author Lorenzo Bettini - Initial contribution and API
 */
public class ClassLoaderImageHelper extends AbstractImageHelper implements IImageHelper {

	@Override
	public Image getImage(String name) {
		return loadImageFromClassLoader(name);
	}

	/**
	 * Loads the image with the path specified in the parameter;
	 * it returns null in case the specified image cannot be loaded.
	 *
	 * @param name
	 * @return
	 */
	protected Image loadImageFromClassLoader(String name) {
		URL url = getClass().getClassLoader().getResource(name);

		if (url == null) {
			return null;
		}

		return new Image(Display.getDefault(), url.getPath());
	}

	@Override
	public Image getImage(ImageDescriptor imageDescriptor) {
		return imageDescriptor.createImage();
	}

}
