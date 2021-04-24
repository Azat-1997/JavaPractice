package com.company;

public class ClassesTest2 {
     private int x;
     private int y;
     // default settings
     private static final int defaultX = 0;
     private static final int defaultY = 0;

     public ClassesTest2(int x, int y) {
         this.x = x;
         this.y = y;

     }

     // set
     public static ClassesTest2 DefaultTest2() {

         return new ClassesTest2(defaultX, defaultY);
     }

     public int getX() {
         return x;
     }

     public int getY() {
        return y;
    }

    public void setX(int val) {
         x = val;
    }

    public void setY(int val) {
        y = val;
    }


    public static void main(String[] args) {

    }


}
