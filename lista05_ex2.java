/* 
Faça um programa para imprimir:
    1
    1   2
    1   2   3
    .....
    1   2   3   ...  n
para um 'n' informado pelo usuário. Use uma função que receba um valor n inteiro imprima até a n-ésima linha.
*/
import java.util.Scanner;

public class lista05_ex2 {
    public static void main(String[] args) {

        int numeroN = 0;
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        numeroN = scn.nextInt();
        scn.close();

        imprimeSequencia(numeroN);
    }

    /* Imprimir a linha em ordem crescente */
    public static void imprimirLinha(int numeroN) {
        for (int i = 1; i <= numeroN; i++) {
            System.out.print(i + " ");
        }
    }
    /* Imprimir as linhas em sequência */
    public static void imprimeSequencia(int numeroN) {
        for (int i = 1; i <= numeroN; i++){
            imprimirLinha(i);
            System.out.println("");
        }
    }

}
