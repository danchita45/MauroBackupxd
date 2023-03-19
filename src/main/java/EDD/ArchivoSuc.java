/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDD;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

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

    private File obtenerArchivo() {
        try {
            URL url = getClass().getClassLoader().getResource("archivos/ArchivoSucs.txt");
            return new File(url.toURI());
        } catch (URISyntaxException ex) {
            ex.printStackTrace();
            return null;
        }

    }

}
