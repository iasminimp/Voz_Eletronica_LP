package vozeletronicacartoescredito;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.LineEvent.Type;

public class ExecutaSom { 

public void executaSom(String Caminho, boolean modo_continuo) throws IOException,UnsupportedAudioFileException, LineUnavailableException, InterruptedException {
    /* Cria uma lista de eventos para garantir que a Thread termina 
    somente depois que o som for de fato executado,
    caso contrário: a thread fica aguardando */
    class ListaEventos implements LineListener {
    private boolean executado = false; /*Assume-se que o som não foi executado inicialmente */
    
    @Override public synchronized void update(LineEvent evento) {
      Type TipoEvento = evento.getType(); /* Atributo tipo de evento que poderá assumir: start, open, stop e close   */
      if (TipoEvento  == Type.STOP || TipoEvento  == Type.CLOSE) { /* Caso o evento esteja parado ou fechado significa que o som ja rodou   */
        executado = true;
        notifyAll();
      }
    }
    public synchronized void aguardaAteExecutar() throws InterruptedException {
      while (!executado) { wait(); /* pausa a thread atual  */}
    }
  }
  ListaEventos Audio = new ListaEventos();
  AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(Caminho).getAbsoluteFile());
  try {
    Clip clip = AudioSystem.getClip();
    clip.addLineListener(Audio);
    clip.open(audioInputStream);
    try {      
       if (modo_continuo) /* Flag usado para verificar se será tocado o som de forma repetida ou uma única vez  */
           clip.loop(Clip.LOOP_CONTINUOUSLY); // Toca continuamente 
       else
           clip.loop(0); // Toca apenas uma vez
      Audio.aguardaAteExecutar(); /* A lista de eventos fica pausada até que o som seja executado  */
    } finally {
      clip.close();
    }
  } finally {
    audioInputStream.close();
  }
 }
}