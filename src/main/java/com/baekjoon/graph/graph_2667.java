package com.baekjoon.graph;
import java.util.*;

public class graph_2667 {
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static boolean[][] visited;
    static int[][] arr;
    static int N;
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.nextLine();
        arr = new int[N+1][N+1];
        visited = new boolean[N+1][N+1];
        String[] str = new String[N];
        for(int i=0;i<N;i++){
            str[i] = sc.nextLine();
        }
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                arr[i][j] = Integer.parseInt(String.valueOf(str[i-1].charAt(j-1)));
            }
        }

        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                if(!visited[i][j] && arr[i][j] == 1){
                    visited[i][j] = true;
                    list.add(bfs(i,j));
                }
            }
        }
        System.out.println(list.size());
        Collections.sort(list);
        for (int i : list) {
            System.out.println(i);
        }
    }

    public static int bfs(int x,int y){
        int count = 1;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,y});
        visited[x][y] = true;
        while(!q.isEmpty()){
            int[] now = q.poll();
            int nowX = now[0];
            int nowY = now[1];
            for(int i=0;i<4;i++){
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];
                if(nextX<=0||nextX>N||nextY<=0||nextY>N){
                    continue;
                }
                if(arr[nextX][nextY]==0 || visited[nextX][nextY]){
                    continue;
                }
                q.add(new int[]{nextX,nextY});
                visited[nextX][nextY] = true;
                count++;
            }
        }
        return count;
    }
}
