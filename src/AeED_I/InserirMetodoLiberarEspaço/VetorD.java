package AeED_I.InserirMetodoLiberarEspaço;


public class VetorD{
    private Object[] object = new Object[1];
    private int total = 0;

    public Object[] getDados() {
        return object;
    }

    public void setObject(Object[] object) {
        this.object = object;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
   
    
    public void adiciona(Object elem) {
        this.liberaEspaco();
        this.object[this.total] = elem;
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
    
    private void liberaEspaco() {

        if(this.total == this.object.length) {

            Object[] novaArray = new Object[this.object.length * 2];

            for(int i = 0; i <= this.object.length-1; i++) {
              novaArray[i] = this.object[i];
            }
            this.object = novaArray;
        }

    }
    
}
