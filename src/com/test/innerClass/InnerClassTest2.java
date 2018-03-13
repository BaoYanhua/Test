package com.test.innerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * This program demonstrates the use of inner classes.
 * @version 3.12 2018
 * 局部内部类测试
 */
public class InnerClassTest2 {

    public static void main(String[] args){

        TalkingClock2 clock = new TalkingClock2(1000,true);
        clock.start();

        //keep program running until user selects "OK"
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }
}


/**
 * A clock that prints the time in regular intervals
 */
class TalkingClock2{
    private int interval;
    private boolean beep;

    /**
     * Constructs a talking clock
     * @param interval the interval between messages(in milliseconds)
     * @param beep true if the clock should beep
     */
    public TalkingClock2(int interval, boolean beep){
        this.interval = interval;
        this.beep = beep;
    }

    /**
     * Starts the clock
     */
    public void start(){

        //创建局部内部类， 因为这个类只有一个方法，而且这个类只有在创建start()方法的时候使用过一次， 所以完全可以创建成局部内部类，这样也使的对外部世界隐藏起来。
        class TimePrinter implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("At the tone, the time is :"+new Date());
                if(beep) Toolkit.getDefaultToolkit().beep();
            }
        }

        ActionListener listener = new TimePrinter();
        Timer t = new Timer(interval,listener);
        t.start();
    }

}



