package com.company.ExceptionHandling;

/**
 * Created by Georgi on 24.7.2017 г..
 */
public class NonIntResultException extends Exception{

    int numerator;
    int denominator;

    NonIntResultException(int numerator, int denominator)
    {
        this.numerator=numerator;
        this.denominator=denominator;
    }

    public String toString()
    {
        return "Result of "+numerator+" / "+denominator+" is non-integer.";
    }
}
