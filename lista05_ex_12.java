
/* 
Construa uma função que receba uma string como parâmetro e devolva outra string com os carateres embaralhados. 
Por exemplo: se função receber a palavra python, pode retornar npthyo, ophtyn ou qualquer outra combinação possível, de forma aleatória. 
Padronize em sua função que todos os caracteres serão devolvidos em caixa alta ou caixa baixa, independentemente de como foram digitados. 
*/
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class lista05_ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        palavra = palavra.toLowerCase();
        scanner.close();

        char[] novaPalavra = embaralhaPalavra(palavra);

        System.out.println("A palavra embaralhada aleatoriamente é: " + new String(novaPalavra));
    }

    public static char[] embaralhaPalavra(String palavra){
        ArrayList<Character> letrasDaPalavra = new ArrayList<Character>();
        
        //Adicionar os caracteres à Array List
        for (char c : palavra.toCharArray()) {
            letrasDaPalavra.add(c);
        }

        int tamanhoDaPalavra = letrasDaPalavra.size();
        char[] novaOrdemPalavras = new char[tamanhoDaPalavra];

        //Adicionar os caracteres de maneira aleatória à uma nova array.
        for(int i=0; i < tamanhoDaPalavra; i++){
            Random random = new Random();
            int novaPosiçãoLetra = random.nextInt(0, letrasDaPalavra.size());
            novaOrdemPalavras[i] = letrasDaPalavra.get(novaPosiçãoLetra);
            letrasDaPalavra.remove(novaPosiçãoLetra);
        }

        return novaOrdemPalavras;
    }
}
