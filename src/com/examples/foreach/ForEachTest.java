package com.examples.foreach;

import java.util.List;
import java.util.Map;

public class ForEachTest {

    private static boolean isVowel(String s){
        return s.equals("A") || s.equals("E") || s.equals("I") 
                    || s.equals("O") || s.equals("U");
    }
    
    public static void main(String[] args) {
        //Loop a Map with ForEach + LambaExpression
        System.out.println("---- Map Example ----");
        
        System.out.println("* Example 1 : Loop");
        Map<String, Integer> map = DataCreator.createMap();
        map.forEach((k, v) -> System.out.println("Key:" + k + " - Value:" + v));
        System.out.println();
        
        
        System.out.println("* Example 2 : Only Vowels");
        map.forEach((k, v) -> {
            if (isVowel(k)){
                System.out.println("Key:" + k + " - Value:" + v);
            }
        });
        System.out.println();
        
        //Loop a List with ForEach + LambaExpression
        System.out.println("---- List Example ----");
        
        System.out.println("* Example 1 : Loop");
        List<String> roster = DataCreator.createList();
        roster.forEach((item) -> System.out.println(item));
        
        System.out.println("* Example 2 : Loop with lambda");
        roster
            .stream()
            .filter(item -> isVowel(item))
            .forEach(item -> System.out.println(item));
    }

}
