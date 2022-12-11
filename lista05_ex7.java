/*
Faça um programa que use a função valorPagamento para determinar o valor a ser pago por uma prestação de uma conta. 
O programa deverá solicitar ao usuário o valor da prestação e o número de dias em atraso e passar estes valores para a função valorPagamento, que calculará o valor a ser pago e devolverá este valor ao programa que a chamou. 
O programa deverá então exibir o valor a ser pago na tela. 
Após a execução o programa deverá voltar a pedir outro valor de prestação e assim continuar até que seja informado um valor igual a zero para a prestação. 
Neste momento o programa deverá ser encerrado, exibindo o relatório do dia, que conterá a quantidade e o valor total de prestações pagas no dia. 
O cálculo do valor a ser pago é feito da seguinte forma:
    - Para pagamentos sem atraso, cobrar o valor da prestação. 
    - Quando houver atraso, cobrar 3% de multa, mais 0,1% de juros por dia de atraso.
*/
import java.util.Scanner;

public class lista05_ex7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Digite o valor da prestação que deve ser paga: R$ ");
        double valorPrestacao = scn.nextDouble();
        System.out.print("Digite os dias de atraso do pagamento: ");
        int diasAtraso = scn.nextInt();

        scn.close();

        double valorParaPagar = valorPagamento(valorPrestacao, diasAtraso);
        System.out.format("Devem ser pagos R$ %.2f", valorParaPagar, " na prestação");
    }

    public static double valorPagamento(double valorPrestacao, int diasAtraso){
        double valorParaSerCobrado;

        if (diasAtraso <= 0){
            valorParaSerCobrado = valorPrestacao;
        }
        else{
            valorParaSerCobrado = valorPrestacao * 1.03;
            for(int i = 0; i < diasAtraso; i++){
                valorParaSerCobrado = valorParaSerCobrado * 1.001;
            }
        }

        return valorParaSerCobrado;
    }
}
