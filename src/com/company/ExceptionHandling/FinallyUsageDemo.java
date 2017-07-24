package com.company.ExceptionHandling;

/**
 * Created by Georgi on 24.7.2017 г..
 */
public class FinallyUsageDemo {

    public static void main(String[] args)
    {
        for (int i=0; i<3; i++)
        {
            FinallyKeywordUsage.generateException(i);
            System.out.println();
        }
    }
}
