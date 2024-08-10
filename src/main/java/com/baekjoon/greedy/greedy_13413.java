package com.baekjoon.greedy;
import java.util.*;
import java.lang.*;

public class greedy_13413 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int stack_B = 0;
            int stack_W = 0;
            int count = 0;
            int N = sc.nextInt();
            String bf = sc.next();
            String af = sc.next();
            for (int j=0;j<N;j++){
                if(!checkBW(bf.charAt(j),af.charAt(j))){
                    if(bf.charAt(j) == 'B'){
                        if(stack_W > 0){
                            count++;
                            stack_W--;
                        }else{
                            stack_B++;
                        }
                    }else if(bf.charAt(j) == 'W'){
                        if(stack_B > 0){
                            count++;
                            stack_B--;
                        }else{
                            stack_W++;
                        }
                    }
                }
            }
            count += (stack_B+stack_W);
            System.out.println(count);
        }
    }

    public static boolean checkBW(char a, char b){
        if(a!=b){
            return false;
        }
        return true;
    }
}
