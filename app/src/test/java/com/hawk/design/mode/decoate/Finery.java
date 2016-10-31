package com.hawk.design.mode.decoate;

/**
 * Created by lenovo on 2016/10/31.
 */

public class Finery  extends Person{
    protected Person component;

    public Finery(){

    }
    public Finery(String name) {
        super(name);
    }

    public void decorate(Person component){
        this.component = component;
    }

    @Override
    public void show(){
        if (component != null){
            component.show();
        }
    }
}
