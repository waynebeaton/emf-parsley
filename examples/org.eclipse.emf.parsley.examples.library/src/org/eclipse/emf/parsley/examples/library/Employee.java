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
 * $Id: Employee.java,v 1.2 2008/05/04 17:03:17 emerks Exp $
 */
package org.eclipse.emf.parsley.examples.library;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.parsley.examples.library.Employee#getManager <em>Manager</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emf.parsley.examples.library.EXTLibraryPackage#getEmployee()
 * @model
 * @generated
 */
public interface Employee extends Person
{
  /**
	 * Returns the value of the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager</em>' reference.
	 * @see #setManager(Employee)
	 * @see org.eclipse.emf.parsley.examples.library.EXTLibraryPackage#getEmployee_Manager()
	 * @model
	 * @generated
	 */
  Employee getManager();

  /**
	 * Sets the value of the '{@link org.eclipse.emf.parsley.examples.library.Employee#getManager <em>Manager</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' reference.
	 * @see #getManager()
	 * @generated
	 */
  void setManager(Employee value);

} // Employee
