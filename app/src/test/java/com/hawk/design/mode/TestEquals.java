package com.hawk.design.mode;

import com.hawk.design.mode.bean.Person;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jerryliu on 2017/7/24.
 */

public class TestEquals {

    @Test
    public void testEquals(){
        HashMap<Person,String> map = new HashMap<>();
        Person person1 = new Person("zhangsan", 20);
        Person person2 = new Person("zhangsan", 20);
        map.put(person1, "haha");


        String value = map.get(new Person("zhangsan", 20));
        System.out.println("value = "+ value);

        Set<Person> hashSet = new HashSet<>();
        hashSet.add(person1);
        hashSet.add(person2);
        System.out.println("hashSet = "+ hashSet);
    }
}
