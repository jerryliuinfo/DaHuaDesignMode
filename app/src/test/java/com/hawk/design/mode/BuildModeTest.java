package com.hawk.design.mode;

import com.hawk.design.mode.builder.PersonBuilder;
import com.hawk.design.mode.builder.PersonDirector;
import com.hawk.design.mode.builder.PersonThinBuilder;

import org.junit.Test;

/**
 * Created by jerryliu on 2017/7/16.
 */

public class BuildModeTest {

    @Test
    public void testBuildMode() throws Exception{
        PersonBuilder builder = new PersonThinBuilder();
        PersonDirector director = new PersonDirector(builder);
        director.createPerson();
    }
}
