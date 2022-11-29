
package AeED_I;

import java.util.Scanner;

/**
 *
 * @author ellentuane
 */
public class AtividadeSala {
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    

    public static void main(String[] args) {
        AtividadeSala n = new AtividadeSala();
        n.setN(3);
        
        if( n.getN() != 0){
            String[] lista = new String[n.getN()];
            
            for (int k = 0; k < f; k++){
                System.out.println("entre valor");
                Scanner scanner = new Scanner(System.in);
                String inputString = scanner.nextLine();
                lista[k] = inputString;
            }
            for(int i = 0; i < lista.length; i++) {
                System.out.println(lista[i]);
        }
           
        }else{
            System.out.println("Lista vazia");
        }
    
    
    }
}
