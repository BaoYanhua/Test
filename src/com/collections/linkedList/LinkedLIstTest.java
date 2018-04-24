package com.collections.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * This program demonstrates operations on liked lists
 */
public class LinkedLIstTest {

        public static void main(String[] args){
            List<String> a = new LinkedList<>();
            a.add("Amy");
            a.add("Carl");
            a.add("Erica");

            List<String> b = new LinkedList<>();
            b.add("Bob");
            b.add("Doug");
            b.add("Frances");
            b.add("Gloria");


            //merge the words from b into a
            ListIterator<String> aIter = a.listIterator();
            Iterator<String> bIter = b.iterator();
            while(bIter.hasNext()){
                if(aIter.hasNext())
                    aIter.next();
                aIter.add(bIter.next());
            }

            System.out.println(a);

            //remove every second workd from b
            bIter = b.iterator();
            while(bIter.hasNext()){
                bIter.next();//skip one element
                if(bIter.hasNext()){
                    bIter.next();
                    bIter.remove();
                }
            }

            System.out.println(b);

            //bulk operation: remove all words in b from a

            a.remove(b);

            System.out.println(a);
        }
}
