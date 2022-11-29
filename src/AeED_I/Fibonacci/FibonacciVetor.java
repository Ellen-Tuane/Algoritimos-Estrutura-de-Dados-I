/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AeED_I.Fibonacci;

/**
 *
 * @author ellentuane
 */
public class FibonacciVetor {
    private FibonacciDados[] dados = new FibonacciDados[100];
    private int total = 0;
   
    
    public void adiciona(FibonacciDados elem){
        this.dados[this.total] = elem;
        this.total ++;
    }
    
    public String toString(){
        String str = "[";
        for(int i=0; i<=this.total-1; i++){
            if(dados[i] != null){
                str += dados[i]+",";
            }
        }
        return str.substring(0, str.lastIndexOf(",")).trim()+"]";
    }
}
