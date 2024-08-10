package com.baekjoon.greedy;
import java.util.Arrays;
import java.util.Scanner;

public class greedy_11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] p = new int[N];
        int count = 0;
        int result =0;
        for(int i=0;i<N;i++){
            p[i]=sc.nextInt();
        }
        Arrays.sort(p);
        for(int i:p){
            count=i+count;
            result+=count;
        }
        System.out.println(result);
        sc.close();
    }
}
