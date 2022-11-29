package AeED_I.Lista_8_Ex_6;

import AeED_I.QuadradosPerfeitos.*;
import AeED_I.Exemplo.*;


public class Vetor {
    private Dados[] dados = new Dados[100];
    private int total = 0;

    public Dados[] getDados() {
        return dados;
    }

    public void setDados(Dados[] dados) {
        this.dados = dados;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
   
    
    public void adiciona(Dados elem) {
        this.dados[this.total] = elem;
        this.total++;
    }

    public int tamanho() {
        return this.getTotal();
    }

    public boolean contem(String dado) {
        return this.toString().indexOf(dado) >= 0;
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < total;
    }

    public Dados pega(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.dados[posicao];
    }

    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= total;
    }

    public void adiciona(int posicao, Dados dado) {
        if (!posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int indice = total - 1; indice >= posicao; indice--) {
            dados[indice + 1] = dados[indice];
        }
        dados[posicao] = dado;
        this.total++;
    }

    public void remove(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < total - 1; i++) {
            this.dados[i] = this.dados[i + 1];
        }
        total--;
    }
    
}
