import javax.swing.*;
public class GiveTime
{
   private String input_line; 
 
   public GiveTime()
   { input_line = ""; }

  
   public char readCommand(String message)
   {
      input_line = JOptionPane.showInputDialog(message).trim().toUpperCase();
      return input_line.charAt(0);  
   }

   public int readAmount()
   { 
      int answer = 0;    
      String s = input_line.substring(1, input_line.length());
      s = s.trim();  
      boolean time=s.equals(null);
     
      if ( s.length() > 0 )  
      { 
         double seconds = new Double(s).doubleValue();
         if(seconds>0){ answer = (int)(seconds);} 
         else  JOptionPane.showMessageDialog(null,
               "GiveTime error: no negative time accepted!");
      }
      else 
      { 
         JOptionPane.showMessageDialog(null,
              "GiveTime error: no time given!");
      }

       
      return answer;
   }
}


