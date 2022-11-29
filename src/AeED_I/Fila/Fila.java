/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AeED_I.Fila;

public class Fila {
    VetorD lista = new VetorD();
    
    public boolean fEmpty() {
        return lista.vazia();
    }   
    
    public void Insere(Object objeto) {
        lista.adiciona(objeto);
    }  
    
    public Object remover(){
        if(!this.fEmpty()){
            Object objeto = lista.pega(0);
            lista.remove(0);
            return objeto;
        }
        return null;
    }
    
    public Object mostra(){
        return lista;
    }
}
