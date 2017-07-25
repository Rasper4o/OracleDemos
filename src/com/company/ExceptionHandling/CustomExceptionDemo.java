package com.company.ExceptionHandling;

/**
 * Created by Georgi on 24.7.2017 г..
 */
public class CustomExceptionDemo {

    public static void main (String[] args)
    {
        int numerator[]={4,8,15,32,64,127,256,512};
        int denominator[]={2,0,4,4,0,8};

        for (int i=0; i<numerator.length; i++)
        {
            try
            {
                if ((numerator[i]%2)!=0)
                    throw new NonIntResultException(numerator[i], denominator[i]);

                System.out.println(numerator[i]+" / "+denominator[i]+" is "+numerator[i]/denominator[i]);
            }
            catch (ArithmeticException exception)
            {
                System.out.println("Cannot divide by zero!");
            }
            catch (ArrayIndexOutOfBoundsException exception)
            {
                System.out.println("Index out of bounds!");
            }
            catch (NonIntResultException exception)
            {
                System.out.println(exception);
            }
        }
    }
}
