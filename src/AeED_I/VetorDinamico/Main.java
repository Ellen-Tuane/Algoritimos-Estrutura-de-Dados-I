package AeED_I.VetorDinamico;

import java.util.Scanner;

public class Main {
    
    public static boolean quadradoPerfeito(double i) {
        Double resultado = Math.sqrt(i);
        if (resultado != null) {
            return (resultado.intValue() == resultado.doubleValue());
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        //Estanciar classe vetor
        VetorD lista = new VetorD();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Entre com o número de azulejos");
        int numAjuleijos = Integer.parseInt(scanner.nextLine());
        
        while (numAjuleijos > 0){
            System.out.println("Entre com o Valores das áreas");
            
            int num = Integer.parseInt(scanner.nextLine());
                
            if (quadradoPerfeito(num)) {
                lista.adiciona(num);
            } 
            numAjuleijos -= 1;
        }
        System.out.println(lista);
    }
}
