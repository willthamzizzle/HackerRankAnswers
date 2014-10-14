package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class IsFibo {


    public static void Solve(int size, long[] number)
    {
        long a = 0;
        long b = 1;
        long c = 0;

        HashMap<Long, Long> fibo = new HashMap<Long, Long>();
        fibo.put(Long.valueOf(0), Long.valueOf(1));

        //compute the fibonacci sequence to 10^10 numbers
        while(c < 10000000000L)
        {
            c = a + b;
            fibo.put(c, Long.valueOf(1));
            a = b;
            b = c;
        }

        //compare number list to fibonacci and print out whether or not the number is a fibonacci number
        for (int i = 0; i < size; i++)
        {
            // if the number is in the hashmap of fibo then it is a fibonacci number
            if (fibo.get(number[i]) == Long.valueOf(1))
            {
                System.out.println("IsFibo");
            }
            else
                System.out.println("IsNotFibo");
        }
    }

    public static void main(String[] args) throws FileNotFoundException{
	// write your code here
        Scanner scanner = new Scanner(new FileReader("Test.txt"));
        int size = scanner.nextInt();
        long[] number = new long[size];

        if(scanner.hasNext())
        {
            for (int i = 0; i < size; i++)
                number[i] = scanner.nextLong();
        }
        //size: the total number of elements in number
        //number: elements that need to be analyzed to determine if it s a fibonacci number
        Solve(size, number);
    }
}
