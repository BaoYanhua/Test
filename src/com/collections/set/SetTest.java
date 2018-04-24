package com.collections.set;

import java.util.*;

/**
 * Set 不能重复且无序
 *
 */
public class SetTest {

    public static void main(String[] args){
        Set<String> words = new HashSet<>();//HashSet implements Set
        List<String> wordTemp = new ArrayList<>();
        wordTemp.add("Amy");
        wordTemp.add("Bob");
        wordTemp.add("CICI");
        wordTemp.add("Didi");
        wordTemp.add("Fox");

        for(String word: wordTemp){
            System.out.println(word);
            words.add(word);
            words.add(word);
            words.add("CICI");
        }

        System.out.println("----------------");
        Iterator<String> iter = words.iterator();
        for(int i = 1;i <=20 && iter.hasNext(); i++){
            System.out.println(iter.next());
        }
        System.out.println("...");
        System.out.println(words.size()+" distinct words. ");
    }
}
