import java.awt.*;
public class ClockWriter
{ private Clock clock;   
   
   public ClockWriter(Clock b)
   { clock = b; }

   public void paint(Graphics g)
   { int size = clock.sizeOf();
      g.setColor(Color.white);
      g.fillRect(0, 0, size+200, size+200);
      g.setColor(Color.lightGray);
      g.drawString("0",300,90);
      g.drawString("30",300,520);
      g.drawString("15",510,310);
      g.drawString("45",75,300);
      g.fillOval(90,90, size+20, size+20);
      g.setColor(Color.white);
      g.fillOval(100,100, size, size);
   } 
}