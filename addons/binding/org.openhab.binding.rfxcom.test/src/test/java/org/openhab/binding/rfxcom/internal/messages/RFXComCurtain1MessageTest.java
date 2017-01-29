/**
 * Copyright (c) 2010-2016 by the respective copyright holders.
 * <p>
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.rfxcom.internal.messages;

import org.junit.Test;
import org.openhab.binding.rfxcom.internal.exceptions.RFXComException;
import org.openhab.binding.rfxcom.internal.exceptions.RFXComNotImpException;
import org.openhab.binding.rfxcom.internal.messages.RFXComBaseMessage.PacketType;

/**
 * Test for RFXCom-binding
 *
 * @author Martin van Wingerden
 * @since 1.9.0
 */
public class RFXComCurtain1MessageTest {
    @Test
    public void checkForSupportTest() throws RFXComException, RFXComNotImpException {
        RFXComMessageFactory.createMessage(PacketType.CURTAIN1);
    }

    @Test
    public void basicBoundaryCheck() throws RFXComException, RFXComNotImpException {
        RFXComTestHelper.basicBoundaryCheck(PacketType.CURTAIN1);
    }

    // TODO please add tests for real messages
}