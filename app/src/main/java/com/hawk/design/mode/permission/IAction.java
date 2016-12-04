package com.hawk.design.mode.permission;

import android.app.Activity;

/**
 * Created by lenovo on 2016/11/30.
 */

public abstract class IAction {
    private Activity context;

    private IAction parent;

    private IAction child;

    public IAction(Activity context, IAction parent) {
        this.context = context;
        this.parent = parent;
        if (parent != null)
            parent.setChild(this);
    }

    protected boolean interrupt() {
        return false;
    }

    public void doInterrupt() {

    }

    public void run() {
        if (parent == null || !parent.interrupt()) {
            doAction();
        }
    }

    final protected void setChild(IAction child) {
        this.child = child;
    }

    final public IAction getChild() {
        return child;
    }

    final public IAction getParent() {
        return parent;
    }

    final protected Activity getContext() {
        return context;
    }

    public void doAction() {
        if (getChild() != null) {
            getChild().run();
        }
    }
}
