package com.hawk.design.mode;

import com.hawk.design.mode.memento.RoleState;
import com.hawk.design.mode.memento.RoleStateCaretaker;

import org.junit.Test;

/**
 * Created by jerryliu on 2017/8/14.
 */

public class MementoTest {

    @Test
    public void testMemento(){
//        Originator originator = new Originator();
//        originator.setState("on");
//        originator.show();
//
//        CareTaker careTaker = new CareTaker();
//        careTaker.setMemento(originator.createMenmento());
//
//        originator.setState("off");
//        originator.show();
//
//        originator.setMenmento(careTaker.getMemento());
//        originator.show();

        RoleState roleState = new RoleState();
        roleState.show();

        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setMemento(roleState.createMemento());

        roleState.fight();
        roleState.show();

        roleState.recoveryRoleState(roleStateCaretaker.getMemento());
        roleState.show();



    }
}
