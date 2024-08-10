package com.baekjoon.graph;
import java.io.*;

public class graph_9466 {
    static int T;
    static int n;
    static int[] num;
    static String[] str;
    static boolean[] visited;
    static boolean[] finished;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            count =0;
            n = Integer.parseInt(br.readLine());
            str = br.readLine().split(" ");
            num = new int[n+1];
            visited = new boolean[n+1];
            finished = new boolean[n+1];
            for(int j =1;j<=n;j++){
                num[j] = Integer.parseInt(str[j-1]);
            }
            for(int k=1;k<=n;k++){
                dfs(k);
            }
            System.out.println(n-count);
        }
    }

    public static void dfs(int t){
        if(visited[t]){
            return;
        }
        int next = num[t];
        visited[t] = true;

        if(!visited[next]){
            dfs(next);
        }else{
            if(!finished[next]){
                count++;
                for(int i=next;i!=t;i=num[i]){
                    count++;
                }
            }
        }
        finished[t] = true;
    }
}
