package com.baekjoon.graph;
import java.util.*;

public class graph_10451 {
    static int count;
    static int[] arr;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] N = new int[T];
        for(int i=0;i<T;i++){
            count = 0;
            N[i] = sc.nextInt();
            arr = new int[N[i]+1];
            visited = new boolean[N[i]+1];
            for(int j=1;j<=N[i];j++){
                arr[j] = sc.nextInt();
            }
            for(int j=1;j<arr.length;j++){
                if(!visited[j]){
                    dfs(j);
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    public static void dfs(int n){
        visited[n]=true;

        if(!visited[arr[n]]){
            dfs(arr[n]);
        }
    }
}
