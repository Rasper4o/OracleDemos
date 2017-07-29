package com.company.MultithreadedProgramming;

public class ClockThread implements Runnable {

    Thread thread;
    TickTock tickTockObj;

    ClockThread(String name, TickTock tickTockObj)
    {
        thread=new Thread(this, name);
        this.tickTockObj=tickTockObj;
        thread.start();
    }

    public void run()
    {
        if (thread.getName().compareTo("Tick") == 0)
        {
            for (int i=0; i<5; i++)
            {
                tickTockObj.tick(true);
            }

            tickTockObj.tick(false);
        }
        else
        {
            for (int i=0; i<5; i++)
            {
                tickTockObj.tock(true);
            }

            tickTockObj.tock(false);
        }
    }
}
