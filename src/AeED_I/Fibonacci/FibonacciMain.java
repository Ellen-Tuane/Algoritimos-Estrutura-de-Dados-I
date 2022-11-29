
package AeED_I.Fibonacci;

import java.util.Scanner;

public class FibonacciMain {
    
    static int fibo(int n){
        if (n < 2){
            return n;
        }else{
            return fibo(n -1) + fibo(n -2);
        }
    }
    
    public static void main(String[] args){
         
        FibonacciVetor lista = new FibonacciVetor();
        FibonacciDados numeros = new FibonacciDados();
    
        System.out.println("entre valor");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
    
        for(int i=1; i<=n; i++){

            numeros.setNum(fibo(i));
            lista.adiciona(numeros);
            numeros = new FibonacciDados();
        }
        

        System.out.println(lista);
     }
    
    
}
