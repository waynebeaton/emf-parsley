/**
 * <copyright>
 *
 * Copyright (c) 2005, 2013 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public
 * License v2.0 which accompanies this distribution, and is
 * available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: VideoCassette.java,v 1.5 2008/05/04 17:03:17 emerks Exp $
 */
package org.eclipse.emf.parsley.examples.library;


import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Cassette</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.parsley.examples.library.VideoCassette#getCast <em>Cast</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emf.parsley.examples.library.EXTLibraryPackage#getVideoCassette()
 * @model
 * @generated
 */
public interface VideoCassette extends AudioVisualItem
{
  /**
	 * Returns the value of the '<em><b>Cast</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.parsley.examples.library.Person}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Cast</em>' reference list.
	 * @see org.eclipse.emf.parsley.examples.library.EXTLibraryPackage#getVideoCassette_Cast()
	 * @model
	 * @generated
	 */
  EList<Person> getCast();

} // VideoCassette
