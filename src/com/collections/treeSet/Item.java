package com.collections.treeSet;

import java.util.Objects;

/**
 * An item with a description and a part number
 */
public class Item implements Comparable<Item>{

    private String description;
    private int partNumber;

    /**
     *
     * @param aDescription
     * @param aPartNumber
     */
    public Item(String aDescription,int aPartNumber){
        description = aDescription;
        partNumber = aPartNumber;
    }

    @Override
    public int compareTo(Item o) {
        int diff = Integer.compare(partNumber,o.partNumber);
        return diff != 0 ? diff : description.compareTo(o.description);
    }

    /**
     * Gets the description of this item
     * @return
     */
    public String getDescription() {
        return description;
    }

    public String toString(){
        return "[description = "+description+", partNumber = "+partNumber+"]";
    }

    public boolean equals(Object otherObject){
        if(this == otherObject) return true;
        if(otherObject == null) return false;
        if(getClass() != otherObject.getClass()) return false;
        Item other = (Item) otherObject;
        return Objects.equals(description,other.description) && partNumber == other.partNumber;
    }

    public int hashCode(){
        return Objects.hash(description,partNumber);
    }

}
