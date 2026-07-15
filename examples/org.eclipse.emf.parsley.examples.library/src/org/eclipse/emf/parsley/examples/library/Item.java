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
 * $Id: Item.java,v 1.2 2008/05/04 17:03:17 emerks Exp $
 */
package org.eclipse.emf.parsley.examples.library;


import java.util.Date;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.parsley.examples.library.Item#getPublicationDate <em>Publication Date</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emf.parsley.examples.library.EXTLibraryPackage#getItem()
 * @model abstract="true"
 * @generated
 */
public interface Item extends EObject
{
  /**
	 * Returns the value of the '<em><b>Publication Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Publication Date</em>' attribute.
	 * @see #setPublicationDate(Date)
	 * @see org.eclipse.emf.parsley.examples.library.EXTLibraryPackage#getItem_PublicationDate()
	 * @model
	 * @generated
	 */
  Date getPublicationDate();

  /**
	 * Sets the value of the '{@link org.eclipse.emf.parsley.examples.library.Item#getPublicationDate <em>Publication Date</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication Date</em>' attribute.
	 * @see #getPublicationDate()
	 * @generated
	 */
  void setPublicationDate(Date value);

} // Item
