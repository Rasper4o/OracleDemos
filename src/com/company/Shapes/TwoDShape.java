package com.company.Shapes;

/**
 * Created by Georgi on 13.7.2017 г..
 */
public class TwoDShape {

    private double width;
    private double height;

    TwoDShape (double w, double h)
    {
        width=w;
        height=h;
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
