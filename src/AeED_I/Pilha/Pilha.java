
package AeED_I.Pilha;

import AeED_I.VetorDinamico.VetorD;

public class Pilha {
    VetorD lista = new VetorD();
    
    public void push(Object objeto) {
        lista.adiciona(objeto);
    }
    
    public boolean pEmpty() {
        return lista.vazia();
    }
    
    public Object pop() {
        if(!pEmpty()) {
            Object strOb = lista.pega(lista.tamanho()-1);
            lista.remove(lista.tamanho()-1);
            return strOb;
        }
        return null;
    }

}
