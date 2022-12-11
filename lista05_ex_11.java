/* 
Construa uma função que receba uma data no formato DD/MM/AAAA e devolva uma string no formato D de mesPorExtenso de AAAA. 
Opcionalmente, valide a data e retorne NULL caso a data seja inválida. 
*/
import java.util.Scanner;

public class lista05_ex11 {
    public static void main(String[] args) {
        int numDia;
        int numMes;
        int numAno;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        numDia = scanner.nextInt();
        System.out.print("Digite o mês: ");
        numMes = scanner.nextInt();
        System.out.print("Digite o ano: ");
        numAno = scanner.nextInt();

        scanner.close();

        String dataFormatada = formatarData(numMes, numDia, numAno);
        System.out.println("A data formatada é: " + dataFormatada);
    }

    public static String formatarData(int numMes, int numDia, int numAno){
        String dataFormatada = "";

        String[] nomeDosMeses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        Integer[] numDiasNoMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 

        //Vertificar se ano é bissexto
        if((numAno % 4 == 0) && (numAno % 100 != 0 || numAno % 400 == 0)){
            numDiasNoMes[1] = 29;
        }

        //Verificar validade da data
        if(numDia < 1 || numMes < 1 || numAno < 1 || numMes > nomeDosMeses.length || numDia > numDiasNoMes[numMes - 1]){
            dataFormatada = "NULL";
        } 
        //Formatar a data
        else{
            dataFormatada = numDia + " de " + nomeDosMeses[numMes - 1] + " de " + numAno;
        }
        
        return dataFormatada;
    }
}
