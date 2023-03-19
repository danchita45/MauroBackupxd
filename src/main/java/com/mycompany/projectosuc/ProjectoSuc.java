/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projectosuc;

import EDD.ArchivoSuc;
import EDD.Sucursales;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 *
 * @author danchita45
 */
public class ProjectoSuc {

    public static void main(String[] args) {
        MenuPrinc menu = new MenuPrinc();
        LinkedList<EDD.Sucursales> sucs= null;
        EDD.ArchivoSuc  archivo = new ArchivoSuc("sucursales.txt");
        LinkedList<String> lineas = archivo.obtenerTexto();
        if(lineas !=null){
            sucs = new LinkedList();
            for (int i = 0; i < lineas.size(); i++) {
                String linea = lineas.get(i);
                StringTokenizer tokens = new StringTokenizer(linea,";");
                int NoSuc = Integer.parseInt(tokens.nextToken());
                String nombre = tokens.nextToken();
                int description = Integer.parseInt(tokens.nextToken());
                //ya teniendo todas las cosas leídas desde el archivo lo agregamos 
                //lo agregamos a la lista como deba de ser;
                //el pedo aqui va a ser como leer bien el objeto ya que lo vamos a tener que serializar
                
            }
            
        }
        
        
        
        menu.setVisible(true);
    }
    
    
}
