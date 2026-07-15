/*******************************************************************************
 * Copyright (c) 2015 RCP Vision (http://www.rcp-vision.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 * Lorenzo Bettini - initial API and implementation
 ******************************************************************************
 * SPDX-License-Identifier: EPL-2.0
*/
package org.eclipse.emf.parsley.listeners;

import org.eclipse.emf.common.command.Command;

/**
 * A client of the command stack listener that will be notified after a command
 * has been executed.
 *
 * @author Lorenzo Bettini - Initial contribution and API
 *
 */
public interface AsyncCommandStackListenerClient {

	/**
	 * This is called when the last executed command affects a resource the
	 * client is interested in.
	 *
	 * @param mostRecentCommand
	 */
	void mostRecentCommandAffectsResource(Command mostRecentCommand);

	/**
	 * This is called after {@link #mostRecentCommandAffectsResource(Command)},
	 * even if the last command did not affect a resource the client is
	 * interested in.
	 *
	 * @param mostRecentCommand
	 */
	void postCommandStackChanged(Command mostRecentCommand);

}
