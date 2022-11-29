
package AeED_I.Fila;

import AeED_I.Pilha.Pilha;

public class MainFila{
    public static void main(String[] args){
        Fila fila = new Fila();
    
        fila.Insere("1 - Rosa");
        fila.Insere(2);
        fila.Insere("3 - Julia");
        
        while(!fila.fEmpty()){
            System.out.println(fila.remover());
        }  
    }
}
