package com.company.ExceptionHandling;

/**
 * Created by Georgi on 24.7.2017 г..
 */
public class ThrowableMethodsDemo {

    public static void main(String[] args)
    {
        try
        {
            ThrowableMethods.generateException();
        }
        catch (ArrayIndexOutOfBoundsException exception)
        {
            System.out.println("Standard message: ");
            System.out.println(exception);
            System.out.println("\nStack trace: ");
            exception.printStackTrace();
        }
    }
}
