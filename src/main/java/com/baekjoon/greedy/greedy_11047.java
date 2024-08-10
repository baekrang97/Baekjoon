package com.baekjoon.greedy;
import java.util.Scanner;

public class greedy_11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int K;
        int[] coins;
        int result = 0;
        N = sc.nextInt();
        if(1>N||N>10){
            return;
        }
        K = sc.nextInt();
        if(1>K||K>100_000_000){
            return;
        }
        coins = new int[N];
        for(int i = 0; i < N ; i++){
            coins[i] = sc.nextInt();
        }
        for(int i = N-1; i>=0;i--){
            if(coins[i] <= K && K >= 0){
                int num = K/coins[i];
                K -= num*coins[i];
                result += num;
            }
        }
        System.out.println(result);
    }
}
