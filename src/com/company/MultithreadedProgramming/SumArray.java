package com.company.MultithreadedProgramming;

public class SumArray {

    private int sum;

    int sumArray(int numbers[])
    {
        sum=0;

        for (int i=0; i<numbers.length; i++)
        {
            sum+=numbers[i];

            System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum);

            try
            {
                Thread.sleep(10);
            }
            catch (InterruptedException exception)
            {
                System.out.println("Thread interrupted.");
            }
        }

        return sum;
    }
}
