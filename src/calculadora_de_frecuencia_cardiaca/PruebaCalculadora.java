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
public class PruebaCalculadora {
     public static void main(String[] args) {
        FrecuenciasCardiacas paciente1= new  FrecuenciasCardiacas("Fernando","Zuares",1,"Marzo",1997);//Ingreso de datos del paciente 
        FrecuenciasCardiacas paciente2= new  FrecuenciasCardiacas("Pedro","Salinas",5,"Diciembre",1980);
        paciente1.mostrarMensaje();
        paciente2.mostrarMensaje();
        
    }
}
