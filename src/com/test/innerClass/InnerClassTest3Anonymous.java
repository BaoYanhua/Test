package com.test.innerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * This program demonstrates anonymous inner classes.
 * @version 3.12 2018
 */
public class InnerClassTest3Anonymous {
    public static void main(String[] args){
        TalkingClock3 clock = new TalkingClock3();
        clock.start(1000,true);

        //keep program running until user selects "OK"
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }
}

/**
 * A clock that prints the time in regular intervals
 */
class TalkingClock3{

    /**
     * Starts the clock
     * @param interval interval athe interval between messages(in milliseconds)
     * @param beep true if the clock should beep
     */
    public void start(int interval,boolean beep){
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("At the tone, the tile is "+new Date());
                if(beep) Toolkit.getDefaultToolkit().beep();
            }
        };
        Timer t = new Timer(interval,listener);
        t.start();
    }
}
