package vozeletronicacartoescredito;

public class AudioValores {
    /*Os elementos dos enumeradores devem ter o mesmo nome de cada arquivo de voz .wav correspondente */
    public enum unidade {um, dois, tres, quatro, cinco, seis, sete, oito, nove};
    public enum dez_dezenove {dez, onze, doze, treze, quatorze, quinze, dezeseis, dezessete, dezoito, dezenove};//tava faltando o 12 que acrescentei
    public enum dezena {dez, vinte, trinta, quarenta, cinquenta, sessenta, setenta, oitenta, noventa};
    public enum centena {cento, duzentos, trezentos, quatrocentos, quinhentos, seiscentos, setecentos, oitocentos, novecentos};//ele não cem, apenas cento


    public void audio_Tudo(double valor, String Diretorio) throws Exception{
        int i_centena, i_dezena, i_unidade;
        
        i_centena = (int)valor / 100;
        i_dezena = (int)(valor - i_centena*100)/10;
        i_unidade = (int)(valor - (i_centena * 100 + i_dezena * 10));

        ExecutaSom play = new ExecutaSom();//Define objeto play da Classe ExecutaSom
        
        /*Concatena o diretório onde estão os arquivos de aúdio,
        nome do arquivo localizado no enumerador e extensão .wav*/
        if(i_centena>0)
            play.executaSom(Diretorio+centena.values()[i_centena-1]+".wav",false);
        if(i_dezena>0){
            if(i_centena>0)//tocando o e no momento certo
                play.executaSom(Diretorio+"e.wav",false);
            if(i_dezena==1)
                play.executaSom(Diretorio+dez_dezenove.values()[i_unidade]+".wav",false);
            else
                play.executaSom(Diretorio+dezena.values()[i_dezena-1]+".wav",false);
        }
        if(i_unidade>0 && i_dezena!=1){
            if(i_dezena>0 || i_centena>0)
                play.executaSom(Diretorio+"e.wav",false);
            play.executaSom(Diretorio+unidade.values()[i_unidade-1]+".wav",false);
        }
        play.executaSom(Diretorio+"reais.wav",false);
    }
    
    public void audio_CentavosTeste(int valor, String Diretorio) throws Exception{
        int i_dezena, i_unidade;
        
        i_dezena = (valor / 10) * 10;//Pega a dezena cheia, por exemplo, 20 de 23
        i_unidade = (valor - i_dezena);//Pega a unidade, por exemplo, 3 de 23, ou seja 23-20=3
        i_dezena = i_dezena/10; //Pega o valor significativo da dezena, por exemplo, 20 é 2
        
        ExecutaSom play = new ExecutaSom();//Define objeto play da Classe ExecutaSom
        
        /*Concatena o diretório onde estão os arquivos de aúdio,
        nome do arquivo localizado no enumerado e extensão .wav*/
        if(i_dezena>0){
            //play.executaSom(Diretorio+"e.wav",false);//isso tá dando um probleminha//
            if(i_dezena==1){
                play.executaSom(Diretorio+dez_dezenove.values()[i_unidade]+".wav",false);
            }
            else
                play.executaSom(Diretorio+dezena.values()[i_dezena-1]+".wav",false);            
        }
        if(i_unidade>0 && i_dezena!=1){
            play.executaSom(Diretorio+"e.wav",false);
            play.executaSom(Diretorio+unidade.values()[i_unidade-1]+".wav",false);
        }
        
        /* Como a função só é executada ao ter pelo menos 1 centavo, não devemos 
        nos preocupar com condicionais aqui */
        play.executaSom(Diretorio+"centavos.wav",false);
        }
}