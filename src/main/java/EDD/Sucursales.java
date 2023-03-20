/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import java.io.Serializable;

/**
 *
 * @author danchita45
 */
public class Sucursales implements Serializable
{

    int noSuc;
    String nombre;
    int zona;
    ListaDoblementeLigada cI;
    ListaDoblementeLigada cE;

    @Override
    public String toString()
    {
        return  noSuc + ";" + nombre + ";" + zona+";" ;
    }

    public int getNoSuc()
    {
        return noSuc;
    }

    public void setNoSuc(int noSuc)
    {
        this.noSuc = noSuc;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getZona()
    {
        return zona;
    }

    public void setZona(int zona)
    {
        this.zona = zona;
    }

    public Object getcI()
    {
        return cI;
    }

    public void setcI(ListaDoblementeLigada cI)
    {
        this.cI = cI;
    }

    public Object getcE()
    {
        return cE;
    }

    public void setcE(ListaDoblementeLigada cE)
    {
        this.cE = cE;
    }

    public Sucursales(int noSuc, String nombre, int zona, ListaDoblementeLigada cI, ListaDoblementeLigada cE)
    {
        this.noSuc = noSuc;
        this.nombre = nombre;
        this.zona = zona;
        this.cI = cI;
        this.cE = cE;
    }

    public Sucursales()
    {
    }

}
