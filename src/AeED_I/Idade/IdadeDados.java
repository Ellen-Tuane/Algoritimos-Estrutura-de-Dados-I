
package AeED_I.Idade;

public class IdadeDados {
    private String nome;  
    private int idade; 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String toString(){
        return this.getNome() + ", " + this.getIdade();
    }
    
    
    
   
    
    
}
