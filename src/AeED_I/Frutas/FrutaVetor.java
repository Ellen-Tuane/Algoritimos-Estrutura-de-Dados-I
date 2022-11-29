
package AeED_I.Frutas;

public class FrutaVetor {
    private FrutaDados[] frutas = new FrutaDados[5];
    private int total = 0;
   
    
    public void adiciona(FrutaDados elem){
        this.frutas[this.total] = elem;
        this.total ++;
    }
    
    public String toString(){
        String str = "[";
        for(int i=0; i<=this.total-1; i++){
            if(frutas[i] != null){
                str += frutas[i]+",";
            }
        }
        return str.substring(0, str.lastIndexOf(",")).trim()+"]";
    }
    
}
