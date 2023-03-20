/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author danchita45
 */
public class IngresoEgreso
{

    double monto;
    String fecha;
    double descuento;
    int sucursal;
    int EI;
    

    public IngresoEgreso()
    {
    }

    public IngresoEgreso(double monto, String fecha, double descuento, int sucursal, int EI) {
        this.monto = monto;
        this.fecha = fecha;
        this.descuento = descuento;
        this.sucursal = sucursal;
        this.EI = EI;
    }

    public int getSucursal() {
        return sucursal;
    }

    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }

    public int getEI() {
        return EI;
    }

    public void setEI(int EI) {
        this.EI = EI;
    }

   

    public double getMonto()
    {
        return monto;
    }

    public void setMonto(double monto)
    {
        this.monto = monto;
    }

    public String getFecha()
    {
        return fecha;
    }

    public void setFecha(String fecha)
    {
        this.fecha = fecha;
    }

    public double getDescuento()
    {
        return descuento;
    }

    public void setDescuento(double descuento)
    {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return  monto + ";" + fecha + ";" + descuento + ";" + sucursal + ";" + EI + ';';
    }
}
