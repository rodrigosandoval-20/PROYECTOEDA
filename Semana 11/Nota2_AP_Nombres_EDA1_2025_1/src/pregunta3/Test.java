/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta3;

import pregunta1.*;
import tda.ListaDoble;

/**
 *
 * @author migue
 */
public class Test {
    public static void main(String[] args) {
        ListaDoble<Integer> list0 = new ListaDoble<>();
        ListaDoble<Integer> list1 = new ListaDoble<>();
        
        list0.agregar(1);
        list0.agregar(2);
        list0.agregar(-6);
        list0.agregar(11);
        list0.agregar(-7);
        list0.agregar(45);

        list1.agregar(-1);
        list1.agregar(5);
        list1.agregar(0);
        list1.agregar(56);
        list1.agregar(1);
        list1.agregar(0);
        
        ListaDoble<Integer> res = ListaDoble.procedure(list0, list1);
        res.mostrar();
    }
}
