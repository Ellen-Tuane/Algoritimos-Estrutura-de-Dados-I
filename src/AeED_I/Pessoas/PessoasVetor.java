package AeED_I.Pessoas;

public class PessoasVetor {
    private PessoasDados[] dados = new PessoasDados[100];
    private int total = 0;

    public PessoasDados[] getDados() {
        return dados;
    }

    public void setDados(PessoasDados[] dados) {
        this.dados = dados;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
   
    
    public void adiciona(PessoasDados elem) {
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

    public PessoasDados pega(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.dados[posicao];
    }

    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= total;
    }

    public void adiciona(int posicao, PessoasDados dado) {
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
