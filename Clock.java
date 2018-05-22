public class Clock
{ private int clock_size;  

   public Clock(int size)
   {
      clock_size = size; 
   }

  
   public boolean inHorizontalContact(int x_position)
   { 
      return (x_position <= 0 ) && (x_position >= clock_size);
   }


   public int sizeOf()
   { 
      return clock_size;
   }
}