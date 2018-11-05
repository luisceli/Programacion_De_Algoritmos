/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_de_frecuencia_cardiaca;

/**
 *
 * @author Usuario
 */
public class FrecuenciasCardiacas {

    String Nombre;
    String Apellido;
    int dia;
    String mes;
    int anio;
   
    public FrecuenciasCardiacas() {
    }
    //Contructor vacio  para si se necestia  un objeto sin datos

    /*
     * Crea un objeto asignando todos los valores para los tres atributos de la
     * clase como:
   
     * param nombre Es el nombre (uno o dos) para un determinado paciente 
     * param apellido Segundo nombre (uno o dos) para cada paciente
     * param dia  en numero entero que representa un dia del mes
     * param mes Es el nombre(uno o dos) para un determinado paciente
     * param anio Es es año (uno o dos) para un determinado paciente
     */
    public FrecuenciasCardiacas(String Nombre, String Apellido, int dia, String mes, int anio) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }// fin del constructor

    //Obtiene el nombre del paciente
    public String getNombre() {
        return Nombre;
    }// Fin del metodo getNombre()

    //Asigna el nombre para un paciente
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }// Fin del metodo setNombre(String)

    //Obtiene el apellido del paciente
    public String getApellido() {
        return Apellido;
    }//Fin del metodo getApellido()

    //Asigna el apellido para un paciente
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }//Fin del metodo setApellido(String)

    //Obtiene el dia para la fecha de nacimiento de un paciente
    public int getDia() {
        return dia;
    }//Fin del metodo getDia()

    //Asigna el dia para la fecha de nacimiento de un paciente
    public void setDia(int dia) {
        this.dia = dia;
    }//Fin del metodo setDia(int)

    //Obtiene el mes para la fecha de nacimiento de un paciente
    public String getMes() {
        return mes;
    }//Fin del metodo getMes()

    //Asigna el mes para la fecha de nacimiento de un paciente
    public void setMes(String mes) {
        this.mes = mes;
    }//Fin del metodo setMes(String)

    //Obtiene el año para la fecha de nacimiento de una paciente
    public int getAnio() {
        return anio;
    }//Fin del metodo getAnio()

    //Asigna el año para la fecha de nacimiento de un paciente
    public void setAnio(int anio) {
        this.anio = anio;
    }//Fin del metodo setAnio(int)

    //Obtiene la edad de un paciente
    public int getEdad() {
        int edad;
        edad = 2018 - this.anio;
        return edad;
    }//Fin del metodo getEdad()

    //Obtiene la frecuencia cardiaca maxima de un paciente
    public int getFrecuenciaCardiMaxima() {
        int edad;
        int frecuencia;
        edad = 2018 - this.anio;
        frecuencia = 220 - edad;
        return frecuencia;
    }//Fin del metodo getFrecuenciaCardiMaxima() 

    //Obtiene la frecuencia cardiaca esperada  en un 50% de un paciente
    public double getFrecuenciaCardiEsperada() {
        int edad;
        int frecuencia;
        double frecuenciaEsper;
        edad = 2018 - this.anio;
        frecuencia = 220 - edad;
        frecuenciaEsper = frecuencia * 0.5;
        return frecuenciaEsper;
    }// Fin del metodo getFrecuenciaCardiEsperada()

    //Obtiene la frecuencia cardiaca esperada en un 85% de un paciente 
    public double getFrecuenciaCardiEsperada2() {
        int edad;
        int frecuencia;
        double frecuenciaEsper;
        edad = 2018 - this.anio;
        frecuencia = 220 - edad;
        frecuenciaEsper = frecuencia * 0.85;
        return frecuenciaEsper;
    }//Fin del metodo getFrecuenciaCardiEsperada2()

    //Para cuando se desea presentar los valores del objeto
    //Éste tostring() esta sobrecargado de la Clase java.lang.Object.class.toString()
    @Override
    public String toString() {
        return (getNombre() + " " + getApellido() + " " + getDia() + " " + getMes() + " " + getAnio() + " "
                + getEdad() + " " + getFrecuenciaCardiMaxima() + " " + getFrecuenciaCardiEsperada()
                + getFrecuenciaCardiEsperada2());
    }//Fin del metodo toString()

    //Metodo para todos los sout y facilitar su presentacion en el main()
    public void mostrarMensaje() {
        System.out.println("Calculadora de la Frecuenci cardiaca esperada\n");
        System.out.println("Nombre del paciente :  " + getNombre());//se llama al toString para presentar  los valores del objeto
        //Formula alternativa y más eficiente
         System.out.println("Apellido del paciente: " + getApellido());
        System.out.println("La edad  del paciente es: "+getEdad());
        System.out.println("Fecha de nacimiento " + getDia()+" " + getMes()+" " + getAnio());
        System.out.println("La frecuencia Cardiaca maxima es: " + getFrecuenciaCardiMaxima());
        System.out.println("La frecuencia esperada del 50% es: " + getFrecuenciaCardiEsperada());
        System.out.println("La frecuencia esperada del 80% es: " + getFrecuenciaCardiEsperada2());
        System.out.println("");
    }//Fin del metodo mostrarMensaje()
}
