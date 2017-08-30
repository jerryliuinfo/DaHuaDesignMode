package com.hawk.design.mode;

import com.hawk.design.mode.command.BakeChickeWingCommand;
import com.hawk.design.mode.command.BakeMuttonCommand;
import com.hawk.design.mode.command.BeijingBarbecure;
import com.hawk.design.mode.command.Waiter;
import com.hawk.design.mode.command.XinjiangBarbecure;

import org.junit.Test;

/**
 * Created by jerryliu on 2017/8/29.
 */

public class CommandTest {

    @Test
    public void testCommand(){

        BakeMuttonCommand bakeMuttonCommand1 = new BakeMuttonCommand(new XinjiangBarbecure());
        BakeChickeWingCommand bakeChickeWingCommand = new BakeChickeWingCommand(new BeijingBarbecure());

        Waiter waiter = new Waiter();
        waiter.setOrder(bakeMuttonCommand1);
        waiter.setOrder(bakeChickeWingCommand);

        waiter.notifyReceiver();
    }
}
