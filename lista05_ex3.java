/* Faça um programa, com uma função que necessite de três argumentos, e que forneça a soma desses três argumentos. */
import java.util.Scanner;

public class lista05_ex3 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite três números: ");
        Double a = scn.nextDouble();
        Double b = scn.nextDouble();
        Double c = scn.nextDouble();
        scn.close();
        
        Double somaABC = somaTresArgumentos(a, b, c);

        System.out.println("A soma dos três números fornecidos é: " + somaABC);

    }

    public static double somaTresArgumentos(double a, double b, double c){
        return a + b + c;
    }
}
