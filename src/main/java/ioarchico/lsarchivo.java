/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ioarchico;

import EDD.ListaDoblementeLigada;
import EDD.Sucursales;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Danchita45
 */
public class lsarchivo {

    public boolean InsertarnuevaLista(Object lista) throws IOException {
        File arch = new File("listas.dat");
        arch.delete();
        File archivo = new File("listas.dat");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(archivo, true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(lsarchivo.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(fos);
        } catch (IOException ex) {
            Logger.getLogger(lsarchivo.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        oos.writeObject(lista);
        oos.close();
        fos.close();
        return true;
    }

    public ListaDoblementeLigada SacaDatos() {
        File archivo = new File("listas.dat");
        ListaDoblementeLigada np = null;
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois;
            while (fis.available() > 0) {
                ois = new ObjectInputStream(fis);
                np = (ListaDoblementeLigada) ois.readObject();
                System.out.println(np);
            }
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        return np;
    }

}
