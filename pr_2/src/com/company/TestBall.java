package com.company;

public class TestBall {
    public void TestBall(){
        Ball b1 = new Ball(5,4);
        Ball b2 = new Ball(6,7);
        Ball b3 = new Ball(9, 14);

        System.out.println("1)\t" + b1);
        System.out.println("2)\t" + b2);
        System.out.println("3)\t" + b3);

        b1.setX(17);
        b1.setY(28);
        b2.setXY(34,56);
        b3.Move(17,18);

        System.out.println("1)\t" + b1);
        System.out.println("2)\t" + b2);
        System.out.println("3)\t" + b3);
    }
}