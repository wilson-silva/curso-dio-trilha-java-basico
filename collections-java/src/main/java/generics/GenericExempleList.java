package main.java.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericExempleList {

    public static void main(String[] args) {
        //Exemplo sem Generics
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10); //permite adicionar qualquer tipo de objeto

        //Exemplo com Generics
        List<String> listaGenerics = new ArrayList();
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");

        // Iterando sobre a lista com Generics
        for (String elemento : listaGenerics) {
            System.out.println(elemento);
        }

        System.out.println();

        // Iterando sobre a lista sem Generics (necessário fazer cast)
        for (Object elemento : listaSemGenerics) {
            String str = String.valueOf(elemento);
            System.out.println(str);
        }

    }

}
