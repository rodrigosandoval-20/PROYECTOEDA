/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta2;

import tda.ListaCircularSimple;

/**
 *
 * @author migue
 */
public class Test {
    public static void main(String[] args) {
        ListaCircularSimple<Integer> lista = new ListaCircularSimple<>();
        
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.agregar(4);
        lista.agregar(5);
        lista.agregar(6);
        lista.agregar(7);

        lista.mostrar();
        
        lista.eliminarDesde(5, 5);
        
        lista.mostrar();
    }
}
