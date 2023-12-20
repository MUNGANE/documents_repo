package com.practice.corejava;



public class Test {
    public  String isBalanced(String s) {
        int count=0;

        int len = s.length();
        int lastInd=len-1;
        if(len%2==1){
            return "NO";
        }
        else{
            for(int i =0;i<len/2;i++){

                if(s.charAt(i)==s.charAt(lastInd)){
                    count++;

                }
                lastInd--;


            }

        }
        if(count==len/2){
            return "YES";
        }
        else{
            return "NO";
        }

    }

    public static void main(String[] args){
        Test t = new Test();
        System.out.println(t.isBalanced("(((())))"));

    }
}