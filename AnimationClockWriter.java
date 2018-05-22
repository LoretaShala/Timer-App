import java.awt.*;
import javax.swing.*;

public class AnimationClockWriter extends JPanel
{
   private ClockWriter clock_writer;    
   private PointerWriter pointer_writer; 
  

   public AnimationClockWriter(ClockWriter b, PointerWriter l, int size)
   {
      clock_writer = b;
      pointer_writer = l;
      JFrame my_frame = new JFrame();
      my_frame.getContentPane().add(this);
      my_frame.setTitle("Timing App");
      my_frame.setSize(size+200, size+200);
      my_frame.setVisible(true);
   }

 
   public void paintComponent(Graphics g)
   {
      clock_writer.paint(g);
      pointer_writer.paint(g);
   }
}