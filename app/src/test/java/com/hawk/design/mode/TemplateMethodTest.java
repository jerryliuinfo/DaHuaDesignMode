package com.hawk.design.mode;

import com.hawk.design.mode.strategy.StrategyContext;
import com.hawk.design.mode.templatemethod.ConcreteClassA;
import com.hawk.design.mode.templatemethod.ConcreteClassB;
import com.hawk.design.mode.templatemethod.Template;

import org.junit.Test;

/**
 * Created by lenovo on 2016/11/6.
 */

public class TemplateMethodTest {
    @Test
    public void testTemplateMethod() throws Exception {
        Template template = new ConcreteClassA();
        template.run();

        template = new ConcreteClassB();
        template.run();
    }
}
