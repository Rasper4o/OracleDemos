package com.company;

public class QDemo {

    public static void main(String[] args) {

        Queue bigQ=new Queue(100);
        Queue smallQ=new Queue(4);
        char ch;
        int i;

        System.out.println("Using bigQ to store the alphabet.");
        for (i=0; i<26; i++)
        {
            bigQ.put((char)('A'+i));
        }

        System.out.print("Contents of bigQ: ");
        for (i=0; i<26; i++)
        {
            ch=bigQ.get();
            if (ch!=(char) 0) System.out.print(ch);
        }

        System.out.println("\n");


    }
}
