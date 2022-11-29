package AeED_I.Pilha;

import AeED_I.Pilha.Pilha;

public class mainPilha {
    public static void main(String[] args){
        Pilha p1 = new Pilha();
    
        p1.push("Rosa");
        p1.push(1);
        
        System.out.println(p1.pop());
        System.out.println(p1.pop());
        System.out.println(p1.pop());
        
        
        
    }

    
}
