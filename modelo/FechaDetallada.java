package modelo;

public class FechaDetallada extends Fecha
{
    String[] Mes = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    

    public FechaDetallada(int dia, int mes, int anio) 
    {
        super(dia, mes, anio);
    }

    public String mesToString() 
    {
        return Mes[this.mes - 1];
    }

    @Override
    public String toString() 
    {
        return dia + " de " + mesToString() + " de " + anio;
    }

}