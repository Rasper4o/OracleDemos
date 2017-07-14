package com.company.Shapes;

/**
 * Created by Georgi on 13.7.2017 г..
 */
public class Triangle extends TwoDShape {

    private String style;

    Triangle(String s, double w, double h)
    {
        setHeight(h);
        setWidth(w);

        style=s;
    }

    double area()
    {
        return getHeight()*getWidth()/2;
    }

    void showStyle()
    {
        System.out.println("The triangle is: "+style);
    }
}
