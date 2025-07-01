/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta4;

import tda.Cola;

/**
 *
 * @author migue
 */
public class TemperaturaHandler {    
    public Cola<Integer>[] process(Cola<Integer> cola) {      
        Cola<Integer> aux = new Cola<>();
        Cola<Integer> colaProcesar = new Cola<>();
        Cola<Integer> colaNormales = new Cola<>();
        Cola<Integer> colaFueraRango = new Cola<>();
        
        while (!cola.esVacia()) {
            Integer item = cola.desencolar();
            
            if (item >= -50 && item <= 150) colaProcesar.encolar(item);
            
            aux.encolar(item);
        }
        
        while (!aux.esVacia()) {
            cola.encolar(aux.desencolar());
        }
        
        while (!colaProcesar.esVacia()) {
            Integer item = colaProcesar.desencolar();
            
            if (item >= 15 && item <= 25) colaNormales.encolar(item);
            else colaFueraRango.encolar(item);
        }
        
        print(cola, "Cola original: ");
        print(colaNormales, "Cola normal: ");
        print(colaFueraRango, "Cola fuera de rango: ");
        
        return new Cola[] { colaNormales, colaFueraRango };
    }
    
    private void print(Cola<Integer> cola, String nombre) {
        Cola<Integer> aux = new Cola<>();
        System.out.print(nombre + "\t");
        
        while (!cola.esVacia()) {
            Integer item = cola.desencolar();
            aux.encolar(item);
            
            System.out.print(item.toString() + "\t");
        }
        
        System.out.println("");
        
        while (!aux.esVacia()) {
            cola.encolar(aux.desencolar());
        }
    }
}
