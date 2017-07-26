package com.company.MultithreadedProgramming;

import javax.naming.ldap.ExtendedRequest;

public class UseThreads {

    public static void main(String[] args)
    {
        System.out.println("Main thread starting.");

        ExtendedThread thread=new ExtendedThread("Object 1");

        for (int i=0; i<50; i++)
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
        }

        System.out.println("Main thread ending.");
    }
}
