package desafios;

import java.util.Scanner;
import java.lang.Math;

public class dama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1, y1, x2, y2, deltaX, deltaY;

        while(true){
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();

            deltaX = Math.abs(x1-x2); //Diferença de coordenadas X em valor absoluto para ficar positivo
            deltaY = Math.abs(y1 - y2); //Diferença de coordenadas Y em valor absoluto para ficar positivo

            if(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) break; //condição de parada


            if( x1==x2 && y1 == y2 ) //Significa que a rainha já está sobre a casa indicada e não precisa de movimentos
                System.out.println("0");
            else if(x1==x2 || y1==y2) //Significa que a rainha está ou na mesma linha, ou na mesma coluna (pq já foi
                // refutada a possibilidade da mesma casa no if anterior
                System.out.println("1");
            else if(deltaX == deltaY) //Significa que a rainha está na mesma diagonal
                System.out.println("1");
            else  //Refutada as três opções anteriores, só resta a possibilidade da rainha precisar de pelo menos 2
                // movimentos pra chegar na casa
                System.out.println("2");
        }
        sc.close();
    }
}