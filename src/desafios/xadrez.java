package desafios;

import java.util.Scanner;

public class xadrez {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int L = sc.nextInt();
                int C = sc.nextInt();
                if ((L+C)%2 ==0) //Verificando se é par ou ímpar através do resto da divisão
                    System.out.println("1"); // Caso seja par aparece 1 - brancas
                else
                    System.out.println("0");// Caso seja par aparece 0 - pretas
                sc.close();
            }
        }
