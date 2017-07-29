package com.company.MultithreadedProgramming;

public class SyncDemo {

    public static void main(String[] args)
    {
        int a[] = {1, 2 , 3, 4, 5};

        SyncThread syncThread1=new SyncThread("Thread 1", a);
        SyncThread syncThread2=new SyncThread("Thread 2", a);

        try
        {
            syncThread1.thread.join();
            syncThread2.thread.join();
        }
        catch (InterruptedException exception)
        {
            System.out.println("Main thread interrupted.");
        }
    }
}
