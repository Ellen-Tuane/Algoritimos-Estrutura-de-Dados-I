
package AeED_I.Idade;

import java.util.Scanner;

public class IdadeMain {
    
    public static void main(String[] args){
        
        //Estanciar classe vetor
        IdadeVetor lista = new IdadeVetor();
        IdadeDados id = new IdadeDados();
        
        Scanner scanner = new Scanner(System.in);        
        
        boolean flag = true;
        int max;
        int min;
        
        System.out.println("entre Nome");
        id.setNome(scanner.nextLine());
        System.out.println("entre Idade");
        id.setIdade(Integer.parseInt(scanner.nextLine()));
        max = id.getIdade();
        min = id.getIdade();
        lista.adiciona(id);
            
        
        id = new IdadeDados();
        
        while (flag){
            System.out.println("entre Nome");
            id.setNome(scanner.nextLine());
            System.out.println("entre Idade");
            id.setIdade(Integer.parseInt(scanner.nextLine()));
            lista.adiciona(id);
                       
            max = Math.max(max, id.getIdade());
            min = Math.min(min, id.getIdade());
            id = new IdadeDados();
            
            System.out.println("Deseja inserir outro? y ou n");
            String check = scanner.nextLine();
            
            if("n".equals(check)){
                flag = false;
            }
            
        }

        System.out.println(lista);
        System.out.println(max);
        System.out.println(min);
     }
    
}
