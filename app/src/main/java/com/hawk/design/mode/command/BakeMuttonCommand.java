package com.hawk.design.mode.command;

/**
 * Created by jerryliu on 2017/8/29.
 */

public class BakeMuttonCommand extends Command {


    public BakeMuttonCommand(IBarbecure barbecue) {
        super(barbecue);
    }

    @Override
    public void executeCommand() {
        getBarbecue().bakeMutton();
    }
}
