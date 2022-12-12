/*
Construa uma função que desenhe um retângulo usando os caracteres ‘+’ , ‘−’ e ‘| ‘.
Esta função deve receber dois parâmetros, linhas e colunas 
O valor por omissão é o valor mínimo igual a 1 e o valor máximo é 20. 
Se valores fora da faixa forem informados, eles devem ser modificados para valores dentro da faixa de forma elegante.
*/
import java.util.Scanner;

public class lista05_ex13 {
    
 public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Digite a largura do retângulo entre 1 a 20: ");
        int largura = scn.nextInt();
        System.out.print("Digite a altura do retângulo entre 1 a 20: ");
        int altura = scn.nextInt();
        scn.close();

        desenharRetangulo(altura, largura);
    }


    public static void desenharRetangulo(int altura, int largura) {
        //Corrigindo valores
        if(largura < 0){
            largura = 1;
            System.out.println("O valor da largura foi corrigido para o minímo 1.");
        }
        if(largura > 20){
            largura = 20; 
            System.out.println("O valor da largura foi corrigido para o máximo 20.");
        }
        
        if(altura < 0){
            altura = 1;
            System.out.println("O valor da altura foi corrigido para o minímo 1.");
        }
        if(altura > 20){
            altura = 20; 
            System.out.println("O valor da altura foi corrigido para o máximo 20.");
        }

        //Desenhar o topo do retãngulo
        String larguraRetangulo = "-";
        System.out.println(larguraRetangulo.repeat(largura));

        //Desenhar corpo do retãngulo
        for(int i=0; i < altura; i++){
            String espaço = " ";
                //Adaptar print para largura = 1
                if(largura == 1){
                    System.out.println("|");
                }
                else{
                    System.out.println("|" + espaço.repeat(largura-2) + "|");
                }
        }

        //Desenhar fundo do retãngulo
        System.out.println(larguraRetangulo.repeat(largura));
    
    }
}
