import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GreetingWindow extends JFrame implements KeyListener {
    private JLabel label;

    public GreetingWindow(){
        setTitle("greeting Window");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label=new JLabel("Press M,A,E or N");
        label.setFont(new Font("Arial",Font.BOLD,20));
        add(label);

        addKeyListener(this);
        setFocusable(true);
        setVisible(true);
    }

    public void keyTyped(KeyEvent e){
        char ch=Character.toLowerCase(e.getKeyChar());
        switch(ch){
            case 'm':
                label.setText("Good Morning");
                break;
            case 'a':
                label.setText("Good afternoon");
                break;
            case 'e':
                label.setText("Good Evening");
                break;
            case 'n':
                label.setText("Good Night");
                break;
            default:
                label.setText("Invaild key");
        }
    }

    public void keyPressed(KeyEvent e){}
    public void keyReleased(KeyEvent e){}

    public static void main(String args[]){
        new GreetingWindow();
    }
}