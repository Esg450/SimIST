/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Graham
 */
public class Hallway extends JPanel implements ActionListener, KeyListener{
    private ArrayList<Table> tables;
    private ArrayList<Object> dividers;
    private ArrayList<Object> trashcans;
    private Player1 player1;
    private GameFrame1 theFrame;
    private Timer timer1;
    
    public Hallway(){
        super();
       this.addKeyListener(this);
       this.player1 = new Player1(500, 500);
       
       this.theFrame = new GameFrame1(this);
       this.setFocusable(true);
       
       this.tables = new ArrayList<Table>();
       
       this.timer1 = new Timer(50, this);
       this.timer1.start();
       this.dividers = new ArrayList<Object>();
    }
    
    private void  populateTables(){
        
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}



class Table extends Rectangle{
    private int dy;
    private final Dimension size;
    private Image obstacleImage;
    private final int obstacleSize;
    private final int obstacleSpeed;
    private String deskID;
    
    
    public Table(int panelHeight, int panelWidth,int deskx,int desky, String Name) {
        
        
        this.deskID = Name;
        this.size = new Dimension(panelWidth, panelHeight);
        this.obstacleSize = 50;
        this.obstacleSpeed = 7;
        double r = Math.random();
        int random = (int)(r * panelWidth-50);
        this.setBounds(deskx, desky, obstacleSize, obstacleSize);  
      
    }
    
    
    public void paintComponent(Graphics g){
        move();
        g.setColor(Color.RED);
        g.drawRect(this.x, this.y, this.width, this.height);
    }
    
    public double getCurrentX() {
        return super.getX();
    }
    
    public double getCurrrentY() {
        return super.getY();
    }
    
  
    public void move() {
        
        
    }
    
}

class Player1 extends Rectangle{
    private int dx;
    private int dy;
    private final Dimension size;
    private Image skydiverImage;
    private final int skydiverSize;
    private final int skydiverSpeed;
    
   
    public Player1(int panelWidth, int panelHeight){
        
        this.size = new Dimension(panelWidth, panelHeight);
        this.skydiverSize = 50;
        this.skydiverSpeed = 10;
        this.setBounds(0, 50, skydiverSize, skydiverSize);        
        
    }

    public void move() {
        this.x += dx;
        this.y += dy;
    }
    
    
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_LEFT)
        {
            this.dx = -20;
        }
        else if(e.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            this.dx = 20;
        }
        if(e.getKeyCode() == KeyEvent.VK_UP)
        {
            this.dy = -20;
        }
        else if(e.getKeyCode() == KeyEvent.VK_DOWN)
        {
            this.dy = 20;
        }
    }
    
    public void keyReleased(KeyEvent e){
        this.dx = 0;
        this.dy = 0;
    }
    
    public void paintComponenet(Graphics g){
        
        move();
        g.setColor(Color.BLUE);
        g.drawRect(x, y, width, height);
    }
    
    public double getX(){
        return this.x;
    }
    
    public void setDx(int dx){
        this.x+=dx;
    }
    
    public double getY(){
        return this.x;
    }
    
    public void setDy(int dy){
        this.x+=dx;
    }
    
    
    
}

/**
 *
 * @author Graham
 */
class GameFrame1 extends JFrame{
    
    public GameFrame1(Hallway theRoom){
        this.setSize(new Dimension(500, 500));
        this.add(theRoom);
        this.validate();
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
}

