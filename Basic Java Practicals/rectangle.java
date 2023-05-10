import java.awt.*;
import java.applet.*;
/*<applet code = rectangle.class height = 300 width = 300></applet>*/
public class rectangle extends Applet {
    public void paint(Graphics g){
        g.setColor(Color.ORANGE);
        g.fillRect(40, 40, 40, 30);
        g.setColor(Color.BLACK);
        g.drawRect(40, 90, 40, 30);
        g.setColor(Color.GREEN);
        g.fillRect(40, 140, 40, 30);

    }  
}
