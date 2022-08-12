package javaapplication1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class X_O extends JFrame{
    private JPanel p,p2;
    private JButton but1,but2,but3,but4,but5,but6,but7,but8,but9;
    private GridLayout g1;
    private int x=1;
    int [][] xo = new int [3][3];
    private JLabel ms1;
    private BorderLayout B;
    String h="";
    public X_O()
    {
        setTitle("xo");
        setSize(300,200);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        p =new JPanel();
        g1 = new GridLayout(3,3);
        but1 = new JButton();
        but1.setBackground(Color.LIGHT_GRAY);
        but1.setForeground(Color.red);
        but1.addActionListener(new x());
        but2 = new JButton();
        but2.setBackground(Color.LIGHT_GRAY);
        but2.setForeground(Color.red);
       
        but2.addActionListener(new x());
        but3 = new JButton();
       but3.setBackground(Color.LIGHT_GRAY);
        but3.setForeground(Color.red);
       
        but3.addActionListener(new x());
        but4 = new JButton();
        but4.setBackground(Color.LIGHT_GRAY);
        but4.setForeground(Color.red);
        but4.addActionListener(new x());
        but5 = new JButton();
        but5.setBackground(Color.LIGHT_GRAY);
        but5.setForeground(Color.red);
        but5.addActionListener(new x());
        but6 = new JButton();
        but6.setBackground(Color.LIGHT_GRAY);
        but6.setForeground(Color.red);
        but6.addActionListener(new x());
        but7 = new JButton();
        but7.setBackground(Color.LIGHT_GRAY);
        but7.setForeground(Color.red);
        but7.addActionListener(new x());
        but8 = new JButton();
        but8.setBackground(Color.LIGHT_GRAY);
        but8.setForeground(Color.red);
        but8.addActionListener(new x());
        but9 = new JButton();
        but9.setBackground(Color.LIGHT_GRAY);
        but9.setForeground(Color.red);
        but9.addActionListener(new x());
        p.setLayout(g1);
        p.add(but1);
        p.add(but2);
        p.add(but3);
        p.add(but4);
        p.add(but5);
        p.add(but6);
        p.add(but7);
        p.add(but8);
        p.add(but9);
     
        ms1 =new JLabel("Player "+h+"Turn !");
        p2 = new JPanel();
        p2.add(ms1);
        B= new BorderLayout();
        setLayout(B);
        
        add(p2,BorderLayout.NORTH);
        add(p,BorderLayout.CENTER);
        setVisible(true);
    }
    private class x implements ActionListener 
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == but1)
            {
                if (x == 1)
                {
                    h = "2";
                    ms1.setText("Player "+h+" Turn !");
                    but1.setText("X");
                    xo[0][0]=1;
                    x = 2;
                    if (is_finish() == 1)
                    {
                     ms1.setText("Player 1 Win !!!");
                       
                    }
                    else if (is_finish() == 2)
                    {
                        ms1.setText("Player 2 Win !!!");
                          
                    }
                }
                else
                {
                    h="1";
                    ms1.setText("Player "+h+" Turn !");
                    but1.setText("O");
                    xo[0][0]=2;
                    x=1;
                    if (is_finish() == 1)
                    {
                     ms1.setText("Player 1 Win !!!");
                       
                    }
                    else if (is_finish() == 2)
                    {
                        ms1.setText("Player 2 Win !!!");
                          
                    }
                }
                but1.disable();
            }
            else if (e.getSource() == but2)
            {
                if (x == 1)
                {
                    h = "2";
                    ms1.setText("Player "+h+" Turn !");
                    but2.setText("X");
                    x = 2;
                    xo[0][1] = 1;
                    if (is_finish() == 1)
                    {
                     ms1.setText("Player 1 Win !!!");
                       
                    }
                    else if (is_finish() == 2)
                    {
                        ms1.setText("Player 2 Win !!!");
                          
                    }
                }
                else
                {
                    h = "1";
                    ms1.setText("Player "+h+" Turn !");
                    but2.setText("O");
                    x=1;
                    xo[0][1]=2;
                    if (is_finish() == 1)
                    {
                     ms1.setText("Player 1 Win !!!");
                       
                    }
                    else if (is_finish() == 2)
                    {
                        ms1.setText("Player 2 Win !!!");
                          
                    }
                }
                  but2.disable();
            }
            else if (e.getSource() == but3)
            {
                if (x == 1)
                {
                    h = "2";
                    ms1.setText("Player "+h+" Turn !");
                    but3.setText("X");
                    x = 2;
                    xo[0][2]=1;
                    if (is_finish() == 1)
                    {
                     ms1.setText("Player 1 Win !!!");
                       
                    }
                    else if (is_finish() == 2)
                    {
                        ms1.setText("Player 2 Win !!!");
                          
                    }
                }
                else
                {
                    h="1";
                    ms1.setText("Player "+h+" Turn !");
                    but3.setText("O");
                    x=1;
                    xo[0][2] = 2;
                    if (is_finish() == 1)
                    {
                     ms1.setText("Player 1 Win !!!");
                       
                    }
                    else if (is_finish() == 2)
                    {
                        ms1.setText("Player 2 Win !!!");
                          
                    }
                }
                  but3.disable();
            }
            else if (e.getSource() == but4)
            {
                if (x == 1)
                {
                    h="2";
                    ms1.setText("Player "+h+" Turn !");
                    but4.setText("X");
                    x = 2;
                    xo[1][0]=1;
                    if (is_finish() == 1)
                    {
                     ms1.setText("Player 1 Win !!!");
                       
                    }
                    else if (is_finish() == 2)
                    {
                        ms1.setText("Player 2 Win !!!");
                          
                    }
                }
                else
                {
                    h="1";
                    ms1.setText("Player "+h+" Turn !");
                    but4.setText("O");
                    x=1;
                    xo [1][0] = 2;
                    if (is_finish() == 1)
                    {
                     ms1.setText("Player 1 Win !!!");
                       
                    }
                    else if (is_finish() == 2)
                    {
                        ms1.setText("Player 2 Win !!!");
                          
                    }
                }
                  but4.disable();
            }
            else if (e.getSource() == but5)
            {
                if (x == 1)
                {
                    h="2";
                    ms1.setText("Player "+h+" Turn !");
                    but5.setText("X");
                    x = 2;
                    xo [1][1] = 1;
                    if (is_finish() == 1)
                    {
                     ms1.setText("Player 1 Win !!!");
                       
                    }
                    else if (is_finish() == 2)
                    {
                        ms1.setText("Player 2 Win !!!");
                          
                    }
                }
                else
                {
                    h="1";
                    ms1.setText("Player "+h+" Turn !");
                    but5.setText("O");
                    x=1;
                    xo[1][1] = 2;
                    if (is_finish() == 1)
                    {
                     ms1.setText("Player 1 Win !!!");
                       
                    }
                    else if (is_finish() == 2)
                    {
                        ms1.setText("Player 2 Win !!!");
                          
                    }
                }
                  but5.disable();
            }
            else if (e.getSource() == but6)
            {
                if (x == 1)
                {
                    h = "2";
                    ms1.setText("Player "+h+" Turn !");
                    but6.setText("X");
                    x = 2;
                    xo [1][2] = 1;
                    if (is_finish() == 1)
                    {
                     ms1.setText("Player 1 Win !!!");
                       
                    }
                    else if (is_finish() == 2)
                    {
                        ms1.setText("Player 2 Win !!!");
                          
                    }
                }
                else
                {
                    h="1";
                    ms1.setText("Player "+h+" Turn !");
                    but6.setText("O");
                    x=1;
                    xo [1][2] = 2;
                    if (is_finish() == 1)
                    {
                     ms1.setText("Player 1 Win !!!");
                       
                    }
                    else if (is_finish() == 2)
                    {
                        ms1.setText("Player 2 Win !!!");
                          
                    }
                }
                  but6.disable();
            }
            else if (e.getSource() == but7)
            {
                if (x == 1)
                {
                    h="2";
                    ms1.setText("Player "+h+" Turn !");
                    but7.setText("X");
                    x = 2;
                    xo [2][0] = 1; 
                    if (is_finish() == 1)
                    {
                     ms1.setText("Player 1 Win !!!");
                       
                    }
                    else if (is_finish() == 2)
                    {
                        ms1.setText("Player 2 Win !!!");
                          
                    }
                }
                else
                {
                    h="1";
                    ms1.setText("Player "+h+" Turn !");
                    but7.setText("O");
                    x=1;
                    xo [2][0] = 2;
                    if (is_finish() == 1)
                    {
                     ms1.setText("Player 1 Win !!!");
                       
                    }
                    else if (is_finish() == 2)
                    {
                        ms1.setText("Player 2 Win !!!");
                          
                    }
                }
                  but7.disable();
            }
            else if (e.getSource() == but8)
            {
                if (x == 1)
                {
                    h="2";
                    ms1.setText("Player "+h+" Turn !");
                    but8.setText("X");
                    x = 2;
                    xo [2][1] = 2;
                    if (is_finish() == 1)
                    {
                     ms1.setText("Player 1 Win !!!");
                       
                    }
                    else if (is_finish() == 2)
                    {
                        ms1.setText("Player 2 Win !!!");
                          
                    }
                }
                else
                {
                    h="1";
                    ms1.setText("Player "+h+" Turn !");
                    but8.setText("O");
                    x=1;
                    xo[2][1] = 1;
                    if (is_finish() == 1)
                    {
                     ms1.setText("Player 1 Win !!!");
                       
                    }
                    else if (is_finish() == 2)
                    {
                        ms1.setText("Player 2 Win !!!");
                          
                    }
                }
                  but8.disable();
            }
            else if (e.getSource() == but9)
            {
                if (x == 1)
                {
                    h="2";
                    ms1.setText("Player "+h+" Turn !");
                    but9.setText("X");
                    x = 2;
                    xo[2][2] = 1;
                    if (is_finish() == 1)
                    {
                     ms1.setText("Player 1 Win !!!");
                       
                    }
                    else if (is_finish() == 2)
                    {
                        ms1.setText("Player 2 Win !!!");
                          
                    }
                }
                else
                {
                    h="1";
                    ms1.setText("Player "+h+" Turn !");
                    but9.setText("O");
                    x=1;
                    xo[2][2] = 2;
                    if (is_finish() == 1)
                    {
                     ms1.setText("Player 1 Win !!!");
                       
                    }
                    else if (is_finish() == 2)
                    {
                        ms1.setText("Player 2 Win !!!");
                          
                    }
                }
                but9.disable();
            }
        }
        int is_finish()
        {
            int r =0;
            if (xo[0][0] == 1 && xo[0][1] == 1 && xo [0][2] == 1)
            {
                r =1;
            }
            if (xo [1][0] == 1 && xo [1][1] == 1  && xo [1][2] == 1)
            {
                r = 1;
            }
            if (xo [2][0] == 1 && xo [2][1] == 1 && xo [2][2] == 1)
            {
                r = 1;
            }
            if (xo [0][0] == 1 && xo [1][0] == 1 && xo [2][0] == 1)
            {
                r = 1;
            }
            if (xo [0][1] == 1 && xo [1][1] == 1 && xo [2][1] == 1)
            {
                r = 1;
            }
            if (xo [0][2] == 1 && xo [1][2] == 1 && xo [2][2] == 1)
            {
                r = 1;
            }
            if (xo [0][0] == 1 && xo [1][1] == 1 && xo [2][2] == 1)
            {
                r = 1;
            }
            if (xo [0][2] == 1 && xo [1][1] == 1 && xo [2][0] == 1)
            {
                r = 1;
            }
            
            
            
            
            if (xo[0][0] == 2 && xo[0][1] == 2 && xo [0][2] == 2)
            {
                r =1;
            }
            if (xo [1][0] == 2 && xo [1][1] == 2  && xo [1][2] == 2)
            {
                r = 1;
            }
            if (xo [2][0] == 2 && xo [2][1] == 2 && xo [2][2] == 2)
            {
                r = 1;
            }
            if (xo [0][0] == 2 && xo [1][0] == 2 && xo [2][0] == 2)
            {
                r = 1;
            }
            if (xo [0][1] == 2 && xo [1][1] == 2 && xo [2][1] == 2)
            {
                r = 1;
            }
            if (xo [0][2] == 2 && xo [1][2] == 2 && xo [2][2] == 2)
            {
                r = 1;
            }
            if (xo [0][0] == 2 && xo [1][1] == 2 && xo [2][2] == 2)
            {
                r = 1;
            }
            if (xo [0][2] == 2 && xo [1][1] == 2 && xo [2][0] == 2)
            {
                r = 1;
            }
            
            return r;
        }
        
    }
}
