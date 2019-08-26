package com.company;

public class Main {

    public static void main(String[] args) {

        // Creamos la impresora

        Impresora unaImpresora = new Impresora();

        //Creamos documento, foto y contrato

        Imprimible unaFoto = new Foto();
        Imprimible unContrato = new Contrato();
        Imprimible unDocumento = new Documento();

        unaImpresora.agregarImprimible(unaFoto);
        unaImpresora.agregarImprimible(unContrato);
        unaImpresora.agregarImprimible(unDocumento);

        unaImpresora.imprirTodo();


    }
}
