package com.hawk.design.mode;

import com.hawk.design.mode.adapter.Forwards;
import com.hawk.design.mode.adapter.Player;
import com.hawk.design.mode.adapter.Translator;

import org.junit.Test;

/**
 * Created by jerryliu on 2017/8/14.
 */

public class AdapterTest {

    /*@Test
    public void testAdapter() throws Exception{
        Player forwardPlayer = new Forwards("巴蒂尔");
        forwardPlayer.attack();
        forwardPlayer.defense();

//        Player centerPlayer = new Forwards("麦克雷迪");
//        centerPlayer.attack();
//        centerPlayer.defense();
    }*/

    @Test
    public void testAdapter(){
        Player forwardPlayer = new Forwards("巴蒂尔");
        forwardPlayer.attack();
        forwardPlayer.defense();

        Player player = new Translator("姚明");
        player.attack();
        player.defense();
    }
}

