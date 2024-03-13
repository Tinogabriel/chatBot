
package VIEW;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class Leer {
    File file = new File("datos.txt");
    public String leertxt(String direccion){
        String texto="";
        try {
            BufferedReader bf=new BufferedReader(new FileReader(direccion));
            String temporal="";
            String bfread;
            while ((bfread=bf.readLine()) !=null){
                temporal=temporal+bfread+"\r\n";
            }
            texto=temporal;
        } catch (Exception e) {
        }
        return texto;
    }
    public String preguntanueva(String pregunta,String respuesta){
        
        //String myword="";
       // String resposta=""; 
        String novaPalavra="";
        String[] tupla3=pregunta.split(" ");
        //System.out.println(tupla3[0]);
        for (int i=0;i<=tupla3.length-1;i++){
            if(i==tupla3.length-1){
                 novaPalavra=novaPalavra+tupla3[i]+"#"+tupla3[i]+"?"+"#"+respuesta;
            }else if (tupla3[i].equalsIgnoreCase("que")|| tupla3[i].equalsIgnoreCase("es")||tupla3[i].equalsIgnoreCase("un")||tupla3[i].equalsIgnoreCase("de")||tupla3[i].equalsIgnoreCase("hijo")){
                continue;
            }else {
            novaPalavra=novaPalavra+tupla3[i]+"#";}
        }
        System.out.println(novaPalavra);
       // palavra.guardar(palavra.leertxt("fileName1.txt"), novaPalavra);
        return novaPalavra;
    }
    public void guardar(String contenidoAnteriorTxt, String novapalavra){
        try {
		if(!file.exists()) {
				file.createNewFile();	
		}
		
		PrintWriter pw = new PrintWriter(file);
               // pw.write(leertxt("fileName1.txt"));
                //String palavra=leertxt("fileName1.txt");
                pw.append(contenidoAnteriorTxt + novapalavra);
                
               // pw.append(leertxt("fileName1.txt"))
		
                
		pw.close();
		System.out.println("Done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
}
