package com.hawk.design.mode;

import com.hawk.design.mode.decoate.BigTrouser;
import com.hawk.design.mode.decoate.ConcreteComponent;
import com.hawk.design.mode.decoate.ConcreteDecorateA;
import com.hawk.design.mode.decoate.ConcreteDecorateB;
import com.hawk.design.mode.decoate.LeatherShoes;
import com.hawk.design.mode.decoate.Person;
import com.hawk.design.mode.decoate.Sneakes;
import com.hawk.design.mode.decoate.Suit;
import com.hawk.design.mode.decoate.TShirt;
import com.hawk.design.mode.decoate.Tie;

import org.junit.Test;

/**
 * Created by lenovo on 2016/10/31.
 */

public class DecorateModeTest {
    @Test
    public void testDecorateMode() throws Exception {
        Person person = new Person("小菜");
        System.out.println("第一种打扮:");

        Sneakes sneakes = new Sneakes();
        BigTrouser bigTrouser = new BigTrouser();
        TShirt tShirt = new TShirt();

        sneakes.decorate(person);
        bigTrouser.decorate(sneakes);
        tShirt.decorate(bigTrouser);
        tShirt.show();

        System.out.println("第二种打扮:");
        Tie tie = new Tie();
        Suit suit = new Suit();
        LeatherShoes shoes = new LeatherShoes();



        shoes.decorate(person);
        suit.decorate(shoes);
        tie.decorate(suit);
        tie.show();


        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecorateA d1 = new ConcreteDecorateA();
        ConcreteDecorateB d2 = new ConcreteDecorateB();

        d1.setComponent(c);
        d2.setComponent(d1);
        d2.operation();




    }
}
