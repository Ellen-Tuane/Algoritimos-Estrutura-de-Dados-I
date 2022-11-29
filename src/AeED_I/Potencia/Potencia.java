package AeED_I.Potencia;

public class Potencia {
    static int pot_recursiva(int base, int exp){
            if(exp==0){
                return 1;
            }else{
                return base*pot_recursiva(base, exp-1);
            }
        }

    static int pot(int base, int exp){
        int resultado = 1;
        while(exp != 0){
            resultado *= base;
            exp--;
        }
        return resultado;
    }
    public static void main(String[] args) {
        System.out.println(pot_recursiva(2,10));
        System.out.println(pot(2,10));
    }
}
