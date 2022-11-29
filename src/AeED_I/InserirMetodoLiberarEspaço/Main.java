package AeED_I.InserirMetodoLiberarEspaço;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Estanciar classe vetor
        VetorD lista = new VetorD();
        Object num = new Object();

        num.setNum(1);

        lista.adiciona(num);
        num = new Object();

        num.setNum(2);
        lista.adiciona(num);

    }
}
