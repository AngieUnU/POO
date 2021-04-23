import java.awt.*;
import javax.swing.JApplet;
import javax.swing.JFrame;

public class Circunferencia extends JApplet {

  public void paint (Graphics g) {
    g.drawString (".", 50, 50);
  }

  public static void main (String[] args){
    JFrame frame = new JFrame ("Cargando JApplet");
    Circunferencia saludoApplet = new Circunferencia();
    saludoApplet.init();
    frame.getContentPane().add(saludoApplet);
    frame.setSize(200,200);
    frame.setVisible(true);
  }
}