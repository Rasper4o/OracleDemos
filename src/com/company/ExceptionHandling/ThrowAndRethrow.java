package com.company.ExceptionHandling;

/**
 * Created by Georgi on 24.7.2017 г..
 */
public class ThrowAndRethrow {

    public static void generateException()
    {
        int numerator[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int denominator[] = {2,0,4,4,0,8};

        for (int i=0; i<numerator.length; i++)
        {
            try
            {
                System.out.println(numerator[i]+" / "+denominator[i]+" is "+numerator[i]/denominator[i]);
            }
            catch (ArithmeticException exception)
            {
                System.out.println("Can't divide by zero!");
            }
            catch (ArrayIndexOutOfBoundsException exception)
            {
                System.out.println("One array shorter than the other!");
                throw exception;
            }
        }
    }
}
