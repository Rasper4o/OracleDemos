package com.company.MultithreadedProgramming;

public class MultipleThreads {

    public static void main(String[] args)
    {
        System.out.println("Main thread starting.");
        {
            ThreadExample threadExample1=new ThreadExample("Object 1");
            ThreadExample threadExample2=new ThreadExample("Object 2");
            ThreadExample threadExample3=new ThreadExample("Object 3");

            do
            {
                System.out.print(".");

                try
                {
                    Thread.sleep(100);
                }
                catch (InterruptedException exception)
                {
                    System.out.println("Main thread interrupted.");
                }
            } while (threadExample1.thread.isAlive() || threadExample2.thread.isAlive() || threadExample3.thread.isAlive());

            System.out.println("Main thread ending.");
        }
    }
}
