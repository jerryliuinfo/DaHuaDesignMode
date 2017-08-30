package com.hawk.design.mode;

import com.hawk.design.mode.composite.Composite;
import com.hawk.design.mode.composite.Leaf;

import org.junit.Test;

/**
 * Created by jerryliu on 2017/8/23.
 */

public class CompositeTest {

    @Test
    public void testComposite(){
        Composite root = new Composite("root");

        root.add(new Leaf("A"));
        root.add(new Leaf("B"));

        Composite comp = new Composite("CompositeX");
        comp.add(new Leaf("LeafA"));
        comp.add(new Leaf("LeafB"));

        root.add(comp);

        root.display(1);
    }
}
