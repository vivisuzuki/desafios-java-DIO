package desafios;

import java.io.BufferedReader; //método para salvar valor temporário
import java.io.IOException; // método exigido no uso do BufferedReader e InputStreamReader
import java.io.InputStreamReader;  //método para auxiliar a entrada de valores separados por espaço
import java.util.StringTokenizer;  //método para auxiliar a entrada de valores separados por espaço

public class fusoHorário {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int horarioSaida = Integer.parseInt(st.nextToken()); //Entra como string st.NexToken e depois converte para
        // inteiro com Integer.parseInt
        int tempoViagem = Integer.parseInt(st.nextToken());  //Entra como string st.NexToken e depois converte para
        // inteiro com Integer.parseInt
        int diferencaFuso = Integer.parseInt(st.nextToken());  //Entra como string st.NexToken e depois converte para
        // inteiro com Integer.parseInt

        int ajuste = horarioSaida + tempoViagem + diferencaFuso;
        if( -4<=ajuste && ajuste < 0) {
            System.out.println(24+ajuste);
        } else if (0<=ajuste && ajuste<=23) {
            System.out.println(ajuste);
        } else if ( ajuste > 23) {
            System.out.println(ajuste%24);
        }
    }
}
