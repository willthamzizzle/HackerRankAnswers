package com.company;

import sun.misc.Sort;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
/**
 * Created by willthammavong on 6/17/14.
 */
public class Permutation {

    public static String sort(String string)
    {
        char[] charArray = string.toCharArray();
        java.util.Arrays.sort(charArray);
        return new String(charArray);
    }

    public static boolean Solve(String one, String two)
    {
        if (one.length() != two.length())
        {

            return false;
        }

        if(sort(one).equals(sort(two)))
            return true;
        else
            return false;
    }

    public static void main(String[] args) throws FileNotFoundException {
        // write your code here
        Scanner scanner = new Scanner(new FileReader("Test.txt"));
        String stringOne = scanner.next();
        String stringTwo = scanner.next();

        System.out.println(Solve(stringOne, stringTwo));
    }
}
