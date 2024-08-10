package com.baekjoon.greedy;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class greedy_1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] I = new int[N][2];
        int count = 0; int time = 0;
        for(int i=0;i<N;i++){
            I[i][0] = sc.nextInt();
            I[i][1] = sc.nextInt();
        }
        Arrays.sort(I, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){
                    return o1[0]-o2[0];
                }
                return o1[1]-o2[1];
            }
        });
        for(int[] i : I){
            if(i[0]>=time){
                time = i[1];
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
