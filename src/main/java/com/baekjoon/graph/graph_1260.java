package com.baekjoon.graph;
import java.util.*;

public class graph_1260 {
    static int[][] arr;
    static int N;
    static int M;
    static int V;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); M = sc.nextInt(); V = sc.nextInt();
        arr = new int[N+1][N+1];
        visited = new boolean[N+1];
        for(int i=0;i<M;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = arr[b][a] = 1;

        }
        dfs(V);
        Arrays.fill(visited,false);
        System.out.println();
        bfs(V);
    }

    public static void dfs(int V){
        visited[V] = true;
        System.out.print(V + " ");
        for(int i=1;i<=N;i++){
            if(arr[V][i]==1 && !visited[i]){
                dfs(i);
            }
        }
    }

    public static void bfs(int V){
        Queue<Integer> q = new LinkedList<>();
        q.add(V);
        visited[V] = true;
        System.out.print(V + " ");
        while(!q.isEmpty()){
            int temp = q.poll();

            for(int i=1;i< arr.length;i++){
                if(arr[temp][i] == 1 && !visited[i]){
                    q.add(i);
                    visited[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
}
