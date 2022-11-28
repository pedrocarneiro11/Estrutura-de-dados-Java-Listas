package org.example;

import one.digitalinnovation.ListaDuplamenteEncadeada.ListaDuplamenteEncadeada;
import one.digitalinnovation.ListaEncadeada.ListaEncadeada;

public class Main {
    public static void main(String[] args) {
        // Caso queira testar cada classe, remova os simbolos de comentado no codigo abaixo :
        /* <------------------------------------         ------------------------------------> */
                             /* TESTE PARA A ListaEncadeada */

        /*
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
        */
        /* <------------------------------------         ------------------------------------> */
                           /* TESTE PARA A ListaDuplamenteEncadeada */

        ListaDuplamenteEncadeada<String> minhaListaEncadeada = new ListaDuplamenteEncadeada<>();

        minhaListaEncadeada.add("c1");
        minhaListaEncadeada.add("c2");
        minhaListaEncadeada.add("c3");
        minhaListaEncadeada.add("c4");
        minhaListaEncadeada.add("c5");
        minhaListaEncadeada.add("c6");
        minhaListaEncadeada.add("c7");

        System.out.println(" ");
        System.out.println(minhaListaEncadeada);
        System.out.println(" ");

        minhaListaEncadeada.remove(3);
        minhaListaEncadeada.add(3,"P2");

        System.out.println("Removendo a string c3 no indice 3 e colocando outra string no lugar:");
        System.out.println(minhaListaEncadeada);
        System.out.println(" ");
        System.out.println("Imprimindo o elemento de indice 3: ");
        System.out.println(minhaListaEncadeada.get(3));

    }
}