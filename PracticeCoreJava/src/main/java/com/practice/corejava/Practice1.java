package com.practice.corejava;

public class Practice1 {

    private void Test(String sent){
        int count=1;
        int b =0;

        String[] words = sent.split("\\s");
        for(String s:words ){
            System.out.print(s+"- ");
            for(int i =0;i<s.length();i++){
                for(int j=i+1;j<s.length();j++){
                    if(s.charAt(i)==s.charAt(j)){
                        count++;
                        b++;

                    }
                }
                if(count>1) {
                    System.out.print(s.charAt(i) + ":" + count +",");

                }
                count=1;

            }
            if(b==0){
                System.out.print("Nothing");
            }
            b=0;
            System.out.println("");

        }

    }

    public static void main(String[] args){
        Practice1 p = new Practice1();
        p.Test("Nikhil Dhanajay Prjwal ");

    }
}
