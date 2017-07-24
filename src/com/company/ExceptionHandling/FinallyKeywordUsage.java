package com.company.ExceptionHandling;

/**
 * Created by Georgi on 24.7.2017 г..
 */
public class FinallyKeywordUsage {

    public static void generateException(int number)
    {
        int t;
        int nums[]=new int[2];

        System.out.println("Receiving: "+number);
        try
        {
            switch (number)
            {
                case 0:
                    t=10/number;
                    break;
                case 1:
                    nums[4]=4;
                    break;
                case 2:
                    return;
            }
        }
        catch (ArithmeticException exception)
        {
            System.out.println("Division by zero impossible!");
        }
        catch (ArrayIndexOutOfBoundsException exception)
        {
            System.out.println("Index out of bounds.");
        }
        finally
        {
            System.out.println("finally keyword reached");
        }
    }
}
