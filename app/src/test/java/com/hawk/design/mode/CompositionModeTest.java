package com.hawk.design.mode;

import com.hawk.design.mode.bridge.handset.AHandsetBrand;
import com.hawk.design.mode.bridge.handset.HandsetAddressList;
import com.hawk.design.mode.bridge.handset.HandsetBrandM;
import com.hawk.design.mode.bridge.handset.HandsetBrandN;
import com.hawk.design.mode.bridge.handset.HandsetGame;

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
