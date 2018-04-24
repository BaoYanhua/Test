package com.collections.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapUpdateTest {

    public static void main(String[] args){

        Set<Employee> employees = new HashSet<>();
        Employee baobao = new Employee("baobao");
        Employee replaceBaobao = new Employee("baobao");
        employees.add(baobao);
        employees.add(replaceBaobao);
        System.out.println("baobao == replaceBaobao ?"+baobao.equals(replaceBaobao));
        System.out.println(employees);


        /**
         * ?????? how to get a null value, if update the same map key ??
         */
        Map<Employee, Integer> counts = new HashMap<>();

        Employee e1 = new Employee("Emily");
        //get NullPointException because e1 haven't put before get, see below getOrDefault/merge/putIFAbset
//        counts.put(e1,counts.get(e1)+1);

        counts.put(e1,counts.getOrDefault(e1,0)+1);

        counts.putIfAbsent(e1,0);
        counts.put(e1,counts.get(e1)+1);

        counts.merge(e1,1,Integer::sum);
        System.out.println(counts.get(e1));

    }
}
