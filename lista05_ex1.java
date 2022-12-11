/*
Faça um programa para imprimir:
    1
    2   2
    3   3   3
    .....
    n   n   n   n   n   n  ... n
para um 'n' informado pelo usuário. Use uma função que receba um valor n inteiro e imprima até a n-ésima linha.
*/
import java.util.Scanner;

public class lista05_ex1 {
    public static void main(String[] args) {

        /* Iniciando váriaveis e scanner */
        Integer numeroN = 0;
        Scanner keySc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        numeroN = keySc.nextInt();
        keySc.close();

        imprimeLinha(numeroN);

    }

    /* Função para imprimir cada linha com o número desejado */
    public static void imprimeLinha(int numeroN) {
        for (int i = 1; i <= numeroN; i++) {
            String stringComNumeros = i + " ";
            System.out.println(stringComNumeros.repeat(i));
        }
    }
    
}