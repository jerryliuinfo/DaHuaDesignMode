package com.hawk.design.mode;

import com.hawk.design.mode.state.Work;

import org.junit.Test;

/**
 * Created by jerryliu on 2017/7/23.
 */

public class StateModeTest {

    @Test
    public void testStateMode(){
        Work work = new Work();


        work.setHour(9);
        work.writeProgram();

        work.setHour(10);
        work.writeProgram();

        work.setHour(12);
        work.writeProgram();

        work.setHour(13);
        work.writeProgram();

        work.setHour(14);
        work.writeProgram();

        work.setHour(17);
        work.writeProgram();

        work.setHour(19);
        work.writeProgram();

        work.setHour(21);
        work.writeProgram();

        work.setHour(22);
        work.writeProgram();

    }
}
