
/*
Faça um programa que converta da notação de 24 horas para a notação de 12 horas. Por exemplo, o programa deve converter 14:25 em 2:25 P.M. A entrada é dada em dois inteiros. 
Deve haver pelo menos duas funções: uma para fazer a conversão e uma para a saída. Registre a informação A.M./P.M. como um valor ‘A’ para A.M. e ‘P’ para P.M.
Assim, a função para efetuar as conversões terá um parâmetro formal para registrar se é A.M. ou P.M. Inclua um loop que permita que o usuário repita esse cálculo para novos valores de entrada 
todas as vezes que desejar
*/
import java.util.Scanner;

public class lista05_ex6 {
    static String horaFormatada = "";

    public static void main(String[] args) {

        int hora;
        int minuto;
        Scanner scn = new Scanner(System.in);

        char continuar = 'Y';

        while (continuar == 'Y') {
            System.out.print("Digite as horas no formato 24hrs: ");
            hora = scn.nextInt();
            System.out.print("Digite os minutos no formato 24hrs: ");
            minuto = scn.nextInt();

            conversão(hora, minuto);

            System.out.println("Quer continuar convertendo?");
            System.out.print("[Y/n]: ");
            continuar = scn.next().charAt(0);
        }
        scn.close();
    }

    // Gerar String e printar a hora formatada
    public static void gerarResultado(int hora, int minutos, String tempo) {
        horaFormatada = hora + ":" + minutos + tempo;
        System.out.println("A hora formatada é: " + horaFormatada);
    }

    // Manipulação das horas
    public static void conversão(int horas, int minutos) {

        if (minutos >= 60) {
            gerarResultado(horas, minutos, " é uma hora inválida");
        } else {
            if (horas > 24) {
                gerarResultado(horas, minutos, " é uma hora inválida");
            }
            else if (horas < 12) {
                gerarResultado(horas, minutos, " AM");
            } 
            else if (horas == 24) {
                gerarResultado(0, minutos, " AM");
            } 
            else if (horas == 12) {
                gerarResultado(horas, minutos, " PM");
            } 
            else if (horas > 12 && horas < 24) {
                gerarResultado((horas - 12), minutos, " PM");
            }
        }

    }
}