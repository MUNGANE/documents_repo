package com.practice;

public class HackerankPractice {
    public static String superReducedString(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i=0;
        while(!sb.toString().isEmpty() && i<sb.length()){
            if(sb.charAt(i)==sb.charAt(i+1)){
                sb.deleteCharAt(i+1);
                sb.deleteCharAt(i);


                if(i>0){
                    i--;
                }
                else{
                    i=0;
                }
            }
            else{
                i++;
            }
        }
        return (sb.toString().isEmpty())?"Empty String":sb.toString();

    }
    public static void main(String[] args){
         System.out.println(superReducedString("aaabccddd"));
    }
}

