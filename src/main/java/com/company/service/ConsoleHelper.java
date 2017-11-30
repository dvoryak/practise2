package main.java.com.company.service;

import java.util.Scanner;

public class ConsoleHelper {

    public static String readString() {
        return new Scanner(System.in).nextLine();
    }

    public static int readInt() {
        return new Scanner(System.in).nextInt();
    }

    public static void print(String message) {
        System.out.println(message);
    }

}

