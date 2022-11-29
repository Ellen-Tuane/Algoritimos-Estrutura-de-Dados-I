
package AeED_I.VetorDinamico;

import java.util.Scanner;

public class MainBar {
    public class Main {
        
    }
    
     public static void main(String[] args){
        //Estanciar classe vetor
        VetorD lista = new VetorD();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Entre com o número Pessoas");
        int numPessoas = Integer.parseInt(scanner.nextLine());
        
        int h = 0;
        int m = 0;
        
        while (numPessoas > 0){
            System.out.println("Entre com o número da comanda");
            
            int num = Integer.parseInt(scanner.nextLine());
                
            if (num % 2 == 0) {
                m += 1;
            } else{
                h += 1;
            }
            numPessoas -= 1;
            
            lista.adiciona(num);
        }
        
        if(h == m){
            System.out.println("s");
        }else{
            System.out.println("n");
        }
        
        System.out.println(lista);
     
     }  
}
