package VIEW;

//Bibliotecas impor
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.applet.AudioClip;
import java.io.IOException;
import java.net.URISyntaxException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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
        jPanel2 = new javax.swing.JPanel();
        texto = new javax.swing.JTextField();
        enviar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pantalla = new javax.swing.JTextArea();
        label1 = new java.awt.Label();
        Namebot = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        online = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

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
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        texto.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        texto.setForeground(new java.awt.Color(0, 51, 204));
        texto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        texto.setCaretColor(new java.awt.Color(0, 204, 204));
        texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoActionPerformed(evt);
            }
        });

        enviar.setBackground(new java.awt.Color(255, 255, 255));
        enviar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        enviar.setForeground(new java.awt.Color(0, 51, 204));
        enviar.setText("Enviar");
        enviar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255)));
        enviar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        pantalla.setEditable(false);
        pantalla.setColumns(20);
        pantalla.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        pantalla.setForeground(new java.awt.Color(0, 51, 204));
        pantalla.setRows(5);
        pantalla.setText("Wall-e: Olá, digite sua dúvida sobre comandos do windows =)\n");
        pantalla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        pantalla.setCaretColor(new java.awt.Color(0, 204, 204));
        jScrollPane1.setViewportView(pantalla);

        label1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("WALL-E: ");

        Namebot.setBackground(new java.awt.Color(0, 204, 255));
        Namebot.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Namebot.setForeground(new java.awt.Color(0, 51, 204));
        Namebot.setText("Suporte Windows");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton1.setText("Ensinar");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 153, 255), new java.awt.Color(51, 153, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        online.setBackground(new java.awt.Color(255, 0, 0));
        online.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        online.setForeground(new java.awt.Color(255, 255, 255));

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton2.setText("limpar chat");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 102, 255), null));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(texto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(online, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(Namebot, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Namebot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(online, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(texto)
                    .addComponent(enviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        enviar.getAccessibleContext().setAccessibleName("enviar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Logica para se o usuario digitar algo diferente do que há no TXT ele perguntar se o usuario quer ensinar
    
    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        
        Thread hilo;
        hilo = new Thread(new Runnable() {
            @Override
            
            
            
            public void run() {
                try {
                    
                    pregunta=texto.getText();
                    respuesta=(new BuscaDatos().translate(texto.getText()));
                    //preguntagenerada=(new BuscaDatos().translate(generarpregunta()));
                    pantalla.append("Você: "+texto.getText() +"\n");
                    texto.setText(""); //apresenta no texto do chat boot
                    animacionEscribir(respuesta);
                    int probabilidad=mitadProbabilidad();
                    //System.out.println(probabilidade);
                   
                    if (respuesta.equalsIgnoreCase("Desculpa, não entendi como posso ajudar?")){
                        pantalla.append("Wall-e: Poderia me ensinar a responder essa pergunta?  '"+pregunta+"' \n");
                        String respuestUsuario= JOptionPane.showInputDialog("Deseja ensinar? (Sim ou Não)");
                        if (respuestUsuario.equalsIgnoreCase("sim")){
                            String respuestUsuarioPregunta= JOptionPane.showInputDialog("O que devo responder a: '"+pregunta+"'");
                            Leer aprender =new Leer();
                            String novapalavra=aprender.preguntanueva(pregunta,respuestUsuarioPregunta);
                            aprender.guardar(aprender.leertxt("datos.txt"), novapalavra);
                        }
                    }
                } catch (Exception e) {
                }
            }
        });
        hilo.start();
       
        KeyAdapter keyAdapter = new KeyAdapter() {
                    public void keyPressed(KeyEvent evt) {
                    if (evt.getKeyCode() == evt.VK_ENTER) {                    
                        //comando que faz enviar com a tecla enter
                    }
                    }
                    };
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
        numero = (int) (Math.random() * 100) + 1000;
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
         aprender.guardar(aprender.leertxt("src/VIEW/datos.txt"), nuevapalabra);   
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        pantalla.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JLabel online;
    private javax.swing.JTextArea pantalla;
    private javax.swing.JTextField texto;
    // End of variables declaration//GEN-END:variables
}
