/* 
Faça um programa com uma função chamada somaImposto. 
A função possui dois parâmetros formais: taxaImposto, que é a quantia de imposto sobre vendas expressa em porcentagem e custo, que é o custo de um item antes do imposto. 
A função “altera” o valor de custo para incluir o imposto sobre vendas. 
*/
import java.util.Scanner;

public class lista05_ex5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Digite o custo de um produto: ");
        double custo = scn.nextDouble();
        System.out.print("Digite a taxa de imposto (em %) que incide em um produto: ");
        double taxaImposto = scn.nextDouble();
        scn.close();

        double precoProduto = somaImposto(taxaImposto, custo);
        System.out.println("O preço do produto deve ser: R$ " + precoProduto);
    }

    public static double somaImposto(double taxaImposto, double custo) {
        return custo * ((100 + taxaImposto)/100);
    }
}