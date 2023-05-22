/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_10_escribir_archivos_txt;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author hp
 */
public class EVA3_10_ESCRIBIR_ARCHIVOS_TXT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
      String ruta="C:\\archivos pm\\";
        
        

        
        
        try {
            writeUsingBufferedWriter(ruta+"archivoB.txt"," al 100 \n"+"si anda jalado con todo");
        } catch (IOException ex) {
            Logger.getLogger(EVA3_10_ESCRIBIR_ARCHIVOS_TXT.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    
    
    
    
    
    
    
    public static void writeUsingFiles(String ruta ,String datos) throws IOException{
        Path path=Paths.get(ruta);
        Files.write(path,datos.getBytes());
    }
    
    
    public static void writeUsingFileWriter(String ruta, String datos) throws IOException{
        File file=new File(ruta);
        FileWriter fileWriter=new FileWriter(file);
        fileWriter.write(datos);

        fileWriter.close();
    }
    
    
    
    public static void writeUsingBufferedWriter(String ruta ,String datos) throws IOException{//pide writes
        File file=new File(ruta);
        FileWriter fileWriter=new FileWriter(file);
        BufferedWriter bufWriter=new BufferedWriter(fileWriter);
        
        for (int i = 0; i < 10; i++) {
            bufWriter.write(i+" - "+datos);
            bufWriter.write("\n");
        }
        
        bufWriter.close();
        fileWriter.close();

    }
    
}