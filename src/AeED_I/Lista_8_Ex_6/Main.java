package AeED_I.Lista_8_Ex_6;

import AeED_I.QuadradosPerfeitos.*;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        //Estanciar classe vetor
        Vetor lista = new Vetor();
        Dados num = new Dados();
            
        num.setNum(9);
        lista.adiciona(num);
        num = new Dados();

        num.setNum(10);
        lista.adiciona(num);
        num = new Dados();

        num.setNum(15);
        lista.adiciona(num);
        num = new Dados();

        System.out.println(lista.pega(5));
            

    }    
}
    
