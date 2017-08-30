package com.hawk.design.mode.command;

/**
 * Created by jerryliu on 2017/8/29.
 */

public abstract class Command {
    private IBarbecure barbecue;

    public Command(IBarbecure barbecue) {
        this.barbecue = barbecue;
    }

    public IBarbecure getBarbecue() {
        return barbecue;
    }

    public abstract void executeCommand();
}
