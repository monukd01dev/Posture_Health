package Posture.Health;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Hero extends JFrame  implements ActionListener {
    static boolean flag;
    Hero() {
//        setSize(600, 400);

        setUndecorated(true);
        setIconImage(new ImageIcon(ClassLoader.getSystemResource("icons/spine.png")).getImage());

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getSource() == getIconImage()) {
                    e.consume();
                }
            }
        });


        setLayout(null);
        getContentPane().setBackground(Color.black);
        setAlwaysOnTop(true);


        //Label
        JLabel mantain = new JLabel("POSTURE");
        mantain.setBounds(80,10,400,50);
        mantain.setForeground(Color.red);
        mantain.setFont( new Font("Charlie Don't Surf!",Font.PLAIN,30));
        mantain.setBackground(Color.black);
        add(mantain);

        JLabel health = new JLabel("HEALTH");
        health.setBounds(80,50,550,100);
        health.setForeground(Color.red);
        health.setFont( new Font("Charlie Don't Surf!",Font.PLAIN,90));
        health.setBackground(Color.black);
        add(health);


        // Set frame dimensions
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int frameWidth = 600; // Adjust the width as needed
        int frameHeight = 600; // Adjust the height as needed
        int frameX = (screenWidth - frameWidth) / 2;
        int frameY =150;
        setBounds(frameX, frameY, frameWidth, frameHeight);


        JCheckBox eye = new JCheckBox("    Dry Eyes");
        eye.setBounds(170,220,200,30);
        eye.setFocusPainted(false);
        eye.setForeground(Color.red);
        eye.setFont( new Font("Charlie Don't Surf!",Font.PLAIN,18));
        eye.setBackground(Color.black);
        add(eye);

        JCheckBox water = new JCheckBox("    Sip Water");
        water.setBounds(170,260,200,30);
        water.setFocusPainted(false);
        water.setForeground(Color.red);
        water.setFont( new Font("Charlie Don't Surf!",Font.PLAIN,18));
        water.setBackground(Color.black);
        add(water);


        JCheckBox walk = new JCheckBox("    Take A Lil Walk");
        walk.setBounds(170,300,400,30);
        walk.setFocusPainted(false);
        walk.setForeground(Color.red);
        walk.setFont( new Font("Charlie Don't Surf!",Font.PLAIN,18));
        walk.setBackground(Color.black);
        add(walk);


        JCheckBox strech = new JCheckBox("    Spine Haha");
        strech.setBounds(170,340,400,30);
        strech.setFocusPainted(false);
        strech.setForeground(Color.red);
        strech.setFont( new Font("Charlie Don't Surf!",Font.PLAIN,18));
        strech.setBackground(Color.black);
        add(strech);


        JCheckBox mantainposture = new JCheckBox("    Mantain Posture");
        mantainposture.setBounds(170,380,400,30);
        mantainposture.setFocusPainted(false);
        mantainposture.setForeground(Color.red);
        mantainposture.setFont( new Font("Charlie Don't Surf!",Font.PLAIN,18));
        mantainposture.setBackground(Color.black);
        add(mantainposture);

        JButton done = new JButton("Done");
        done.setBounds(230,450,100,50);
        done.setFocusPainted(false);
        done.setForeground(Color.red);
        done.setFont( new Font("Charlie Don't Surf!",Font.PLAIN,18));
        done.setBackground(Color.black);
        done.addActionListener(this);
        add(done);




        setVisible(true);
    }

    public void actionPerformed(ActionEvent actionEvent) {
        flag = false;
        dispose();
    }

//    public static void main(String[] args) {
//        new Hero();
//    }
}
