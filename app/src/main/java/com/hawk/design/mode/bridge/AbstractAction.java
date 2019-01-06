package com.hawk.design.mode.bridge;

/**
 * Created by Jerry on 2019/1/6.
 */
public abstract class AbstractAction {

    protected AImplementor mImplementor;

    public void setImplementor(AImplementor mImplementor) {
        this.mImplementor = mImplementor;
    }

    public void opeation(){
        if (mImplementor != null){
            mImplementor.operation();
        }
    }
}
