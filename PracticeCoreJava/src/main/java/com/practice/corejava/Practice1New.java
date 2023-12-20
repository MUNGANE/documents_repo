package com.practice.corejava;

import java.util.HashMap;
import java.util.Map;

public class Practice1New {

    private void Test(String sent){
        Integer count=1;
        char c= 'N';
        int b=0;
        HashMap<Character,Integer> hm = new HashMap<>();
        String[] words = sent.split("\\s");
        for(String s:words ){
            System.out.print(s+"- ");
            for(int i =0;i<s.length();i++){
                if(!hm.containsKey(s.charAt(i))){
                     c = s.charAt(i);
                    hm.put(c,count);
                }
                else{
                    Integer j = hm.get(s.charAt(i));
                    j++;
                    hm.replace(s.charAt(i),j);
                    b++;
                }
                count =1;
            }
            for(Map.Entry e : hm.entrySet()){
                Integer x = (Integer) e.getValue();
                if(x>1){
                    System.out.print(e.getKey()+":"+e.getValue()+", ");
                }

            }
            if(b==0){
                System.out.print(" Nothing");
            }
            System.out.println("");
            hm.clear();
            b=0;

        }

    }

    public static void main(String[] args){
        Practice1New p = new Practice1New();
        p.Test("Nikhil Dhannajay Prajwl");

    }
}
