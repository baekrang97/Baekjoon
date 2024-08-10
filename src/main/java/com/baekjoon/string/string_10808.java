package com.baekjoon.string;
import java.util.Scanner;

public class string_10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] alp = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int[] alp_count = new int[26];
        String str = sc.next();
        sc.close();
        for(char c : str.toCharArray()){
            for(int i=0;i<26;i++){
                if(c == alp[i]){
                    alp_count[i]++;
                    break;
                }
            }
        }
        for(int i : alp_count){
            System.out.print(i + " ");
        }
    }
}
