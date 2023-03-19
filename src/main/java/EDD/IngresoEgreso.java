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

    public IngresoEgreso()
    {
    }

    public IngresoEgreso(double monto, String fecha, double descuento)
    {
        this.monto = monto;
        this.fecha = fecha;
        this.descuento = descuento;
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
    public String toString()
    {
        return "IngresoEgreso{" + "monto=" + monto + ", fecha=" + fecha + ", descuento=" + descuento + '}';
    }
    

}
