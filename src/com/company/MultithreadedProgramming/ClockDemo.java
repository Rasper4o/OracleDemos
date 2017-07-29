package com.company.MultithreadedProgramming;


public class ClockDemo {

    public static void main (String[] args)
    {
        TickTock tickTockObj=new TickTock();
        ClockThread clockThread1=new ClockThread("Tick", tickTockObj);
        ClockThread clockThread2=new ClockThread("Tock", tickTockObj);

        try
        {
            clockThread1.thread.join();
            clockThread2.thread.join();
        }
        catch(InterruptedException exception)
        {
            System.out.println("Main thread interrupted.");
        }
    }
}
