package com.hawk.design.mode;

import com.hawk.design.mode.bridge.AHandsetBrand;
import com.hawk.design.mode.bridge.HandsetAddressList;
import com.hawk.design.mode.bridge.HandsetBrandM;
import com.hawk.design.mode.bridge.HandsetBrandN;
import com.hawk.design.mode.bridge.HandsetGame;

import org.junit.Test;

/**
 * Created by Jerry on 2019/1/5.
 */
public class CompositionModeTest {

    @Test
    public void TestCompositionMode() throws Exception {

        AHandsetBrand brand;
        brand = new HandsetBrandM();
        brand.setSoft(new HandsetGame());
        brand.run();

        brand.setSoft(new HandsetAddressList());
        brand.run();


        brand = new HandsetBrandN();
        brand.setSoft(new HandsetGame());
        brand.run();

        brand.setSoft(new HandsetAddressList());
        brand.run();

    }
}
