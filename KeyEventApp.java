import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventApp extends JFrame implements KeyListener {
    String message="";
    public KeyEventApp(){
        setTitle("Key Event Listener");
        setSize(800,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(this);
        setFocusable(true);
        setVisible(true);
    }

    public void keyTyped(KeyEvent e){
        message="Key Typed :" + e.getKeyChar();
        repaint();
    }

    public void keyPressed(KeyEvent e){
        message="key pressed :" + e.getKeyChar();
        repaint();
    }
    public void keyReleased(KeyEvent e){
        message="Key Released : "+ e.getKeyChar();
        repaint();
    }
    
    public void paint(Graphics g){
        super.paint(g);
        g.drawString(message,100,200);
    }

    public static void main(String args[]){
        new KeyEventApp();
    }
} 