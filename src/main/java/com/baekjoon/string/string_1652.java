package com.baekjoon.string;
import java.util.Scanner;

public class string_1652 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[][] room = new char[N][N];
        int wid, lth;
        int count = 0;
        for (int i = 0; i < N; i++) {
            String str = sc.next();
            for (int j = 0; j < N; j++) {
                room[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < N; i++) {
            wid = 0;
            int check = 0;
            for (int j = 0; j < N; j++) {
                if (room[i][j] == '.') {
                    wid++;
                    if (wid >= 2) {
                        check = 1;
                    }
                } else if (room[i][j] == 'X') {
                    if (check == 1) {
                        count++;
                        check = 0;
                    }
                    wid = 0;
                }
            }
            if (check == 1) {
                count++;
            }
        }
        System.out.print(count + " ");
        count = 0;
        for (int i = 0; i < N; i++) {
            lth = 0;
            int check = 0;
            for (int j = 0; j < N; j++) {
                if (room[j][i] == '.') {
                    lth++;
                    if (lth >= 2) {
                        check = 1;

                    }
                } else if (room[j][i] == 'X') {
                    if (check == 1) {
                        count++;
                        check = 0;
                    }
                    lth = 0;
                }
            }
            if (check == 1) {
                count++;
            }
        }

        System.out.println(count);
    }
}
