/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.project1;

import java.awt.* ;
import java.util.Set;
import javax.swing.*  ;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Random  ;
import javax.swing.border.Border;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;





/**
 *
 * @author oussa
 */
public class Tic_Tac_Toe extends JFrame {
    int nb ;
    JLabel btn1 = new JLabel("1" ,SwingConstants.CENTER) ;
    JLabel btn2 = new JLabel("2",SwingConstants.CENTER) ;
    JLabel btn3 = new JLabel("3",SwingConstants.CENTER) ;
    JLabel btn4 = new JLabel("4",SwingConstants.CENTER) ;
    JLabel btn5 = new JLabel("5",SwingConstants.CENTER) ;
    JLabel btn6 = new JLabel("6",SwingConstants.CENTER) ;
    JLabel btn7 = new JLabel("7",SwingConstants.CENTER) ;
    JLabel btn8 = new JLabel("8",SwingConstants.CENTER) ;
    JLabel btn9 = new JLabel("9",SwingConstants.CENTER) ;
    
    JLabel cases[] = new JLabel[9];
    
    JButton Exit = new JButton("Exit") ;
    JButton Reset = new JButton("Reset") ;
    
    JButton NewGame = new JButton("New Game") ;
    
    String [] tab = new String[9];
    
    JLabel l1 = new JLabel("00") ;
    JLabel l2 = new JLabel("00") ;
    
    int xcount ;
    int ocount ;
    
    int xPlayer ;
    int oPlayer ;
    
            
    /**
     * @param args the command line arguments
     */
    private void initializationX(int i, int j , int x)
    {
        new java.util.Timer().schedule( 
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        xPlayer++ ;
                        l1.setText(Integer.toString(xPlayer));


                        for (int i=0 ; i<9 ; i++)
                        {
                            cases[i].setIcon(new ImageIcon(""));
                            tab[i]="0";
                            cases[i].setText(""+(i+1)) ;
                        }
                    }
                }, 
               2000 
        );
        cases[i].setIcon(new ImageIcon("121.jpg"));
        cases[j].setIcon(new ImageIcon("121.jpg"));
        cases[x].setIcon(new ImageIcon("121.jpg"));
    }
    private void initializationO(int i , int j , int x)
    {
        new java.util.Timer().schedule( 
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        oPlayer++ ;
                        l2.setText(Integer.toString(oPlayer));


                        for (int i=0 ; i<9 ; i++)
                        {
                            cases[i].setIcon(new ImageIcon(""));
                            tab[i]="0";
                            cases[i].setText(""+(i+1)) ;
                        }
                    }
                }, 
               2000 
        );
        cases[i].setIcon(new ImageIcon("24.jpg"));
        cases[j].setIcon(new ImageIcon("24.jpg"));
        cases[x].setIcon(new ImageIcon("24.jpg"));
    }
    private void WinningGame()
    {
        //PLAYER X
        if((tab[0] == "X" && tab[1] == "X" && tab[2] == "X") )
            initializationX(0,1,2) ;
        else if( (tab[3] == "X" && tab[4] == "X" && tab[5] == "X") )
            initializationX(3,4,5) ;
        else if( (tab[6] == "X" && tab[7] == "X" && tab[8] == "X" ) )
            initializationX(6,7,8) ;
        else if( (tab[0] == "X" && tab[3] == "X" && tab[6] == "X") )
            initializationX(0,3,6) ;
        else if( (tab[1] == "X" && tab[4] == "X" && tab[7] == "X" ) )
            initializationX(1,4,7) ;
        else if( (tab[2] == "X" && tab[5] == "X" && tab[8] == "X" ) )
            initializationX(2,5,8) ;
        else if( (tab[0] == "X" && tab[4] == "X" && tab[8] == "X") )
            initializationX(0,4,8) ;
        else if( (tab[2] == "X" && tab[4] == "X" && tab[6] == "X" ) )
            initializationX(2,4,6) ;
        if((tab[0] == "O" && tab[1] == "O" && tab[2] == "O") )
            initializationO(0,1,2) ;
        else if( (tab[3] == "O" && tab[4] == "O" && tab[5] == "O") )
            initializationO(3,4,5) ;
        else if( (tab[6] == "O" && tab[7] == "O" && tab[8] == "O" ) )
            initializationO(6,7,8) ;

        else if( (tab[1] == "O" && tab[4] == "O" && tab[7] == "O") )
            initializationO(1,4,7) ;
        else if( (tab[2] == "O" && tab[5] == "O" && tab[8] == "O" ) )
            initializationO(2,5,8) ;
        else if( (tab[0] == "O" && tab[4] == "O" && tab[8] == "O") )
            initializationO(0,4,8) ;
        else if( (tab[2] == "O" && tab[4] == "O" && tab[6] == "O" ) )
            initializationO(2,4,6) ;
        else if( (tab[0] == "O" && tab[3] == "O" && tab[6] == "O" ) )
            initializationO(0,3,6) ; 
    }
    public Tic_Tac_Toe()
    {
        cases[0]= btn1 ;
        cases[1]= btn2;
        cases[2]= btn3 ;
        cases[3]= btn4 ;
        cases[4]= btn5 ;
        cases[5]= btn6 ;
        cases[6]= btn7 ;
        cases[7]= btn8 ;
        cases[8]= btn9 ;


        //tableaux des boutons
        Icon  j= new ImageIcon("11.png") ;
        JPanel p1 = new JPanel() ;
        JPanel p2 = new JPanel() ;
        
        p1.setBackground(new Color(128,128,128)) ;

        JPanel p3 = new JPanel() ;
        
        p3.setBackground(new Color(128,128,128)) ;
        JPanel p4 = new JPanel() ;
        
        p4.setBackground(new Color(128,128,128)) ;
        JPanel p5 = new JPanel() ;
        p5.setBackground(new Color(128,128,128)) ;
        p1.setLayout(new GridLayout(3,3,2,2)) ;
        
        p3.setLayout(new GridLayout(2,2)) ;
        p4.setLayout(new GridLayout(3,1,4,4)) ;
        
        p5.setLayout(new GridLayout(2,1)) ;
        
        
        Border border = BorderFactory.createLineBorder(new Color(169,169,169));

        for(int i=0 ; i<9 ; i++)
        {
            p1.add(cases[i]) ;
            cases[i].setOpaque(true);
            cases[i].setBackground(Color.WHITE) ;
            cases[i].setBorder(border);
        }
        

        p3.add(new JLabel("  GamerX :") ) ;
        p3.add(l1 ) ;
        p3.add(new JLabel("  GamerO :") ) ;
        p3.add(l2 ) ;
        
        
        p4.add(NewGame) ;
        NewGame.setBackground(new Color(192,192,192)) ;
        p4.add(Reset) ;
        Reset.setBackground(new Color(192,192,192)) ;
        p4.add(Exit) ;
        Exit.setBackground(new Color(192,192,192)) ;
         
        p5.add(p3,BorderLayout.CENTER) ;
        p5.add(p4,BorderLayout.SOUTH) ;

        add(p1,BorderLayout.CENTER) ;
        add(p5,BorderLayout.EAST) ;
        
        for (int i = 0 ; i<9 ; i++)
        {
            cases[i].addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    int j;
                    j= Integer.parseInt(((JLabel)evt.getSource()).getText()) ;
                    //((JLabel)evt.getSource()).setIcon(new ImageIcon("22.jpg"));
                    if(xcount == 0 && ocount == 0)
                    {
                        Random random = new Random();
                        nb =random.nextInt(2);
                        if (nb == 0) 
                        {
                            ((JLabel)evt.getSource()).setIcon(new ImageIcon("22.jpg"));
                            tab[j-1]="O" ;
                            ocount++ ;
                            ((JLabel)evt.getSource()).setText("");

                        }
                        else if (nb == 1)
                        {
                            ((JLabel)evt.getSource()).setIcon(new ImageIcon("111.jpg"));
                            tab[j-1]= "X" ;
                            xcount++ ;
                            ((JLabel)evt.getSource()).setText("");
                        }
                    }
                    else if (xcount > ocount)
                    {
                        ((JLabel)evt.getSource()).setIcon(new ImageIcon("22.jpg"));
                        tab[j-1]= "O" ;
                        ocount++ ;
                        ((JLabel)evt.getSource()).setText("");
                    }
                    else if (xcount < ocount)
                    {
                        ((JLabel)evt.getSource()).setIcon(new ImageIcon("111.jpg"));
                        tab[j-1]= "X" ;
                        xcount++ ;
                        ((JLabel)evt.getSource()).setText("");
                    }
                    else if (xcount == ocount)
                    {
                        if (nb == 0) 
                        {
                            ((JLabel)evt.getSource()).setIcon(new ImageIcon("22.jpg"));
                            tab[j-1]= "O" ;
                            ocount++ ;
                            ((JLabel)evt.getSource()).setText("");

                        }
                        else if (nb == 1)
                        {
                            ((JLabel)evt.getSource()).setIcon(new ImageIcon("111.jpg"));
                            tab[j-1]= "X" ;
                            xcount++ ;
                            ((JLabel)evt.getSource()).setText("");
                        }
                    }
                    WinningGame() ;
                }
            });
        }
        
        
        
        Exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Exitbtn1ActionPerformed(evt);
            }
        });
        Reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Resetbtn1ActionPerformed(evt);
            }
        });
        NewGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                NewGamebtn1ActionPerformed(evt);
            }
        }); 
    }
    
    private void Resetbtn1ActionPerformed(ActionEvent evt)
    {
        JFrame f1= new JFrame("New Game") ;
        if (JOptionPane.showConfirmDialog(f1,"Confirm if you want New Game","Tic Tac Toe",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            for(int i=0 ; i<9 ; i++)
            {
                tab[i]="0";
                cases[i].setIcon(new ImageIcon("")) ;
                cases[i].setText(""+(i+1)) ;       
            }
        }
    }
    private void NewGamebtn1ActionPerformed(ActionEvent evt)
    {
        /*for(int i=0 ; i<9 ; i++)
        {
            System.out.println(tab[i]);
        }*/
        JFrame f1= new JFrame("New Game") ;
        if (JOptionPane.showConfirmDialog(f1,"Confirm if you want New Game","Tic Tac Toe",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            oPlayer = 0 ;
            xPlayer = 0 ;
            l1.setText(Integer.toString(xPlayer));
            l2.setText(Integer.toString(oPlayer));
            for(int i=0 ; i<9 ; i++)
            {
                tab[i]="0";
                cases[i].setIcon(new ImageIcon("")) ;
                cases[i].setText(""+(i+1)) ;
       
            }
        }
    }
    private void Exitbtn1ActionPerformed(ActionEvent evt)
    {
        JFrame f1= new JFrame("Exit") ;
        if (JOptionPane.showConfirmDialog(f1,"Confirm if you want Exit","Tic Tac Toe",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Tic_Tac_Toe frame = new Tic_Tac_Toe() ;
        frame.setTitle("Tic Tac Toe");
        frame.setSize(350,250) ;
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        frame.setVisible(true) ;
        frame.setBackground(Color.GREEN) ;
    } 
}
