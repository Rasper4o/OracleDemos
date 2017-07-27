package com.company.MultithreadedProgramming;

public class PriorityThreadDemo {

    public static void main(String[] args)
    {
        PriorityThread priorityThread1=new PriorityThread("High Priority");
        PriorityThread priorityThread2=new PriorityThread("Low Priority");

        priorityThread1.thread.setPriority(Thread.NORM_PRIORITY+2);
        priorityThread2.thread.setPriority(Thread.NORM_PRIORITY-2);

        priorityThread1.thread.start();
        priorityThread2.thread.start();

        try
        {
            priorityThread1.thread.join();
            priorityThread2.thread.join();
        }
        catch (InterruptedException exception)
        {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("High priority thread counted to: "+priorityThread1.count);
        System.out.println("Low priority thread counted to: "+priorityThread2.count);
    }
}
