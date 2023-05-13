package modelo;

public class Fecha {
    
    //----------------
    //Atributos-------
    //----------------

    private int dia;
    private int mes;
    private int anio;

    //----------------
    //Metodos---------
    //----------------

    //se crea objetos de la clase Fecha pansandoles los parametros a traves del controlador 
    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }


    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    

    public String toString(){ //metodo que devuelve un string con la fecha
        return dia + "/" + mes + "/" + anio; //devuelve un string con la fecha
    }

    public boolean equals(Object o){ //metodo que compara dos fechas
            Fecha otra = (Fecha) o; //casteo de objeto a fecha
            return (dia==otra.dia) && (mes==otra.mes) && (anio==otra.anio); //devuelve true si las fechas son iguales
        }
    
    

    


  
    




}
