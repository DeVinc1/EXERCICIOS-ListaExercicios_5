/* Faça uma função que informe a quantidade de dígitos de um determinado número inteiro informado. */
import java.util.Scanner;

public class lista05_ex8 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numFornecido = scn.nextInt();
        scn.close();

        int tamanhoNumFornecido = encontrarNumDigitos(numFornecido);
        System.out.println("O número digitado possui " + tamanhoNumFornecido + " dígitos.");
    }

    public static int encontrarNumDigitos (int num){
        //Encontrar módulo do número fornecido para evitar erros com o sinal "-" em caso de negativos.
        if (num < 0){
            num = Math.abs(num);
        }

        String numToString = Integer.toString(num);
        int tamanhoNum = numToString.length(); 

        return tamanhoNum;
    }
}
