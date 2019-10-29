package com.bevis.util;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DiningPhilosophersFrame extends JFrame{

    private final JPanel panel1 = new JPanel();
    private final JPanel panel2 = new JPanel();
    private final JPanel panel3 = new JPanel();

    private final JTextArea thinkingTextArea = new JTextArea(6, 10);
    private final JTextArea eatingTextArea = new JTextArea(5, 10);
    private final JTextArea waitingTextArea = new JTextArea(5, 10);

    JLabel label1 = new JLabel("哲学家问题");
    JLabel label2 = new JLabel("思考");
    JLabel label3 = new JLabel("吃饭");
    JLabel label4 = new JLabel("等待");
    JLabel space = new JLabel("                               ");

    JButton button = new JButton("开始运行");
    JButton stop = new JButton("暂停");

    public DiningPhilosophersFrame(){

        panel2.setLayout(new GridLayout(2, 2, 3, 3));
        panel3.setLayout(new BorderLayout());

        label2.setFont(new Font("隶书", 0, 30));
        label2.setHorizontalAlignment(0);
        label3.setFont(new Font("隶书", 0, 30));
        label3.setHorizontalAlignment(0);
        label4.setFont(new Font("隶书", 0, 30));
        label4.setHorizontalAlignment(0);
        panel2.add(label2);
        panel2.add(label3);
        panel2.add(label4);

        thinkingTextArea.setEditable(false);
        eatingTextArea.setEditable(false);
        waitingTextArea.setEditable(false);

        JScrollPane js1 = new JScrollPane(thinkingTextArea,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        JScrollPane js2 = new JScrollPane(eatingTextArea,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        JScrollPane js3 = new JScrollPane(waitingTextArea,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        panel2.add(js1);
        panel2.add(js2);
        panel2.add(js3);
//        panel2.add(label2);
//        panel2.add(label3);
//        panel2.add(label4);

        panel2.setBackground(Color.LIGHT_GRAY);
        panel1.setBackground(Color.LIGHT_GRAY);

        panel1.setLayout(new FlowLayout(FlowLayout.CENTER));

        label1.setFont(new Font("隶书", 0, 50));   //标题字体

        panel1.add(label1);
        panel1.add(panel2);

        button.setBackground(Color.ORANGE);
        stop.setBackground(Color.ORANGE);

        panel1.add(button);
        panel1.add(space);
        panel1.add(stop);

        setContentPane(panel1);

        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                ChopstickArray chopstickArray = new ChopstickArray(5);
                for(int i = 0; i < 5; i++){
                    new Thread(new Philosopher(i, chopstickArray,
                            thinkingTextArea, eatingTextArea, waitingTextArea))
                            .start();
                }
            }
        });

        stop.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        });

        setTitle("可爱的豆豆");
        setSize(450, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){

        new DiningPhilosophersFrame();

    }

}