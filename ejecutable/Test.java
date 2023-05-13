package ejecutable;

import modelo.Fecha;

public class Test
{
    public static void main(String[] args)
    {
      Fecha f1 = new Fecha(2,10, 1970);
        f1 .setDia(2);
        f1 .setMes(10);
        f1 .setAnio(1970);

        System.out.println("Dia: " + f1.getDia());
        System.out.println("Mes: " + f1.getMes());
        System.out.println("Anio: " + f1.getAnio());
        System.out.println(f1);

    
        Fecha f2 = new Fecha(2,10, 1970);
        f2.setDia(3);
        f2.setMes(11);
        f2.setAnio(1975);

        System.out.println(f1.equals(f2)); // esto es para comparar dos fechas
        
        //if (f1 == f2) // esto es para comparar dos fechas
        if (f1.equals(f2))
        {
            System.out.println("Son iguales");
        }
        else
        {
            System.out.println("Son distintos");
        }

        
    }
}