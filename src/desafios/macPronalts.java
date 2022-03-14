package desafios;

import java.util.Locale;  //importando localização para adequar as unidades de medida
import java.util.Scanner;

public class macPronalts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH); //trazendo padrão inglês que utiliza valores com "." ao invés de ","
        Locale.setDefault(new Locale("en", "US"));

        int produtos = 0, quantidade = 0;
        double res = 0, valor = 0; //resultado acumulado da compra, valor de cada item
        int N = Integer.parseInt(sc.nextLine()); //colocando a quantidade de tipos de produtos serão inseridos

        for (int x = 1; x <= N; x++) {
            produtos = sc.nextInt();
            quantidade = sc.nextInt();

            // Para casos onde existem mais produtos a serem escolhidos depois
            if (x<N) {
                switch (produtos) {
                    case 1001:
                        valor = 1.5;
                        res = res + quantidade * valor;
                        continue;
                    case 1002:
                        valor = 2.5;
                        res = res + quantidade * valor;
                        continue;
                    case 1003:
                        valor = 3.5;
                        res = res + quantidade * valor;
                        continue;
                    case 1004:
                        valor = 4.5;
                        res = res + quantidade * valor;
                        continue;
                    case 1005:
                        valor = 5.5;
                        res = res + quantidade * valor;
                        continue;
                }
            } else if (x==N){       //Para casos onde está selecionando o último produto
                switch (produtos) {
                    case 1001:
                        valor = 1.5;
                        res = res + quantidade * valor;
                        break;
                    case 1002:
                        valor = 2.5;
                        res = res + quantidade * valor;
                        break;
                    case 1003:
                        valor = 3.5;
                        res = res + quantidade * valor;
                        break;
                    case 1004:
                        valor = 4.5;
                        res = res + quantidade * valor;
                        break;
                    case 1005:
                        valor = 5.5;
                        res = res + quantidade * valor;
                        break;
                }
            }

            System.out.printf("%.02f", res);
            sc.close();
        }
    }
}
