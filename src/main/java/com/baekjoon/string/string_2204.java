package com.baekjoon.string;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class string_2204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            ArrayList<String> list = new ArrayList<>();
            int num = sc.nextInt();
            if(num == 0){
                break;
            }
            for (int i = 0; i < num; i++) {
                list.add(sc.next());
            }
            list.sort(String.CASE_INSENSITIVE_ORDER);
            System.out.println(list.get(0));
        }
        sc.close();
    }
}
