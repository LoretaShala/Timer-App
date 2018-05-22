 import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import java.awt.*;
public class CountdownApp

{ 
   public static void main(String[] args)
   { 
      int clock_size = 400;
      int balls_radius = 6;
      Clock clock = new Clock(clock_size);
      MovingPointer pointer = new MovingPointer((int)(clock_size / 3.0), clock);
    
      PointerWriter pointer_writer = new PointerWriter(pointer, Color.magenta);
      ClockWriter clock_writer  = new ClockWriter(clock);
      AnimationClockWriter writer = new AnimationClockWriter(clock_writer, pointer_writer, clock_size);
      PlayMusic2 music = new PlayMusic2();
      GiveTime time= new GiveTime();
      new ClockController(pointer, writer,time, music).runAnimation();
        }
}