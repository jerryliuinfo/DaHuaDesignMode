package com.hawk.design.mode;

import com.hawk.design.other.dest.Guangdong;
import com.hawk.design.other.person.LaoZhang;
import com.hawk.design.other.person.Person;
import com.hawk.design.other.transport.AirCraft;

import org.junit.Test;

/**
 * Created by 01370340 on 2017/9/25.
 */

public class OCPTest {
    @Test
    public void testOCP(){
        Person person = new LaoZhang();
        person.setTransportation(new AirCraft());
        person.setDestination(new Guangdong());

        person.startOff();
    }
}
