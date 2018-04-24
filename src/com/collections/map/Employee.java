package com.collections.map;

import java.util.Objects;

public class Employee {

    private String name;

    public Employee(String aName){
        name = aName;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return this.name;
    }

    public boolean equals(Object otherObject){
        if(this == otherObject) return true;
        if(otherObject == null) return false;
        if(this.getClass() != otherObject.getClass()) return false;
        Employee other = (Employee) otherObject;
        return this.name.equals(other.name);

    }

    public int hashCode(){
        return Objects.hashCode(name);
    }

}
