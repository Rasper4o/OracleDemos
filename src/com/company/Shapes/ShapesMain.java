package com.company.Shapes;

/**
 * Created by Georgi on 13.7.2017 г..
 */
public class ShapesMain {

    public static void main(String[] args)
    {
        Triangle t1=new Triangle("filled", 5, 7);
        Triangle t2=new Triangle("outlined", 8, 10);

        System.out.println("Triangle 1 area: "+t1.area());
        t1.showDimensions();
        t1.showStyle();

    }
}
