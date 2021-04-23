import java.awt.*;
import javax.swing.JApplet;
import javax.swing.JFrame;

public class Circunferencia extends JApplet {

  public void paint (Graphics g) {
        
        g.drawString ("*", 60, 47); //Parte superior
        g.drawString ("*", 70, 45);
        g.drawString ("*", 80, 47);
        g.drawString ("*", 90, 50);

        g.drawString ("*", 50, 50); //Linea izquierda sup
        g.drawString ("*", 37, 60);
        g.drawString ("*", 32, 70);
        g.drawString ("*", 31, 80);
        g.drawString ("*", 30, 90);

        g.drawString ("*", 31, 100); //Linea izquierda inf
        g.drawString ("*", 32, 110);
        g.drawString ("*", 37, 120);
        g.drawString ("*", 50, 130);
        
        g.drawString ("*", 60, 133); //Parte inferior
        g.drawString ("*", 70, 135);
        g.drawString ("*", 80, 133);
        g.drawString ("*", 90, 130);

        g.drawString ("*", 103, 120); //Linea derecha inf
        g.drawString ("*", 108, 110);
        g.drawString ("*", 109, 100);
        g.drawString ("*", 110, 90);

        g.drawString ("*", 90, 50); //Linea derecha sup
        g.drawString ("*", 103, 60);
        g.drawString ("*", 108, 70);
        g.drawString ("*", 109, 80);
        g.drawString ("*", 110, 90);
      
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