package net.missdjoko.investedclass;

import sun.java2d.pipe.OutlineTextRenderer;

/**
 * Created by Miss_ on 28.01.2016.
 */
class Outer{
    int outer_x=100;

    void test(){
        Inner in = new Inner();
        in.display();
    }

    class Inner{
        void display(){
            System.out.println("outer_x = " +outer_x );
        }
    }

}



public class InvestedClass {



    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();

    }
}
