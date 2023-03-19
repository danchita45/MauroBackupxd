/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDD;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author D45
 */
public class ArchivoSuc {

    String nombre;

    public ArchivoSuc() {
    }

    public ArchivoSuc(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<String> obtenerTexto(){
        LinkedList<String> lineas=null;
        try {
            File archivo = obtenerArchivo();
            if(archivo.exists()){
                lineas= new LinkedList();
                BufferedReader br = new BufferedReader(new FileReader(archivo));
                String linea;
                while((linea = br.readLine())!=null){
                    System.out.println(linea);
                    lineas.add(linea);
                    
                }
                br.close();
                
            }else{
                JOptionPane.showMessageDialog(null, "El archivo no Existe");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "se ha producido un error");
            
        }
        return lineas;
    }
    private File obtenerArchivo() {
        try {
            URL url = getClass().getClassLoader().getResource("archivos/"+nombre);
            return new File(url.toURI());
        } catch (URISyntaxException ex) {
            ex.printStackTrace();
            return null;
        }

    }

}
