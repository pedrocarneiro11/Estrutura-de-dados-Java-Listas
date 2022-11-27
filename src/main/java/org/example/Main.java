package org.example;

import one.digitalinnovation.ListaEncadeada.ListaEncadeada;

public class Main {
    public static void main(String[] args) {
                             /* TESTE PARA A ListaEncadeada */
        ListaEncadeada<String> ListaEncadeada = new ListaEncadeada<>();

        ListaEncadeada.add("teste1");
        ListaEncadeada.add("teste2");
        ListaEncadeada.add("teste3");
        ListaEncadeada.add("teste4");

        System.out.println(ListaEncadeada.get(0));
        System.out.println(ListaEncadeada.get(1));
        System.out.println(ListaEncadeada.get(2));
        System.out.println(ListaEncadeada.get(3));

        System.out.println(" ");

        System.out.println(ListaEncadeada);

        System.out.println(ListaEncadeada.remove(3));

        System.out.println(ListaEncadeada);
    }
}