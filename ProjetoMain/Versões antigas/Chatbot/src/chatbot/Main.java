
package chatbot;

//Bibliotecas impor
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.applet.AudioClip;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main extends javax.swing.JFrame {

    String pregunta, respuesta,preguntagenerada;
    boolean reproducciendo=false;
     AudioClip sonido1, sonido2, alive;
     
    
    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        enviar = new javax.swing.JButton();
        texto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        pantalla = new javax.swing.JTextArea();
        Namebot = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        online = new javax.swing.JLabel();
        label1 = new java.awt.Label();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        enviar.setBackground(new java.awt.Color(255, 255, 255));
        enviar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        enviar.setForeground(new java.awt.Color(0, 51, 204));
        enviar.setText("Enviar");
        enviar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        texto.setBackground(new java.awt.Color(204, 204, 204));
        texto.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        texto.setForeground(new java.awt.Color(0, 51, 204));
        texto.setCaretColor(new java.awt.Color(0, 204, 204));
        texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoActionPerformed(evt);
            }
        });

        pantalla.setEditable(false);
        pantalla.setBackground(new java.awt.Color(204, 204, 204));
        pantalla.setColumns(20);
        pantalla.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        pantalla.setForeground(new java.awt.Color(0, 51, 204));
        pantalla.setRows(5);
        pantalla.setText("Wall-e: Olá, digite sua dúvida sobre comandos do windows =)\n");
        pantalla.setCaretColor(new java.awt.Color(0, 204, 204));
        jScrollPane1.setViewportView(pantalla);

        Namebot.setBackground(new java.awt.Color(0, 204, 255));
        Namebot.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Namebot.setForeground(new java.awt.Color(0, 51, 204));
        Namebot.setText("Suporte Windows");
        Namebot.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton1.setText("Ensinar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        online.setBackground(new java.awt.Color(255, 0, 0));
        online.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        label1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label1.setText("WALL-E: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(online, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Namebot, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(enviar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Namebot, javax.swing.GroupLayout.PREFERRED_SIZE, 35, Short.MAX_VALUE))
                    .addComponent(online, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(enviar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(texto))
                .addContainerGap())
        );

        enviar.getAccessibleContext().setAccessibleName("enviar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Logica para se o usuario digitar algo diferente do que há no TXT ele perguntar se o usuario quer ensinar
    
    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        
        Thread hilo = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
        pregunta=texto.getText();
        respuesta=(new BuscaDatos().translate(texto.getText()));
        preguntagenerada=(new BuscaDatos().translate(generarpregunta()));
        pantalla.append("Você: "+texto.getText() +"\n");
        if (respuesta.equalsIgnoreCase("ok")){
        pantalla.append("Wall-e: Poderia me ensinar a responder essa pergunta?  '"+pregunta+"' \n");
        String respuestUsuario= JOptionPane.showInputDialog("Deseja ensinar? (Sim ou Não)");
        if (respuestUsuario.equalsIgnoreCase("sim")){
             String respuestUsuarioPregunta= JOptionPane.showInputDialog("O que devo responder a: '"+pregunta+"'");
             Leer aprender =new Leer();
             String nuevapalabra=aprender.preguntanueva(pregunta,respuestUsuarioPregunta);
             aprender.guardar(aprender.leertxt("datos.txt"), nuevapalabra);   
        }
    }
        texto.setText("");
        animacionEscribir(respuesta);
        int probabilidad=mitadProbabilidad();
        //System.out.println(probabilidade);
    
        } catch (Exception e) {
        }
        }
        });
        hilo.start();

    }//GEN-LAST:event_enviarActionPerformed

    public String generarpregunta(){
        int numero;
        numero = (int) (Math.random() * 9) + 1;
        String preguntaAleatoria = Integer.toString(numero);
        String preguntacompletada= preguntaAleatoria+"p";
        return preguntacompletada;
    }
    public int mitadProbabilidad(){
         int numero;
        numero = (int) (Math.random() * 9) + 1;
        return numero;
    }
    public void animacionEscribir(String respuestaxd) throws InterruptedException, URISyntaxException, IOException{
        sonido1 =java.applet.Applet.newAudioClip(getClass().getResource("./mensajellegada.wav"));
        sonido2 =java.applet.Applet.newAudioClip(getClass().getResource("./pop.wav"));
        Thread.sleep(generarRandom());
        online.setForeground(Color.blue);
        sonido2.play();
        online.setText("Lido.");
        Thread.sleep(generarRandom());
        online.setText("Digitando..."); 
        Thread.sleep(generarRandom());
        online.setText("");
        sonido1.play();
        pantalla.append("Wall-e: "+ respuestaxd+"\n");
          
        //  System.out.println(generarRandom());
    }
      public void animacionpregunta(String respuestaxd) throws InterruptedException{
        sonido1 =java.applet.Applet.newAudioClip(getClass().getResource("./mensajellegada.wav"));
        Thread.sleep(1500); 
        Thread.sleep(1000);
        online.setText("ok");
        sonido1.play();
        pantalla.append("Wall-e "+ respuestaxd+"\n");
    }
    
    public int generarRandom(){
        int numero;
        numero = (int) (Math.random() * 4000) + 1000;
        return numero;
        
    }
    public void fijarTexto(){
         pantalla.append("Maquina: "+ respuesta+"\n");
        texto.setText("");
    }
    private void textoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_textoActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         String UsuarioPregunta= JOptionPane.showInputDialog("Digite sua pergunta: ");
         String respuestUsuarioPregunta= JOptionPane.showInputDialog("O que devo responder a: '"+ UsuarioPregunta+"'");
         Leer aprender =new Leer();
         String nuevapalabra=aprender.preguntanueva(UsuarioPregunta,respuestUsuarioPregunta);
         aprender.guardar(aprender.leertxt("datos.txt"), nuevapalabra);   
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public JButton enviarPresionado(){
        return enviar;
    }
    public void setPanatalla(){
        pantalla.append("Maquina: "+ respuesta+"\n");
    }
    public JTextArea regresaPantalla(){
        return pantalla;
    }
    

    public JTextField regresaTexto(){
        return texto;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Namebot;
    private javax.swing.JButton enviar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JLabel online;
    private javax.swing.JTextArea pantalla;
    private javax.swing.JTextField texto;
    // End of variables declaration//GEN-END:variables
}
