package com.company.Shapes;

import javax.swing.event.TreeWillExpandListener;

/**
 * Created by Georgi on 13.7.2017 г..
 */
public class TwoDShape {

    private double width;
    private double height;

    TwoDShape()
    {
        width=height=0;
    }

    TwoDShape (double w, double h)
    {
        width=w;
        height=h;
    }

    TwoDShape (double num)
    {
        width=height=num;
    }

    double getWidth()
    {
        return width;
    }

    double getHeight()
    {
        return height;
    }

    void setWidth(double w)
    {
        width=w;
    }

    public void setHeight(double h) {
        height = h;
    }

    void showDimensions()
    {
        System.out.println("Width: "+width+" Height: "+height);
    }

}
