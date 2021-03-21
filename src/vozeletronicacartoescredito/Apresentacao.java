package vozeletronicacartoescredito;

import java.io.File;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Apresentacao extends javax.swing.JFrame {

    public Apresentacao() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ValorFatura = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        opcao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Limite = new javax.swing.JFormattedTextField();
        Disponivel = new javax.swing.JFormattedTextField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulação de voz eletrônica");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Simulação de Voz Eletrônica para Operadora de Cartões de Crédito");

        jLabel2.setText("Valor da Fatura (1)");

        ValorFatura.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        ValorFatura.setText("536,45");
        ValorFatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorFaturaActionPerformed(evt);
            }
        });

        jButton1.setText("Ouvir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Digite a opção:");

        opcao.setText("1");

        jLabel4.setText("Limite do Cartão (2)");

        jLabel5.setText("Disponível para Compras (3)");

        Limite.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        Limite.setText("995,90");

        Disponivel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        Disponivel.setText("423,55");
        Disponivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisponivelActionPerformed(evt);
            }
        });

        jButton2.setText("Música");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Equipe:");

        jLabel7.setText("Iasmin M. Pereira");

        jLabel8.setText("Jéssica S. Faria");

        jLabel9.setText("João Victor R. de Andrade");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vozeletronicacartoescredito/placeholder.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ValorFatura)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(Disponivel)
                            .addComponent(Limite))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(opcao, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ValorFatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Limite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Disponivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel7)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel8)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel9))
                    .addComponent(jLabel10))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    double ConverteMoedaDouble(String moeda){ 
         /* O trecho de código a seguir, realiza a conversão do conteúdo 
        de variáveis, previamentes formatados em moeda, para Double */        
        DecimalFormat formata = new DecimalFormat ("#,##0.00"); /*Mesma máscara que pode ser aplicada em campos que permitem formatação de moeda (JFormattedTextField)*/
        double valor=0; 
           try {
               valor = formata.parse (moeda).doubleValue();//Converte para double string que está formatada em moeda              
           } catch (ParseException ex) {
               Logger.getLogger(Apresentacao.class.getName()).log(Level.SEVERE, null, ex);
           }
        return valor;
    }
    
    /////////////////////////////////////////////////////////
    int ObtemInteiro(double num){
        return (int)(num);
    }
    /////////////////////////////////////////////////////////////
    int ObtemDecimais(double num){
        float parte_decimal = (float)(num - ObtemInteiro(num)); 
        float parte_centavos = parte_decimal * 100 - parte_decimal;
        if(parte_centavos == 0)
            return 0;
        return (int)(parte_centavos) + 1;
    }
    /////////////////////////////////////////////////////////////
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /* Local onde devem estar os arquivos de aúdio .wav */
        String PathAudios = System.getProperty("user.dir") + File.separator + "Sons" + File.separator;
        
        ExecutaSom toca; //Instanciando essa classe para tocar o 'e' quando necessário
        toca = new ExecutaSom();
        
        if (Integer.parseInt(opcao.getText())==1){
            try {
                /* Converte para double o conteúdo do campo ValorFatura formatado em moeda */
                double valor = ConverteMoedaDouble(ValorFatura.getText());
                /* As cinco linhas a seguir tem o propósito de obter:
                a parte inteira, decimal e tamanho da variável valor do tipo double */
                int parte_inteira = ObtemInteiro(valor);
                int centavos = ObtemDecimais(valor);
                AudioValores play = new AudioValores(); // Define o objeto da Classe AudioValores
                if (parte_inteira>0)
                    play.audio_Tudo(parte_inteira, PathAudios);
                if (centavos>0){
                    if (parte_inteira>0)
                        toca.executaSom(PathAudios+"e.wav",false);
                    play.audio_CentavosTeste(centavos,PathAudios);/* Executa o aúdio dos centavos */
                }
            } catch (Exception ex) {
                Logger.getLogger(Apresentacao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(Integer.parseInt(opcao.getText())==2){
            try {
                double valor = ConverteMoedaDouble(Limite.getText());
                int parte_inteira = ObtemInteiro(valor);
                int centavos = ObtemDecimais(valor);
                AudioValores play = new AudioValores();
                
                if (parte_inteira>0)
                    play.audio_Tudo(parte_inteira, PathAudios);
                if (centavos>0)
                    play.audio_CentavosTeste(centavos,PathAudios);
            } catch (Exception ex) {
                Logger.getLogger(Apresentacao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(Integer.parseInt(opcao.getText())==3){
            try {
                double valor = ConverteMoedaDouble(Disponivel.getText());
                
                int parte_inteira = ObtemInteiro(valor);
                int centavos = ObtemDecimais(valor);
                AudioValores play = new AudioValores();
                                
                if (parte_inteira>0)
                    play.audio_Tudo(parte_inteira, PathAudios);
                if (centavos>0)
                    play.audio_CentavosTeste(centavos,PathAudios);/* Executa o aúdio dos centavos */
            } catch (Exception ex) {
                Logger.getLogger(Apresentacao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            
            JOptionPane.showMessageDialog(null, "A opção selecionada não está disponível!",
            "Oops...", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            /*Selecionando a música a ser tocada e informando o diretório*/
            String NomeMusica="Queen"; // EraUmaVez, Queen, What Wonderful World
            String PathAudios = System.getProperty("user.dir") + File.separator + "Sons" + File.separator;
            /*Instanciando um objeto responsável por executar o áudio e tocando*/
            ExecutaSom play = new ExecutaSom();
            play.executaSom(PathAudios + NomeMusica + ".wav",false);
        } catch (Exception ex) {
            Logger.getLogger(Apresentacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void DisponivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisponivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DisponivelActionPerformed

    private void ValorFaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorFaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorFaturaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apresentacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField Disponivel;
    private javax.swing.JFormattedTextField Limite;
    private javax.swing.JFormattedTextField ValorFatura;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField opcao;
    // End of variables declaration//GEN-END:variables
}