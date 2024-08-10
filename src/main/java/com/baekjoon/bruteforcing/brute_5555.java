package com.baekjoon.bruteforcing;
import java.util.*;
import java.lang.*;

public class brute_5555 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int N = sc.nextInt();
        int count =0;
        for(int i=0;i<N;i++){
            String origin = sc.next();
            String compare = origin+origin;
            if(compare.contains(str)){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
