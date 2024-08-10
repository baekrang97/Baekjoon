package com.baekjoon.string;
import java.util.*;
import java.lang.*;

public class string_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for(int i=0;i<N;i++){
            String str = sc.next();
            if(check(str) == true){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }

    public static boolean check(String str){
        int prev = 0;
        boolean[] bool = new boolean[26];
        bool[str.charAt(0)-'a'] = true;
        for(int j=0;j<str.length();j++){
            if(str.charAt(prev) != str.charAt(j)){
                if(bool[str.charAt(j) - 'a']){
                    return false;
                }else{
                    bool[str.charAt(j) - 'a'] = true;
                    prev = j;
                }
            }
        }
        return true;
    }
}
