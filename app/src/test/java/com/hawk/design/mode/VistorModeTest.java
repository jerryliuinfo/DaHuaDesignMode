package com.hawk.design.mode;

import com.hawk.design.mode.visitor.Amativeness;
import com.hawk.design.mode.visitor.Failing;
import com.hawk.design.mode.visitor.Man;
import com.hawk.design.mode.visitor.ObjectStructure;
import com.hawk.design.mode.visitor.Success;
import com.hawk.design.mode.visitor.Woman;

import org.junit.Test;

/**
 * Created by Jerry on 2019/1/6.
 */
public class VistorModeTest {

    @Test
    public void testVistorMode(){
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Woman());
        objectStructure.attach(new Man());

        Success success = new Success();
        objectStructure.display(success);

        Failing failing = new Failing();
        objectStructure.display(failing);

        Amativeness amativeness = new Amativeness();
        objectStructure.display(amativeness);
    }
}
