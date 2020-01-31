package com.codegym;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input : ");
        String input = sc.nextLine();

        String regex = "^[cCaApP]{1}\\d{4}[gGhHiIkKlLmM]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()){
            System.out.println("OK");
        }
        else {
            System.out.println("Not OK");
        }
    }
}
