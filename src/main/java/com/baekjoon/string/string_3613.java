package com.baekjoon.string;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class string_3613 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if(str.charAt(0) == '_' || str.charAt(str.length() - 1) == '_') {
            System.out.println("Error!");
            return;
        }

        if (str.matches(".*[A-Z].*") && str.contains("_")) {
            System.out.println("Error!");
            return;
        }

        String result = "";
        if(str.contains("_")) {
            if (!str.matches("^[a-z]+(_[a-z]+)*$")) {
                System.out.println("Error!");
                return;
            }
            Pattern pattern = Pattern.compile("_(.)");
            Matcher matcher = pattern.matcher(str);
            StringBuilder sb = new StringBuilder();
            while (matcher.find()) {
                matcher.appendReplacement(sb, matcher.group(1).toUpperCase());
            }
            matcher.appendTail(sb);
            result = sb.toString();
        } else {
            if (!str.matches("^[a-z]+([A-Z][a-z]*)*$")) {
                System.out.println("Error!");
                return;
            }
            result = str.replaceAll("([A-Z])", "_$1").toLowerCase();
        }
        System.out.println(result);
    }
}
