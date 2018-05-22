public class MovingPointer
{
   private int x_pos;  
   private int y_pos;
   private int x_velocity = +6; 
   private Clock container; 

 
   public MovingPointer(int x_initial, Clock clock)
   {
      x_pos = x_initial;
      container = clock;
   }

   public int xPosition()
   { 
      return x_pos; 
   }

   public void move(int time_units)
   { 
      x_pos = x_pos + (x_velocity * time_units);
       
   }
}