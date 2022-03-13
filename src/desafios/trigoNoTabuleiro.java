package desafios;

import java.util.Scanner;
import java.math.BigInteger; //importando classe para valores de números gigantes inteiros pois os valores dos
// resultados podem ultrapassar o limite máximo do tamanho de long

public class trigoNoTabuleiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //Inserindo quantas vezes quer testar

        for (int i = 0; i < n; i++) {

            int x = sc.nextInt(); //Inserindo até qual casa será testada
            BigInteger quantidadeGraos = new BigInteger("0");
            BigInteger incremento = new BigInteger("1");// Precisa ser 1 porque inicia uma multiplicação, se for 0 o restante fica zerado
            BigInteger pesoKg = new BigInteger("0");

            for (int casa = 0; casa <= x; casa++) {
                if (casa == 0) {
                    quantidadeGraos = new BigInteger("0");
                    if (casa == x) {                       //criada esse loop para verificar se está na última casa a ser analisada para poder incluir o resultado
                        pesoKg = (quantidadeGraos.divide(new BigInteger("12"))).divide(new BigInteger("1000"));    // criando variável para armazenar o peso e convertendo para Kg
                        System.out.println(pesoKg + " kg");   //Exibindo o valor do peso
                    }
                } else if (casa == 1) {   //Condição para a casa 1 é ter um grão
                    quantidadeGraos = new BigInteger("1");
                    if (casa == x) {                       //criada esse loop para verificar se está na última casa a ser analisada para poder incluir o resultado
                        pesoKg = (quantidadeGraos.divide(new BigInteger("12"))).divide(new BigInteger("1000")); // criando variável para armazenar o peso e convertendo para Kg
                        System.out.println(pesoKg + " kg");   //Exibindo o valor do peso
                    }
                } else if (casa > 1) {
                    incremento = incremento.multiply(new BigInteger("2"));        //o incremento é sempre o dobro do antigo incremento
                    quantidadeGraos = quantidadeGraos.add(incremento); // Somando quantidade de Grão com incremento
                    if (casa == x) {                       //criada esse loop para verificar se está na última casa a ser analisada para poder incluir o resultado
                        quantidadeGraos = quantidadeGraos.add(new BigInteger("1"));
                        pesoKg = (quantidadeGraos.divide(new BigInteger("12"))).divide(new BigInteger("1000")); // criando variável para armazenar o peso e convertendo para Kg
                        System.out.println(pesoKg + " kg");   //Exibindo o valor do peso
                    }
                }
            }
        }
    }
}