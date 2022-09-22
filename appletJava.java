import java.applet.*;
import java.awt.*;

/*
 * <applet code = "myApplet" width = "600" height =" 600" >
 * </applet>
 */

public class appletJava extends Applet{
  public void init() {
    System.out.println("init");
  }
  public void start() {
    System.out.println("start");
  }
  public void paint(Graphics g) {
    g.setColor(Color.red);
    g.drawString("Hello Applet", 100, 100);
    g.setColor(Color.blue);
    g.drawRect(100, 300, 240, 100);
  }
  public void stop() {
    System.out.println("stop");
  }
  public void destroy() {
    System.out.println("destroy");
  }
}