package com.company.BookpackExt;

import com.company.Bookpack.Book;

/**
 * Created by Georgi on 14.7.2017 г..
 */
public class ExtBook extends Book {

    private String publisher;

    public ExtBook (String t, String a, int d, String p)
    {
        super(t, a, d);
        publisher=p;
    }

    public void show()
    {
        super.show();
        System.out.println(publisher);
        System.out.println();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTitle () {return title;}
    public void setTitle(String t) { title=t; }
    public String getAuthor() { return author; }
    public void setAuthor(String a) { author=a; }
    public int getPubDate() { return pubDate; }
    public void setPubDate (int d) { pubDate=d; }

}

class ProtectDemo
{
    public static void main(String[] args)
    {
        ExtBook books[] = new ExtBook[5];

        books[0] = new ExtBook("book1", "author1", 1, "publisher1");
        books[1]=new ExtBook("book2", "author2", 2, "publisher2");
        books[2]=new ExtBook("book3", "author3", 3, "publisher3");

        for (int i=0; i<books.length; i++) books[i].show();


    }
}
