package com.collections.treeSet;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args){
        SortedSet<Item> parts = new TreeSet<>();
        parts.add(new Item("Toaster",1234));
        parts.add(new Item("widget",4562));
        parts.add(new Item("Modem",9912));
        System.out.println(parts);

        /**
         * TreeSet Constructor with Comparator
         *
         *
         * @apiNote
         * For example, to obtain a {@code Comparator} that compares {@code
         * Person} objects by their last name,
         *
         * <pre>{@code
         *     Comparator<Person> byLastName = Comparator.comparing(Person::getLastName);
         * }</pre>
         */
        NavigableSet<Item> sortByDescription = new TreeSet<>(Comparator.comparing(Item::getDescription));

        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);

        /**
         * TreeSet(Collection< ? extends E> elements )
         * TreeSet(SortedSet<E> s)
         * 构造一个树集，并增加一个集合或者有序集中的所有元素（对于后一种情况，要使用相同的顺序）
         */
        TreeSet<Item> trees = new TreeSet<>(parts);
        System.out.println("********");
        System.out.println(trees);



    }
}
