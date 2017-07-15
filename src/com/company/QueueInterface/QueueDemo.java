package com.company.QueueInterface;

/**
 * Created by Georgi on 14.7.2017 г..
 */
class FixedQueue implements CharQInterface {

    private char q[];
    private int putLoc, getLoc;

    public FixedQueue(int size)
    {
        q=new char[size];
        putLoc=getLoc=0;
    }

    public void put(char ch)
    {
        if (putLoc==q.length)
        {
            System.out.println(" -Queue is full.");
            return;
        }

        q[putLoc++]=ch;
    }

    public char get()
    {
        if (getLoc==putLoc)
        {
            System.out.println(" -Queue is empty.");
            return (char) 0;
        }

        return q[getLoc++];
    }


}

class CircularQueue implements CharQInterface
{
    private char q[];
    private int putLoc, getLoc;

    public CircularQueue (int size)
    {
        q=new char[size+1];
        putLoc=getLoc=0;
    }

    public void put (char ch)
    {
        if(putLoc+1==getLoc || ((putLoc==q.length-1) && (getLoc==0)))
        {
            System.out.println(" -Queue is full.");
            return;
        }

        q[putLoc++]=ch;
        if (putLoc==q.length) putLoc=0;
    }

    public char get()
    {
        if(getLoc==putLoc)
        {
            System.out.println(" -Queue is empty.");
            return (char) 0;
        }

        char ch=q[getLoc++];
        if (getLoc==q.length) getLoc=0;
        return ch;
    }

}

class DynQueue implements CharQInterface
{
    private char q[];
    private int putLoc, getLoc;

    public DynQueue(int size)
    {
        q=new char[size];
        putLoc=getLoc=0;
    }

    public void put(char ch)
    {
        if (putLoc==q.length)
        {
            char t[]=new char[q.length*2];

            for (int i=0; i<q.length; i++)
            {
                t[i]=q[i];
            }

            q=t;
        }

        q[putLoc++]=ch;
    }

    public char get()
    {
        if (getLoc==putLoc)
        {
            System.out.println(" -Queue is empty.");
            return (char) 0;
        }

        return q[getLoc++];
    }
}

class QueueDemo
{
    public static void main (String[] args)
    {
        FixedQueue q1=new FixedQueue(10);
        DynQueue q2=new DynQueue(5);
        CircularQueue q3=new CircularQueue(10);

        CharQInterface iQ;

        char ch;
        int i;

        iQ=q1;
        for (i=0; i<10; i++)
        {
            iQ.put((char) ('A'+i));
        }

        System.out.print("Contents of fixed queue: ");
        for (i=0; i<10; i++)
        {
            ch=iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ=q2;
        for (i=0; i<10; i++)
        {
            iQ.put((char) ('Z'-i));
        }

        System.out.print("Contents of dynamic queue: ");
        for (i=0; i<10; i++)
        {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println();

        iQ=q3;
        for (i=0; i<10; i++)
        {
            iQ.put((char) ('A'+i));
        }

        System.out.print("Contents of circular queue: ");
        for (i=0; i<10; i++)
        {
            ch= iQ.get();
            System.out.print(ch);
        }

        System.out.println();

        for (i=10; i<20; i++)
        {
            iQ.put((char) ('A'+i));
        }

        System.out.print("Contents of circular queue: ");
        for (i=0; i<10; i++)
        {
            ch= iQ.get();
            System.out.print(ch);
        }

        System.out.println("\nStore and consume from circular queue");

        for (i=0; i<20; i++)
        {
            iQ.put((char) ('A'+i));
            ch= iQ.get();
            System.out.print(ch);
        }
    }
}

