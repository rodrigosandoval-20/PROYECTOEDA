/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta4;

import pregunta1.*;
import tda.Cola;

/**
 *
 * @author migue
 */
public class Test {
    public static void main(String[] args) {
        TemperaturaHandler programa = new TemperaturaHandler();
        
        Cola<Integer> cola = new Cola<>();
        cola.encolar(12);
        cola.encolar(20);
        cola.encolar(-60);
        cola.encolar(27);
        cola.encolar(150);
        cola.encolar(200);
        cola.encolar(18);
        cola.encolar(5);
        
        programa.process(cola);
    }
}
