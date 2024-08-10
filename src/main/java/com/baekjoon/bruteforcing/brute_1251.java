package com.baekjoon.bruteforcing;
import java.util.*;
import java.lang.*;

public class brute_1251 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String a,b,c;
        String result = new StringBuilder(str).reverse().toString();
        for(int i=1;i<str.length()-1;i++){
            for(int j=i+1;j<str.length();j++){
                a = new StringBuilder(str.substring(0,i)).reverse().toString();
                b = new StringBuilder(str.substring(i,j)).reverse().toString();
                c = new StringBuilder(str.substring(j)).reverse().toString();
                if(result.compareTo(a+b+c)>0){
                    result = a+b+c;
                }
            }
        }
        System.out.println(result);
    }
}
