package com.hawk.design.mode.command;

/**
 * Created by jerryliu on 2017/8/29.
 */

public class BakeChickeWingCommand extends Command {


    public BakeChickeWingCommand(IBarbecure barbecue) {
        super(barbecue);
    }

    @Override
    public void executeCommand() {
        getBarbecue().bakeChickenWing();
    }
}
