/* Faça um programa, com uma função que necessite de um argumento. A função retorna o valor de caractere ‘P’, se seu argumento for positivo, e ‘N’, se seu argumento for zero ou negativo */
import java.util.Scanner;

public class lista05_ex4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double a = scn.nextDouble();
        scn.close();

        char resultado = checarNumero(a);

        System.out.println("O número fornecido é: " + resultado);
    }

    //Checar se número é positivo ou negativo
    public static char checarNumero(double a){
        char resultado;
        if (a > 0){
            resultado = 'P';
        } 
        else {
            resultado = 'N';
        }
        return resultado;
    }
}
