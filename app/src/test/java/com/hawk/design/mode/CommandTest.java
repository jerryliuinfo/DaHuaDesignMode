package com.hawk.design.mode;

import com.hawk.design.mode.command.CommandChickeWing;
import com.hawk.design.mode.command.CommandBakeMutton;
import com.hawk.design.mode.command.ReceiverBeijingBarbecure;
import com.hawk.design.mode.command.Waiter;
import com.hawk.design.mode.command.ReceiverXinjiangBarbecure;

import org.junit.Test;

/**
 * Created by jerryliu on 2017/8/29.
 */

public class CommandTest {

    @Test
    public void testCommand(){

        CommandBakeMutton bakeMuttonCommand1 = new CommandBakeMutton(new ReceiverXinjiangBarbecure());
        CommandChickeWing bakeChickeWingCommand = new CommandChickeWing(new ReceiverBeijingBarbecure());

        Waiter waiter = new Waiter();
        waiter.addOrder(bakeMuttonCommand1);
        waiter.addOrder(bakeChickeWingCommand);

        waiter.notifyReceiver();
    }
}
