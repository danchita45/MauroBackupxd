/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author danchita45
 */
public class Sucursales
{

    int noSuc;
    String nombre;
    int zona;
    Object cI;
    Object cE;

    @Override
    public String toString()
    {
        return "Sucursales{" + "noSuc=" + noSuc + ", nombre=" + nombre + ", zona=" + zona + ", cI=" + cI + ", cE=" + cE + '}';
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

    public void setcI(Object cI)
    {
        this.cI = cI;
    }

    public Object getcE()
    {
        return cE;
    }

    public void setcE(Object cE)
    {
        this.cE = cE;
    }

    public Sucursales(int noSuc, String nombre, int zona, Object cI, Object cE)
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
