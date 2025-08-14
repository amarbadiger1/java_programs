import javax.swing.*;
import java.awt.event.*;

public class GreetingWindow extends JFrame implements KeyListener {
    private JLabel label;

    public GreetingWindow() {
        label = new JLabel("Press M, A, E or N");
        add(label); // Default BorderLayout puts it in center

        addKeyListener(this);
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void keyTyped(KeyEvent e) {
        char ch = Character.toLowerCase(e.getKeyChar());
        switch (ch) {
            case 'm':
                label.setText("Good Morning");
                break;
            case 'a':
                label.setText("Good Afternoon");
                break;
            case 'e':
                label.setText("Good Evening");
                break;
            case 'n':
                label.setText("Good Night");
                break;
            default:
                label.setText("Invalid key");
        }
    }

    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        new GreetingWindow();
    }
}
