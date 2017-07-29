package com.company.MultithreadedProgramming;

public class SyncThread implements Runnable {

    Thread thread;
    static SumArray sumArrayObject=new SumArray();
    int a[];
    int answer;

    SyncThread(String name, int numbers[])
    {
        thread=new Thread(this, name);
        a=numbers;
        thread.start();
    }

    public void run()
    {
        int sum;

        System.out.println(thread.getName() + " starting.");

        synchronized (sumArrayObject)
        {
            answer = sumArrayObject.sumArray(a);
        }

        System.out.println("Sum for " + thread.getName() + " is " + answer);

        System.out.println(thread.getName() + " terminating.");
    }
}
