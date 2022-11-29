
package AeED_I.Idade;


public class IdadeVetor {
    private IdadeDados[] dados = new IdadeDados[100];
    private int total = 0;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public IdadeDados[] getDados() {
        return dados;
    }

    public void setDados(IdadeDados[] dados) {
        this.dados = dados;
    }
    
    public void adiciona(IdadeDados elem){
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
