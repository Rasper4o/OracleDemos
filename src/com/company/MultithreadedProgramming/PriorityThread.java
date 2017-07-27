package com.company.MultithreadedProgramming;


public class PriorityThread implements Runnable {

    int count;
    Thread thread;

    static boolean stop=false;
    static String currentName;

    PriorityThread (String currentName)
    {
        thread=new Thread(this, currentName);
        count=0;
        this.currentName=currentName;
    }

    public void run()
    {
        System.out.println(thread.getName()+" starting");

        do
        {
            count++;

            if (currentName.compareTo(thread.getName()) != 0)
            {
                currentName = thread.getName();
                System.out.println("In " + currentName);
            }
        }
            while (stop==false && count<10000000);

            stop=true;

            System.out.println(thread.getName()+" terminating.");
    }
}
