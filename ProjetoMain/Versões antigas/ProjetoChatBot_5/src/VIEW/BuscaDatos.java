package VIEW;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

public class BuscaDatos extends FileController{
     /** Local onde está o arquivo com os dados */
    private static final String DATABASE = "./datos.txt";
    
    /** Leitor utilizado para consultar os dados do arquivo .txt */
    private RandomAccessFile fileReader;
    

    //Pega os dados do fileReader e acessa os dados.
    
    public BuscaDatos() {
        super(DATABASE);
        try {
            fileReader = new RandomAccessFile(file, "r");
           
        } catch (FileNotFoundException e) {
             JOptionPane.showMessageDialog(
                null,
                "Error database.txt",
                "Error database.txt",
                JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
        }
    }
    
        // String translation utilizada para retornar caso o usuário digite informações diferentes do txt
    public String translate(String word)
    {
        String translation = "Desculpa, não entendi como posso ajudar?";
        String palavraGuardada="";
        String palavra=word;
        int contador=0, contador2=0;
 
        try
        {
            String line = fileReader.readLine();
            boolean encontro=false;
            while(line != null && encontro != true)
            {
                String[] tupla = line.split("#");
                String[] tuplados =palavra.split(" ");

                for (int i=0;i<=tuplados.length-1;i++){ 
                    for(int j=0;j<=tupla.length-1;j++){
                        if (tuplados[i].equalsIgnoreCase(tupla[j]))
                        {
                            translation = tupla[tupla.length-1];
                            contador++;
                        }
                    }
                }
               if (contador>=contador2){
                   contador2=contador;
                   palavraGuardada=translation;
               }
                contador=0;
                line = fileReader.readLine();
            }
           //  System.out.println("palavra acumulada : "+ palavraGuardada);
        }

        catch (IOException ioe)
        {
            JOptionPane.showMessageDialog(
                null,
                "Error ao ler a base de dados.txt",
                "Error database",
                JOptionPane.ERROR_MESSAGE);
            ioe.printStackTrace();
        }

        finally
        {
            try
            {
                fileReader.close();
            }

            catch (IOException ioe)
            {
                JOptionPane.showMessageDialog(
                    null,
                    "Error, sem retorno na consulta da database",
                    "Error, base de dados == null",
                    JOptionPane.ERROR_MESSAGE);
                ioe.printStackTrace();
            }
        }

        return palavraGuardada;
    }
}
    
