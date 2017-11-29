package com.examples.foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataCreator {

    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("D", 40);
        map.put("E", 50);
        map.put("F", 60);
        return map;
    }

    public static List<String> createList() {
        List<String> roster = new ArrayList<>();
        roster.add("A");
        roster.add("B");
        roster.add("C");
        roster.add("D");
        roster.add("E");
        return roster;
    }

}
