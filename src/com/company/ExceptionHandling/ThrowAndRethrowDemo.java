package com.company.ExceptionHandling;

/**
 * Created by Georgi on 24.7.2017 г..
 */
public class ThrowAndRethrowDemo {

    public static void main(String[] args)
    {
        try
        {
            ThrowAndRethrow.generateException();
        }
        catch (ArrayIndexOutOfBoundsException exception)
        {
            System.out.println("Terminal error! Program killed!");
        }
    }
}
