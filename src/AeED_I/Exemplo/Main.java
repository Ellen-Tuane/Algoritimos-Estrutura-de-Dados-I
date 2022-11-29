package AeED_I.Exemplo;

public class Main {
    public static void main(String[] args){
        Vetor lista = new Vetor();
      
        Dados dados = new Dados();     
        dados.setNome("Ellen");
        lista.adiciona(dados);
        
        dados = new Dados();
        dados.setNome("Amanda");
        lista.adiciona(dados);
        
        dados = new Dados();
        dados.setNome("Icaro");
        lista.adiciona(dados);
        
        System.out.println(lista);

    }
    
}
