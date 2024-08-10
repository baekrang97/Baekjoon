package com.baekjoon.graph;
import java.util.*;

public class graph_2468 {
    static int top=0;
    static int max=0;
    static int[][] arr;
    static int[][][] safe;
    static int[] dx ={1,-1,0,0};
    static int[] dy ={0,0,1,-1};
    static int N;
    static boolean[][] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr= new int[N+1][N+1];
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                arr[i][j] = sc.nextInt();
                if(top<arr[i][j]) top = arr[i][j];
            }
        }
        safe = new int[top+1][N+1][N+1];

        for(int i=0;i<=top;i++){
            for(int j=1;j<=N;j++){
                for(int k=1;k<=N;k++){
                    if(arr[j][k] - i > 0){
                        safe[i][j][k] = 1;
                    }
                }
            }
        }

        for(int[][] n : safe){
            int result = bfs(n);
            if(result>max){
                max = result;
            }
        }
        System.out.println(max);
    }

    public static int bfs(int[][] arr){
        visited = new boolean[N+1][N+1];
        int count = 0;
        Queue<int[]> q = new LinkedList<>();
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                if(arr[i][j]==1&&!visited[i][j]) {
                    q.add(new int[]{i,j});
                    visited[i][j] = true;
                    while (!q.isEmpty()) {
                        int[] now = q.poll();
                        assert now != null;
                        int nowX = now[0];
                        int nowY = now[1];
                        visited[i][j] = true;
                        for (int k = 0; k < 4; k++) {
                            int nextX = nowX + dx[k];
                            int nextY = nowY + dy[k];
                            if (nextX <= 0 || nextX > N || nextY <= 0 || nextY > N) {
                                continue;
                            }
                            if (visited[nextX][nextY] || arr[nextX][nextY] == 0) {
                                continue;
                            }
                            visited[nextX][nextY] = true;
                            q.add(new int[]{nextX, nextY});
                        }
                    }
                    count++;
                }
            }
        }
        return count;

    }
}
