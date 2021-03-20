package vozeletronicacartoescredito;

public class AudioValores {
    /*Os elementos dos enumeradores devem ter o mesmo nome de cada arquivo de voz .wav correspondente */
    public enum unidade {Um, Dois, Tres, Quatro, Cinco, Seis, Sete, Oito, Nove};
    public enum dez_dezenove {Dez, Onze, Treze, Quatorze, Quinze, Dezeseis, Dezesete, Dezoito, Dezenove};
    public enum dezena {Dez, Vinte, Trinta, Quarenta, Cinquenta, Sessenta, Setenta, Oitenta, Noventa};
    public enum centena {Cento, Duzentos, Trezentos, Quatrocentos, Quinhentos, Seiscentos, Setecentos, Oitocentos, Novecentos};


    public int calculaTamanho(double valor) {
        int num = (int)(valor);
        int tam=0;
        while(num !=0) { 
           num = num/10; 
           tam++; 
        }
    return tam;
    }
    
    public void audio_Centavos(int valor, String Diretorio) throws Exception{
        int i_centena, i_dezena, i_unidade;        
        i_dezena= valor/10*10;//Pega a dezena cheia, por exemplo, 20 de 23
        i_unidade= (valor-i_dezena);//Pega a unidade, por exemplo, 3 de 23, ou seja 23-20=3
        i_dezena=i_dezena/10; //Pega o valor significativo da dezena, por exemplo, 20 é 2
     
        ExecutaSom play = new ExecutaSom();//Define objeto play da Classe ExecutaSom
        /*Concatena o diretório onde estão os arquivos de aúdio, 
        nome do arquivo localizado no enumerado e extensão .wav*/
        play.executaSom(Diretorio+dezena.values()[i_dezena-1]+".wav",false);       
        play.executaSom(Diretorio+unidade.values()[i_unidade-1]+".wav",false);       
        play.executaSom(Diretorio+"Centavos.wav",false);
        //System.out.println(dezena.values()[i_dezena-1]);
        //System.out.println(unidade.values()[i_unidade-1]);  
    }
        
    public void audio_Dezena(double valor, String Diretorio) throws Exception{
        int i_centena, i_dezena, i_unidade;        
        i_dezena= (int)(valor/10);
        i_unidade= (int)(valor-i_dezena*10);
        ExecutaSom play = new ExecutaSom();//Define objeto play da Classe ExecutaSom
        /*Concatena o diretório onde estão os arquivos de aúdio, 
        nome do arquivo localizado no enumerador e extensão .wav*/
        play.executaSom(Diretorio+dezena.values()[i_dezena-1]+".wav",false);
        play.executaSom(Diretorio+unidade.values()[i_unidade-1]+".wav",false);
        play.executaSom(Diretorio+"Reais.wav",false);
    }
     
    public void audio_Centena(double valor, String Diretorio) throws Exception{
        int i_centena, i_dezena, i_unidade;     
        i_centena= (int)valor/100;
        i_dezena= (int)(valor-i_centena*100)/10;
        i_unidade= (int)(valor-(i_centena*100+i_dezena*10)); 
        
        ExecutaSom play = new ExecutaSom();//Define objeto play da Classe ExecutaSom
        /*Concatena o diretório onde estão os arquivos de aúdio, 
        nome do arquivo localizado no enumerador e extensão .wav*/

        play.executaSom(Diretorio+centena.values()[i_centena-1]+".wav",false);/* Utiliza o enumerador centena para concatenar o caminho de onde estão os arquivos de som */
        play.executaSom(Diretorio+dezena.values()[i_dezena-1]+".wav",false);/* Utiliza o enumerador dezena para concatenar o caminho de onde estão os arquivos de som */
        play.executaSom(Diretorio+unidade.values()[i_unidade-1]+".wav",false);/* Utiliza o enumerador unidade para concatenar o caminho de onde estão os arquivos de som */
        play.executaSom(Diretorio+"Reais.wav",false);
       
        System.out.println(centena.values()[i_centena-1]);
        System.out.println(dezena.values()[i_dezena-1]);
        System.out.println(unidade.values()[i_unidade-1]);
      
  }
}