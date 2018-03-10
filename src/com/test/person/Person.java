package com.test.person;

public class Person {

    private String name;
    private int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Person) obj).name) && this.age == ((Person) obj).age;
    }

//    @Override
//    public int hashCode() {
//        int result = 17;
//        result = result *31 + this.name.hashCode();
//        result = result *31 + this.age;
//        return result;
//    }
}
