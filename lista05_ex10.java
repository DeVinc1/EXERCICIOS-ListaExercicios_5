/*
Faça um programa de implemente um jogo de Craps. 
O jogador lança um par de dados, obtendo um valor entre 2 e 12. 
Se, na primeira jogada, você tirar 7 ou 11, você um "natural" e ganhou. 
Se você tirar 2, 3 ou 12 na primeira jogada, isto é chamado de "craps" e você perdeu. 
Se, na primeira jogada, você fez um 4, 5, 6, 8, 9 ou 10,este é seu "Ponto". Seu objetivo agora é continuar jogando os dados até tirar este número novamente. 
Você perde, no entanto, se tirar um 7 antes de tirar este Ponto novamente. 
*/
import java.util.Random;

public class lista05_ex10 {
    
    public static void main(String[] args) {
        jogarDado();
    }

    public static void jogarDado(){
        Random rnd = new Random();
        /**
         * Valores de referencia de intervalo 13 e 2 à medida que:
         * O maior (13) é excluido dos resultados e
         * O menor (2) é um resultado possível 
         */
        int valorDoDado = rnd.nextInt(13 - 2) + 2;
   
        if(valorDoDado == 7 || valorDoDado == 11){
            System.out.println("Seu número jogado foi: " + valorDoDado + ", você é um natural e você ganhou o jogo.");
        } 
        else if(valorDoDado == 2 || valorDoDado == 3 || valorDoDado == 12){
            System.out.println("Seu número jogado foi: " + valorDoDado + ", deu craps e você perdeu o jogo.");
        }
        else{ /*Caso de ponto (4, 5, 6, 8, 9 ou 10)*/
            System.out.println("Seu número jogado foi: " + valorDoDado + ". Esse é seu ponto.");
            
            int valorDoSegundoDado = 0;
            int repetidor = 1;

                //Rejogadas do dado para tirar o número novamente
                while(valorDoSegundoDado != valorDoDado){
                    valorDoSegundoDado = rnd.nextInt(13 - 2) + 2;

                        if(valorDoSegundoDado == 7){
                            System.out.println("Seu número jogado foi 7. Você perdeu após " + repetidor + " vezes.");
                            //Escapar do loop While
                            System.exit(1);
                        }
                        
                    repetidor++;
                }

            System.out.println("Você tirou o número ponto após " + repetidor + " vezes.");
        }
    }
}
