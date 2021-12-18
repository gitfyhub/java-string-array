package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter the number of words you would like to test: ");
        try {
            int a= sc.nextInt();
            askForWords(a);
        }
        catch(Exception e) {
            System.out.println("This is not a number!");
        }
    }

    static void askForWords(int a) {
        System.out.println("Word count:" + a);
        String[] strArray3 = new String[a];
        Scanner sc = new Scanner(System.in);

        int arrayCount=0;

        for(int i=1; i<=a; i++)
        {
            System.out.print("Enter word #" + i + ": ");
            String input = sc.nextLine();
            System.out.println(input);
            strArray3[arrayCount] = input;
            arrayCount++;
        }
        System.out.println("\nThe smallest word is: " + smallest(strArray3));
    }

    public static String smallest(String words[]) {
        if (words == null || words.length < 1) {
            return "";
        }
        String smallest = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < smallest.length()) {
                smallest = words[i];
            }
        }
        return smallest;
    }
}