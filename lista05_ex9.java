/*
Faça uma função que retorne o reverso de um número inteiro informado. 
    -Por exemplo: 127 -> 721 
*/
import java.util.Scanner;

public class lista05_ex9 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int num = scn.nextInt();
        scn.close();
        
        char[] arrayDosNumeros = numeroParaReverso(num);
        System.out.print("O reverso do número digitado é: ");

        //Printar cada elemento da array para criar um número contínuo
        for(int a = 0; a < arrayDosNumeros.length; a++){
            System.out.print(arrayDosNumeros[a] + "");
        }
    }

    public static char[] numeroParaReverso(int num){
        //Criando uma array com os dígitos do número informado
        String numIntoString = Integer.toString(num);
        char[] arrayDosNumeros = new char[numIntoString.length()]; 
        arrayDosNumeros = numIntoString.toCharArray();
        
        char[] arrayDosNumerosRevertida = new char[numIntoString.length()];  

        //Atribuir aos primeiros indexes da array invertida os valores dos ultimos indexes da array original
        for(int i = 0; i < arrayDosNumeros.length; i++){
           arrayDosNumerosRevertida[i] = arrayDosNumeros[(arrayDosNumeros.length - 1) - i];
        }

        return arrayDosNumerosRevertida;
    }
}
