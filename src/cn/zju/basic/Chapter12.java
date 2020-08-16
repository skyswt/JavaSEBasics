package cn.zju.basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Chapter12 {
    class Outer {
        class Inner {

        }
    }
    Outer outer = new Outer();
    Outer.Inner in = outer.new Inner();

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        System.out.println(format.format(System.currentTimeMillis()));

    }
}
