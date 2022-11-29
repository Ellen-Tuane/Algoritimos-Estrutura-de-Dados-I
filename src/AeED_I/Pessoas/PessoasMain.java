package AeED_I.Pessoas;

import java.util.Scanner;

public class PessoasMain {
     public static void main(String[] args){
        
        //Estanciar classe vetor
        PessoasVetor lista = new PessoasVetor();
        PessoasDados pessoa = new PessoasDados();
        
        Scanner scanner = new Scanner(System.in);
        
        boolean fim = false;
        
        while (!fim){
            System.out.println("\nMENU\n1 - Inserir;\n2 - Pesquisar;\n3 - Relatar todos os elementos;\n4 - sair;");
            switch(Integer.parseInt(scanner.nextLine())){
                case 1:{

                    boolean flag = true;

                    while (flag){
                        System.out.println("\nInserir:\n entre Nome");
                        pessoa.setNome(scanner.nextLine());
                        System.out.println("entre Cidade");
                        pessoa.setCidade(scanner.nextLine());
                        System.out.println("entre Idade");
                        pessoa.setIdade(Integer.parseInt(scanner.nextLine()));
                        System.out.println("entre Telefone");
                        pessoa.setTelefone(Long.parseLong(scanner.nextLine()));

                        lista.adiciona(pessoa);
                        pessoa = new PessoasDados();

                        System.out.println("Deseja adicionar outra pessoa? s ou n");
                        if ("n".equals(scanner.nextLine())){
                            flag = false;
                        }
                    }
                    break;
                }
                case 2: {
                    
                    System.out.println("Pesquisar - Entre Nome:");
                    String nome = scanner.nextLine();
                    for(int k = 0; k <= lista.tamanho(); k++){
                        pessoa = lista.pega(k);
                        
                        if(pessoa.getNome().equals(nome)){
                            System.out.println("\nNome: "+pessoa.getNome()
                                    +"\nCidade: "+pessoa.getCidade()
                                    +"\nidade: "+pessoa.getIdade()
                                    +"\nTelefone: "+pessoa.getTelefone());

                            boolean f = true;

                            while (f){
                                System.out.println("\nEncontrado! O que deseja fazer?\n1 - Alterar;\n2 - Remover\n3 - Sair;");
                                switch(Integer.parseInt(scanner.nextLine())){
                                    case 1:{
                                        System.out.println("entre Nome");
                                        pessoa.setNome(scanner.nextLine());
                                        System.out.println("entre Cidade");
                                        pessoa.setCidade(scanner.nextLine());
                                        System.out.println("entre Idade");
                                        pessoa.setIdade(Integer.parseInt(scanner.nextLine()));
                                        System.out.println("entre Telefone");
                                        pessoa.setTelefone(Long.parseLong(scanner.nextLine()));

                                        lista.adiciona(k,pessoa);
                                        pessoa = new PessoasDados();
                                        System.out.println("Alterado!");
                                        f = false;
                                        break;
                                    }
                                    case 2:{
                                        lista.remove(k);
                                        System.out.println("Removido!");
                                        f = false;
                                        break;
                                    }
                                    case 3:{
                                        f = false;
                                        break;
                                    }
                                }
                            }
                            break;
                        }
                    
                    }
                    break;
                }
                case 3:{
                    for(int j = 0; j < lista.tamanho(); j++){
                        pessoa = lista.pega(j);
                        System.out.println("\nNome: "+pessoa.getNome()
                                    +"\nCidade: "+pessoa.getCidade()
                                    +"\nidade: "+pessoa.getIdade()
                                    +"\nTelefone: "+pessoa.getTelefone());
                    }
                    break;
                }
                case 4:{
                    System.out.println("****FIM****!");
                    fim = true;
                    break;
                }

            }
            
        }    

    }          
}
