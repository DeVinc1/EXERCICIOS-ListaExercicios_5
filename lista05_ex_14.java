
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

    public static void main(String[] args) {
        ArrayList<Integer> numerosDoQuadrado = criarArrayComNúmeros();

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

        int indexNumEscolhido = rnd.nextInt(10);
        int numEscolhido = Array_List.get(indexNumEscolhido);

        Array_List.remove(indexNumEscolhido);
        return numEscolhido;
    }
}
