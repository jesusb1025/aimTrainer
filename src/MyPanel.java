import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    public MyPanel(){
        this.setBackground(Color.GREEN);

    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        System.out.println("hi");
        g.setColor(Color.RED);
        g.fillOval(20,50,100,100);
        g.fillOval(300,300,100,100);
        g.setColor(Color.BLUE);
        g.drawString("Aim Trainer",200,50);

    }



}
