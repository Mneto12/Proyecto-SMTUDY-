
// Reproducir sonidos WAW

import java.awt.FlowLayout;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Sounds{

    public static void Sonido_R(String good){
       try {
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(good).getAbsoluteFile());
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
       } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
         System.out.println(" Sounds ");
       }
     }
     
}
   