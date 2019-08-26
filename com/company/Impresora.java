package com.company;

import java.util.ArrayList;
import java.util.List;

public class Impresora {


   private List<Imprimible> listaImprimibles;

   public Impresora(){
       listaImprimibles = new ArrayList<>();

   }


    public void imprirTodo(){
        for (Imprimible unImprimible : listaImprimibles){
            unImprimible.imprimir();
        }
    }

    public void agregarImprimible (Imprimible unImprimible){
        this.listaImprimibles.add(unImprimible);

    }


}
