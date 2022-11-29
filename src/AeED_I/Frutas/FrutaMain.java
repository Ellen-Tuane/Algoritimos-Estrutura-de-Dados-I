
package AeED_I.Frutas;

import static AeED_I.Fibonacci.FibonacciMain.fibo;
import java.util.Scanner;

public class FrutaMain {
    public static void main(String[] args){
         
        // Estancia o vetor
        FrutaVetor fruta = new FrutaVetor();
        
        
    
        System.out.println("entre valor");
        Scanner scanner = new Scanner(System.in);
        
        for(int i=1; i<=5; i++){
            fruta.adiciona(scanner.nextLine());
         }
        

        System.out.println(fruta);
     }
}
