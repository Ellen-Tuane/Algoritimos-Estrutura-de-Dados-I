package AeED_I.Fila;

import AeED_I.VetorDinamico.*;


public class VetorD{
    private Object[] object = new Object[1];
    private int total = 0;
    private StringBuilder builder;
    
    public void adiciona(Object elem) {
        this.liberaEspaco();
        this.object[this.total] = elem;
        this.total++;
    }

    public int tamanho() {
        return this.total;
    }

    public boolean contem(Object object) {
        return this.builder.indexOf(object.toString()) >= 0;
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < total;
    }

    public Object pega(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.object[posicao];
    }

    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= total;
    }

    public void adiciona(int posicao, Object object) {
        this.liberaEspaco();
        if (!posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int indice = total - 1; indice >= posicao; indice--) {
            this.object[indice + 1] = this.object[indice];
        }
        this.object[posicao] = object;
        this.total++;
    }

    public void remove(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < total - 1; i++) {
            this.object[i] = this.object[i + 1];
        }
        total--;
    }
    
    @Override
    public String toString() {
        if (this.total == 0) {
            return "[]";
        }
        
        builder = new StringBuilder();
        this.builder.append("[");
        for (int i = 0; i < this.total - 1; i++) {
            this.builder.append(this.object[i]);
            this.builder.append(",");
        }
        this.builder.append(this.object[this.total - 1]);
        this.builder.append("]");
        return builder.toString();
    }
    
    private void liberaEspaco() {

        if(this.total == this.object.length) {

            Object[] novaArray = new Object[this.object.length * 2];

            for(int i = 0; i <= this.object.length-1; i++) {
              novaArray[i] = this.object[i];
            }
            this.object = novaArray;
        }

    }
    
    public boolean vazia(){
        return this.total > 0 ? false : true;
    }
    
}
