package com.baekjoon.string;
import java.util.Arrays;
import java.util.Scanner;

public class string_1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = String.valueOf(n).split("");
        StringBuilder sb = new StringBuilder();
        Arrays.sort(arr);
        for (String s : arr) {
            sb.append(s);
        }
        System.out.println(sb.reverse().toString());
    }
}
