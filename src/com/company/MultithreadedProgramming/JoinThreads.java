package com.company.MultithreadedProgramming;

public class JoinThreads {

    public static void main(String[] args)
    {
        System.out.println("Main thread starting.");
        {
            ThreadExample threadExample1=new ThreadExample("Object 1");
            ThreadExample threadExample2=new ThreadExample("Object 2");
            ThreadExample threadExample3=new ThreadExample("Object 3");


            System.out.print(".");

            try
            {
                threadExample1.thread.join();
                System.out.println("Object 1 joined.");

                threadExample2.thread.join();
                System.out.println("Object 2 joined.");

                threadExample3.thread.join();
                System.out.println("Object 3 joined.");
            }
            catch (InterruptedException exception)
            {
                System.out.println("Main thread interrupted.");
            }

            System.out.println("Main thread ending.");
        }
    }
}
