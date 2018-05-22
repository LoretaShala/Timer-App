import java.awt.*;
public class PointerWriter
{ 
   private MovingPointer pointer;  
   private Color pointers_color; 
   
   
   public PointerWriter(MovingPointer x, Color c)
   { 
      pointer = x;
      pointers_color = c;
   }

   
   public void paint(Graphics g)
   { 
      g.setColor(pointers_color);
      g.fillArc(100,100,400,400,-pointer.xPosition()+221,2);
   }
}