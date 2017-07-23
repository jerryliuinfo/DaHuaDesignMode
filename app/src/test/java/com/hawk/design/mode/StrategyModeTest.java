package com.hawk.design.mode;

import com.hawk.design.mode.strategy.StrategyContext;

import org.junit.Test;

/**
 * @author Jerry
 * @Description:
 * @date 2016/10/29 10:48
 * @copyright TCL-MIG
 */

public class StrategyModeTest {
    private static final String TAG = StrategyModeTest.class.getSimpleName();

    @Test
    public void testStrategyMode() throws Exception {
        int count = 5;
        double price = 52.4;
        StrategyContext context = new StrategyContext(StrategyContext.STRATEGY_NORMAL);
        System.out.println("STRATEGY_NORMAL total price = "+context.payMoney(count * price));

        context = new StrategyContext(StrategyContext.STRATEGY_REBATE);
        System.out.println("STRATEGY_REBATE total price = "+context.payMoney(count * price));

        context = new StrategyContext(StrategyContext.STRATEGY_RETURN);
        System.out.println("STRATEGY_RETURN total price = "+context.payMoney(count * price));




    }
}
