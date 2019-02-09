package com.hawk.design.mode;

import com.hawk.design.mode.visitor.Amativeness;
import com.hawk.design.mode.visitor.Failing;
import com.hawk.design.mode.visitor.Man;
import com.hawk.design.mode.visitor.ObjectStructure;
import com.hawk.design.mode.visitor.Success;
import com.hawk.design.mode.visitor.Woman;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jerry on 2019/1/6.
 */
public class VistorModeTest {

    private HashMap<String,String> map = new HashMap<String, String>(){{put("zhangsan","18");put("lisi","21");}};

    @Test
    public void testVistorMode(){
//        List<String> list = new ArrayList<>();
//        list.add("aaa");
//        list.add("bbb");
//        List<String> newList = Collections.unmodifiableList(list);
//        newList.add("ccc");
//        System.out.println("newList size = "+ newList.size());

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() +"----->"+ entry.getValue());
        }


        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Woman());
        objectStructure.attach(new Man());

        Success success = new Success();
        objectStructure.display(success);

        Failing failing = new Failing();
        objectStructure.display(failing);

        Amativeness amativeness = new Amativeness();
        objectStructure.display(amativeness);



    }
}
