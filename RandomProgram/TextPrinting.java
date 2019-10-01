import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.*;

public class TextPrinting extends Frame {
    TextPrinting(){
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    public void paint(Graphics g){

        this.setBackground(new Color(100, 20, 20));

        Font f=new Font("Arial",Font.BOLD+ Font.ITALIC,30);
        g.setFont(f);

        g.setColor(Color.green);

        g.drawString("I am Akash Patel",100,100);

    }

    public static void main(String[] args) {
        TextPrinting m=new TextPrinting();
        m.setSize(400,300);
        m.setTitle("text");
        m.setVisible(true);
    }
}