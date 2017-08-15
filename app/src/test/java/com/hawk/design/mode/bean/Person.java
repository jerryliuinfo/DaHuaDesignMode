package com.hawk.design.mode.bean;

/**
 * Created by jerryliu on 2017/7/24.
 */

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if (!(obj instanceof Person)){
            return false;
        }

        Person that = (Person) obj;
        if (!name.equals(that.name)){
            return false;
        }

        if (age != that.age){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = result * 31 + age;
        System.out.println("hashCode result = "+ result);
        return result;
    }
}
