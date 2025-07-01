/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta1;

import tda.Lista;

/**
 *
 * @author migue
 */
public class Test {
    public static void main(String[] args) {
        Lista<Integer> lista = new Lista<>();
        
        lista.agregar(1);
        lista.agregar(6);
        lista.agregar(9);
        lista.agregar(12);
        lista.agregar(9);
        lista.agregar(15);

        lista.mostrar();
        lista.contarDuplicados(9);
    }
}
