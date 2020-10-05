/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistnotas;

import java.util.ArrayList;

/**
 *
 * @author Notebook
 */
public class ArrayListNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Array Listado Notas
        ArrayList<Integer> Notas = new ArrayList<Integer>();
        
        //Agregar valores al Listado de Notas
         Notas.add(10);
         Notas.add(5);
         Notas.add(8);
         Notas.add(9);
       
        //Mostrar notas
        System.out.println(".::PRINT::.");
        System.out.println(Notas);
        
        //Mostrar una nota
        System.out.println(".::GET::.");
        System.out.println(Notas.get(1));
        
        //Cambiar valor de nota
        System.out.println(".::Cambiar Valor::.");
        Notas.set(1,20);
        System.out.println(Notas);
        
        //Eliminar valor de nota
        System.out.println(".::Eliminar Valor::.");
        Notas.remove(0);
        System.out.println(Notas);
        
        //Limpiar ArrayList Notas
        /* 
        System.out.println(".::Limpar ArrayList::.");
         Notas.clear();
         System.out.println(Notas);
         Notas.add(2);
         if(Notas.isEmpty()){
             System.out.println("No hay valores en el listado de notas");
         }
        */
        
        //Iterar en la lista de notas
        //for
        System.out.println(".::FOR::.");
        for(int i = 0; i < Notas.size(); i++){
            System.out.println(Notas.get(i));
        }
        
        // for+
        System.out.println(".::FOR+::.");
        for(int n : Notas){
            System.out.println(n);
        }
        
        //Foreach
        System.out.println(".::Foreach::.");
        Notas.forEach((n) -> System.out.println(n));
        
        
       
        
        System.out.println("Size -> " + Notas.size());

        
        
        
        
        
        
        
    }
    
}
