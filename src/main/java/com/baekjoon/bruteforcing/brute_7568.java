package com.baekjoon.bruteforcing;
import java.util.*;

public class brute_7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] N = new int[n+1][2];
        int[][] M = new int[n+1][2];
        int[] count = new int[n];
        for(int i=0;i<n;i++){
            N[i][0] = sc.nextInt();
            N[i][1] = sc.nextInt();
            M[i][0] = N[i][0];
            M[i][1] = N[i][1];
        }

        for(int j=0;j<n;j++){
            int num = 0;
            for(int i = 0;i<n;i++){
                if ((N[i][0] > N[j][0]&&N[i][1]> N[j][1])) {
                    num++;
                }
            }
            count[j] = num+1;

        }
        for(int i=0;i<n-1;i++){
            System.out.print(count[i]+" ");
        }
        System.out.println(count[n-1]);
    }
}
