/*
 * Copyright (c) 2014 aleon GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Markus Rathgeb - initial API and implementation and/or initial documentation
 */
package org.openhab.binding.aleoncean.internal.worker;

import org.openhab.core.types.Command;

/**
 *
 * @author Markus Rathgeb <maggu2810@gmail.com>
 */
public class WorkerItemReceivedCommand extends WorkerItem {

    private final String itemName;

    private final Command command;

    public WorkerItemReceivedCommand(final String itemName, final Command command) {
        this.itemName = itemName;
        this.command = command;
    }

    public String getItemName() {
        return itemName;
    }

    public Command getCommand() {
        return command;
    }

}
