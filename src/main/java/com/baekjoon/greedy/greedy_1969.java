package com.baekjoon.greedy;
import java.util.Scanner;

public class greedy_1969 {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int diff = 0;
        String[][] str = new String[N][M];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            str[i] = String.valueOf(sc.next()).split("");
        }
        for(int i=0;i<M;i++){
            int[] arr_int = new int[4]; // {A,C,G,T}
            String[] arr_str = {"A","C","G","T"};
            int check = 0;
            int s = 0;
            for(int j=0;j<N;j++){
                if(str[j][i].equals("A")){
                    arr_int[0]++;
                }else if(str[j][i].equals("C")){
                    arr_int[1]++;
                }else if(str[j][i].equals("G")){
                    arr_int[2]++;
                }else if(str[j][i].equals("T")){
                    arr_int[3]++;
                }
            }
            for(int k=0;k<4;k++){
                if(check<arr_int[k]){
                    check = arr_int[k];
                    s = k;
                }
            }
            diff += N-check;
            sb.append(arr_str[s]);
        }
        System.out.println(sb.toString());
        System.out.println(diff);
    }
}
