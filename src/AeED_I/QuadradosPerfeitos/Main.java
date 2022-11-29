package AeED_I.QuadradosPerfeitos;

import java.util.Scanner;

public class Main {
    public static boolean quadPerf(double i) {
        Double resultado = Math.sqrt(i);
        if (resultado != null) {
                return (resultado.intValue() == resultado.doubleValue());
        } else {
                return false;
        }
    }
    public static void main(String[] args){
        //Estanciar classe vetor
        Vetor lista = new Vetor();
        Dados num = new Dados();
        Scanner scanner = new Scanner(System.in);
        
        boolean flag = true;

        while (flag){
            
            System.out.println("entre valor");
            num.setNum(Integer.parseInt(scanner.nextLine()));
            lista.adiciona(num);
            num = new Dados();
            
            System.out.println("outro valor? s ou n");
            if ("n".equals(scanner.nextLine())){
                            flag = false;
                        }
        }
        
        for(int k = 0; k <= lista.tamanho(); k++){
            num = lista.pega(k);
            
            if(quadPerf(num.getNum())){
               System.out.println(num.getNum()+ " Quadrado Perfeito");
            }else{
                System.out.println(num.getNum()+" Não é quadrado perfeito");
            }
            
        }
   
    }    
}
    
