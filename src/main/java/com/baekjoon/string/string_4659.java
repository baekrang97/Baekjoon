package com.baekjoon.string;
import java.util.Scanner;

public class string_4659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(true){
            String str = sc.next();
            if(str.equals("end")) break;
            sb.append("<").append(str).append(">");
            if (checkPass(str)){
                sb.append(" is acceptable.");
            }else{
                sb.append(" is not acceptable.");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    public static boolean checkPass (String str){
        boolean hasVowel = false;
        for(char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                hasVowel = true;
                break;
            }
        }
        if (!hasVowel) {
            return false;
        }
        int stack_g = 0;
        int stack_c = 0;
        char prevChar = '\0';
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                stack_g++;
                stack_c = 0;
            } else {
                stack_c++;
                stack_g = 0;
            }

            if (stack_g >= 3 || stack_c >= 3) {
                return false;
            }
            if (c == prevChar && !(c == 'e' || c == 'o')) {
                return false;
            }
            prevChar = c;
        }
        return true;
    }
}
