package desafios;

import java.util.Scanner;

public class parOuImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt(); //inserindo quantos números serão analisados

        for (int i = 0; i < n; i++) {
            int numero = leitor.nextInt();//inserindo qual número será analisado dessa vez

                out:
                {
                    if (numero % 2 == 0 && numero < 0) {  //analisando se o número é par negativo
                        System.out.println("EVEN NEGATIVE");
                        break out;
                    } else if (numero % 2 == 0 && numero > 0) {  //analisando se o número é par positivo
                        System.out.println("EVEN POSITIVE");
                        break out;
                    } else if (numero % 2 == -1 && numero < 0) {  //analisando se o número é ímpar negativo
                        System.out.println("ODD NEGATIVE");
                        break out;
                    } else if (numero % 2 == 1 && numero > 0) {  //analisando se o número é ímpar positivo
                        System.out.println("ODD POSITIVE");
                        break out;
                    } else if (numero == 0) {  //analisando se o número é 0
                        System.out.println("NULL");
                        break out;
                    }
                }
        }
        leitor.close();
    }
    }
