package com.raxrot.task1;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        String testString="hello my name is vlad i am Vlad HELLO";
        int count=2;
        countCounter(testString, count);
    }

    private static void countCounter(String testString, int count) {
        String normalizeString= testString.trim().toLowerCase();
        String [] words=normalizeString.split(" ");
        Map<String,Integer>map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            if(map.containsKey(words[i])){
                map.put(words[i],map.get(words[i])+1);
            }else{
                map.put(words[i],1);
            }
        }

        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()== count){
                System.out.println(entry.getKey());
            }
        }
    }
}
