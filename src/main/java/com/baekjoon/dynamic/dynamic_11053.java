package com.baekjoon.dynamic;
import java.io.*;
import java.util.Arrays;

public class dynamic_11053 {
    public static int[] arr;
    public static boolean[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        arr = new int[N];
        for(int i=0;i<N;i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        int[] dp = new int[N];
        Arrays.fill(dp,1);

        int maxLength = 1;

        for(int i=1;i<N;i++){
            for(int j=0;j<i;j++){
                if(arr[i] > arr[j]&& dp[i] < dp[j]+1){
                    dp[i] = dp[j]+1;
                }
            }
            maxLength = Math.max(maxLength,dp[i]);
        }
        System.out.println(maxLength);
    }
}
