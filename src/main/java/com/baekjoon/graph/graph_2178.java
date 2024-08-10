package com.baekjoon.graph;
import java.util.*;

public class graph_2178 {
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};  // x 방향 상하좌우
    static int[] dy = {0, 0, -1, 1}; // y방향 상하좌우
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); int M = sc.nextInt();
        arr = new int[N+2][M+2];
        visited = new boolean[N+2][M+2];
        for(int i=1;i<=N;i++){
            String[] str = sc.next().split("");
            for(int j=1;j<=M;j++){
                arr[i][j] = Integer.parseInt(str[j-1]);
            }
        }
        visited[1][1] = true;
        bfs(N,M);
    }

    public static void bfs(int N, int M){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{1,1});
        visited[1][1] = true;
        while (!q.isEmpty()){
            int now[] = q.poll();
            int a = now[0];
            int b = now[1];
            if(a==N&&b==M){
                break;
            }
            for(int i=0;i<4;i++){
                int nextX = a+dx[i];
                int nextY = b+dy[i];
                if(nextX<0||nextX>N||nextY<0||nextY>M){
                    continue;
                }if(arr[nextX][nextY] == 0){
                    continue;
                }if(visited[nextX][nextY]){
                    continue;
                }
                arr[nextX][nextY] = arr[a][b] + 1;
                q.add(new int[]{nextX,nextY});
                visited[nextX][nextY] = true;
            }
        }
        System.out.println(arr[N][M]);
    }
}
