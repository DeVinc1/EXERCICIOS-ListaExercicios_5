/*
Um quadrado mágico é aquele dividido em linhas e colunas, com um número em cada posição e no qual a soma das linhas, colunas e diagonais é a mesma. 
Por exemplo, veja um quadrado mágico de lado 3, com números de 1 a 9:
    8  3  4 
    1  5  9
    6  7  2
Elabore uma função que identifica e mostra na tela todos os quadrados mágicos com as características acima. 
Dica: produza todas as combinações possíveis e verifique a soma quando completar cada quadrado. 
*/
import java.util.ArrayList;
import java.util.Random;

public class lista05_ex14 {
    public static void main(String[] args){
        ArrayList<Integer> numerosDoQuadrado = criarArrayComNúmeros();
        gerarQuadrados(numerosDoQuadrado);

    }

    public static ArrayList<Integer> criarArrayComNúmeros() {
        ArrayList<Integer> numerosDoQuadrado = new ArrayList<>();

        /* Adicionar números a ArrayList */
        for (int i = 1; i < 10; i++) {
            numerosDoQuadrado.add(i);
        }

        return numerosDoQuadrado;
    }

    public static int escolherNum(ArrayList<Integer> Array_List) {
        Random rnd = new Random();
        /* Armazenando index encontrado aleatoriamente e encontrando número referente */
        int indexNumEscolhido = rnd.nextInt(Array_List.size());
        int numEscolhido = Array_List.get(indexNumEscolhido);
        /* Retirando número encontrado */
        Array_List.remove(indexNumEscolhido);
        return numEscolhido;
    }

    public static void gerarQuadrados(ArrayList<Integer> numerosDoQuadrado){
        /* Criação do Quadrado */
        int pos1_1 = escolherNum(numerosDoQuadrado);
        int pos1_2 = escolherNum(numerosDoQuadrado);
        int pos1_3 = escolherNum(numerosDoQuadrado);
        int pos2_1 = escolherNum(numerosDoQuadrado);
        int pos2_2 = escolherNum(numerosDoQuadrado);
        int pos2_3 = escolherNum(numerosDoQuadrado);
        int pos3_1 = escolherNum(numerosDoQuadrado);
        int pos3_2 = escolherNum(numerosDoQuadrado);
        int pos3_3 = escolherNum(numerosDoQuadrado);

        /* Criando variaveis para verificar soma */
        // Horizontal
        int somaHorizontal1 = pos1_1 + pos1_2 + pos1_3;
        int somaHorizontal2 = pos2_1 + pos2_2 + pos2_3;
        int somaHorizontal3 = pos3_1 + pos3_2 + pos3_3;
        // Vertical
        int somaVertical1 = pos1_1 + pos2_1 + pos3_1;
        int somaVertical2 = pos1_2 + pos2_2 + pos3_2;
        int somaVertical3 = pos1_3 + pos2_3 + pos3_3;
        // Diagonal
        int somaDiagonal1 = pos1_1 + pos2_2 + pos3_3;
        int somaDiagonal2 = pos1_3 + pos2_2 + pos3_1;

        int contadorQuadradosMágicos = 0;
        ArrayList<String> quadradosMagicos = new ArrayList<String>();
        /* Recriando o quadrado até encontrar os quadrado mágicos */
        System.out.println("Encontrando quadrados mágicos... \n");
        while (contadorQuadradosMágicos <= 8) {

                    numerosDoQuadrado = criarArrayComNúmeros();
                    pos1_1 = escolherNum(numerosDoQuadrado);
                    pos1_2 = escolherNum(numerosDoQuadrado);
                    pos1_3 = escolherNum(numerosDoQuadrado);
                    pos2_1 = escolherNum(numerosDoQuadrado);
                    pos2_2 = escolherNum(numerosDoQuadrado);
                    pos2_3 = escolherNum(numerosDoQuadrado);
                    pos3_1 = escolherNum(numerosDoQuadrado);
                    pos3_2 = escolherNum(numerosDoQuadrado);
                    pos3_3 = escolherNum(numerosDoQuadrado);

                    // Horizontal
                    somaHorizontal1 = pos1_1 + pos1_2 + pos1_3;
                    somaHorizontal2 = pos2_1 + pos2_2 + pos2_3;
                    somaHorizontal3 = pos3_1 + pos3_2 + pos3_3;
                    // Vertical
                    somaVertical1 = pos1_1 + pos2_1 + pos3_1;
                    somaVertical2 = pos1_2 + pos2_2 + pos3_2;
                    somaVertical3 = pos1_3 + pos2_3 + pos3_3;
                    // Diagonal
                    somaDiagonal1 = pos1_1 + pos2_2 + pos3_3;
                    somaDiagonal2 = pos1_3 + pos2_2 + pos3_1;

                    // Adicionando os quadrados mágicos à uma lista para imprimi-los posteriormente
                    if(somaHorizontal1 == 15 && somaHorizontal2 == 15 && somaHorizontal3 == 15 &&
                    somaVertical1 == 15 && somaVertical2 == 15 && somaVertical3 == 15 &&
                    somaDiagonal1 == 15 && somaDiagonal2 == 15){
                        contadorQuadradosMágicos++;
                        quadradosMagicos.add(pos1_1 + " " + pos1_2 + " " + pos1_3 + "\n" 
                        + pos2_1 + " " + pos2_2 + " " + pos2_3 + "\n"
                        + pos3_1 + " " + pos3_2 + " " + pos3_3 + "\n \n");
                    }
        }

        //Imprimindo cada quadrado separadamento por meio do seu index na ArrayList
        for(int i = 0; i < quadradosMagicos.size(); i++){
            System.out.println(quadradosMagicos.get(i));
        }
        System.out.println("- Esses são os QUADRADOS MÁGICOS 3x3");
    }
}
