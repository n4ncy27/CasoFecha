package modelo;

public class Fecha
{
    //------------------
    //-- ATRIBUTOS -----
    //------------------
    protected int dia;
    protected int mes;
    protected int anio;

    //------------------
    //---- METODOS -----
    //------------------

    //Constructor con tres parametros
    public Fecha(int dia, int mes, int anio)
    {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    // Constructor sin parametros
    public Fecha()
    {
        this.dia = 0;
        this.mes = 0;
        this.anio = 0;
    }

    // Constructor con parametros String dd/mm/aaaa
    public Fecha(String s)
    {
        /*String[] fecha = s.split("/");
        this.dia = Integer.parseInt(fecha[0]);
        this.mes = Integer.parseInt(fecha[1]);
        this.anio = Integer.parseInt(fecha[2]);/* */

        //Buscamos la primera ocurrencia de /
        int pos1 = s.indexOf('/');

        //Buscamos la ultima ocurrencia de /
        int pos2 = s.indexOf('/'); 

        //Extraemos el dia 
        String sDia = s.substring(0, pos1);
        dia = Integer.parseInt(sDia);

        //Extraemos el Mes
        String sMes = s.substring(pos1+1 , pos2);
        dia = Integer.parseInt(sMes);

        //Extraemos el Año
        String sAnio = s.substring(pos2+1);
        dia = Integer.parseInt(sAnio);
    }

    // Metodos de acceso (setter y getter)
    public void setAnio(int anio) 
    {
        this.anio = anio;
    }

    public void setMes(int mes) 
    {
        this.mes = mes;
    }
    
    public void setDia(int dia) 
    {
        this.dia = dia;
    }

    public int getAnio() 
    {
        return anio;
    }

    public int getMes() 
    {
        return mes;
    }

    public int getDia() 
    {
        return dia;
    }

    // Metodo sobre escrito de la Clase Object
    public String toString()
    {
        return dia + "/" + mes + "/" + anio;
    }

    public boolean equals(Object o)
    {
        Fecha otra = (Fecha)o;
        return (dia==otra.dia) && (mes==otra.mes) && (anio==otra.anio);
    }

    public void addDias(int d)
    {
        int sum = fechaToDias() + d;
        diasToFecha(sum);
    }

    private int fechaToDias()
    {
        return anio*360 + mes*30 + dia;
    }

    private void diasToFecha(int dias)
    {
        this.anio = dias / 360;
                this.mes = dias % 360 / 30;
                this.dia = dias % 360 % 30;
    } 
}