# Desafios de código - Java



## Deseafio 01: Xadrez

### Enunciado: 

No tabuleiro de xadrez, a casa na linha 1, coluna 1 (canto superior esquerdo) é sempre branca e as cores das casas se alternam entre branca e preta, formando o formato tão conhecido como xadrez. Dessa forma, como o tabuleiro tradicional tem oito linhas e oito colunas, a casa na linha 8, coluna 8 (canto inferior direito) será também branca. Porém, neste problema, queremos ser capazes de predizer a cor independente do número de linhas e colunas, sendo: **L** linhas e **C** colunas. No exemplo da figura, para **L** = 6 e **C** = 9, a casa no canto inferior direito será preta, uma simples previsão matemática, não?



### Entrada

A primeira linha da entrada contém um inteiro **L** (1 ≤ **L** ≤ 1000) indicando o número de linhas do tabuleiro.
A segunda linha da entrada contém um inteiro **C** (1 ≤ **C** ≤ 1000) representando o número de colunas.



### Saída 

Imprima uma linha na saída. A linha deve conter um inteiro, representando a cor da casa no canto inferior direito do tabuleiro, e para identificar, considere o inteiro 1 para a cor branca e 0 para a cor preta.

### Exemplos 01

![Exemplo01](.github\images\Exemplo01.JPG)



### Lições Aprendidas

- Classe Scanner (import java.util.scanner) - auxilia a entrada de dados
  - Scanner sc = new Scanner(System.in) - chama a classe importada e abre a entrada de dados
  - int L = sc.nextIn(); - atribui um inteiro a variável L
  - sc.close(); - fecha a entrada de dados aberta anteriormente



## Desafio 02: Trigo no Tabuleiro



### Enunciado:

Uma rainha requisitou os serviços de um monge e disse-lhe que pagaria qualquer preço. O monge, necessitando de alimentos, perguntou a rainha se o pagamento poderia ser feito em grãos de trigo dispostos em um tabuleiro de damas, de forma que o primeiro quadrado tivesse apenas um grão, e os quadrados subseqüentes, o dobro do quadrado anterior. A rainha considerou o pagamento barato e pediu que o serviço fosse executado, porém, um dos cavaleiros que estava presente e entendia um pouco de matemática alertou-a que seria impossível executar o pagamento, pois a quantidade de grão seria muito alta. Curiosa, a rainha solicitou então a este cavaleiro que era bom em cálculo, que fizesse um programa que recebesse como entrada o número de quadrados a serem usados em um tabuleiro de damas e apresentasse a quantidade de kg de trigo correspondente, sabendo que cada 12 grãos do cereal correspondem a uma grama. Finalmente, o cálculo da quantidade deverá caber em um valor inteiro de 64 bits sem sinal.



### Entrada

A primeira linha de entrada contem um único inteiro **N** (1 ≤ **N** ≤ 100), indicando o número de casos de teste. Cada caso de teste contém um único inteiro **X** (1 ≤ **X** ≤ 64), indicando o número de casas do tabuleiro que serão utilizadas.



### Saída

Para cada caso de teste, imprima a quantidade de kgs de trigo que o monge esperava receber.



### Exemplo 02

![Exemplo02](.github\images\Exemplo02.JPG)



### Lições Aprendidas

- Números gigantes (maiores que o long), utilizar o BIgIntenger (import java.math.BigInteger);
- Manusear os dados BigInteger e fazer suas operações matemáticas básicas;



## Desafio 03: MacPRONALTS



### Enunciado:

O MacPRONALTS está com uma super promoção, exclusivo para os competidores da primeira Seletiva do MaratonaTEC. Só que teve um problema, todos os maratonistas foram tentar comprar ao mesmo tempo, com isso gerou uma fila muito grande. O pior é que a moça do caixa estava sem calculadora ou um programa para ajudá-la a calcular com maior agilidade, eis que surge você para fazer um programa para ajudar a coitada e aumentar a renda do MacPRONALTS. Segue o cardápio do dia contendo o número do produto e seu respectivo valor.

1001 | R$ 1.50

1002 | R$ 2.50

1003 | R$ 3.50

1004 | R$ 4.50

1005 | R$ 5.50



### Entrada

A primeira entrada informada é a quantidade de produtos comprados (1 <= **p** <= 5). Para cada produto segue a quantidade (1 <= **q** <= 500) que o consumidor comprou.

Obs.: não poderão ser informados números de produtos repetidos.

### Saída

Você deve imprimir o valor da compra com duas casas decimais.



### Exemplo 03

![Exemplo03](.github\images\Exemplo03.JPG)



### Lições Aprendidas

-  import java.util.Locale (Para conversões de unidades/linguagens)
- deve-se tomar cuidado com os interruptores de laço (break/continue)
- para exibir decimal com quantidade de casas especificadas existe a função printf (System.out.printf("%.02f", res))



## Desafio 04: Fuso Horário



### Enunciado:

Romeu e Julieta acabaram de casar e estão planejamendo a Lua de Mel na Europa. Como vão visitar vários países, o fuso horário de cada um é diferente, por isso eles precisam ficar atento às escalas.

Para que a Lua de Mel deles seja um sucesso, ele pediram que você desenvolva um aplicativo que, a partir da hora de saída, tempo de viagem e fuso horário do destino comparado ao país de origem, informe a hora de chegada de cada vôo no destino. 

Por exemplo, se eles partirem às 10 horas da manhã para uma viagem de 4 horas rumo a um destino que fica à leste, em um fuso horário com uma hora a mais com relação ao fuso horário do ponto de partida, a hora de chegada terá que ser: 10 horas + 4 horas de viagem + 1 hora de deslocamento pelo fuso, ou seja, chegarão às 15 horas. Note que se a hora calculada for igual a 24, seu programa deverá imprimir 0 (zero).



### Entrada

A entrada contém 3 inteiros: **S** (0 ≤ **S** ≤ 23), **T** (1 ≤ **T** ≤ 12) e **F** (-5 ≤ **F** ≤ 5), separados por um espaço, indicando respectivamente a hora da saída, o tempo de viagem e o fuso horário do destino com relação à origem.

### Saída

Imprima um inteiro que indica a hora local prevista no destino, conforme os exemplos abaixo.



### Exemplo 04

![Exemplo04](.github\images\Exemplo04.JPG)



### Lições Aprendidas

- Uso dos métodos BufferedReader, InputStreamReader, e SringTokenizer para captar valores separados por espaço;
- Algumas funções dentro do main podem lançar exceções do tipo de Entrada e Saída (IO) e uma das soluções para esse problema é adicionando o throws IOException na assinatura do método. Fazendo isso, você vai indicar que aquele método vai receber a exceção e lançar pro método que chamou ele. Vai ‘passar pra frente’ ao invés de tratar. (https://www.guj.com.br/t/porque-algumas-funcoes-em-java-pede-para-adicionar-isso-throws-ioexception-na-main/52134/3)



## Desafio 05: Par ou Ímpar



### Enunciado:

Leia um valor inteiro **N**. Este valor será a quantidade de valores que serão lidos em seguida. Para cada valor lido, mostre uma mensagem em inglês dizendo se este valor lido é par (*EVEN*), ímpar (*ODD*), positivo (*POSITIVE*) ou negativo (*NEGATIVE*). No caso do valor ser igual a zero (0), embora a descrição correta seja (*EVEN NULL*), pois por definição zero é par, seu programa deverá imprimir apenas *NULL*.



### Entrada

A primeira linha da entrada contém um valor inteiro **N**(**N** < 10000) que indica o número de casos de teste. Cada caso de teste a seguir é um valor inteiro **X** (-107 < **X** <107).

### Saída

Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo abaixo. Todas as letras deverão ser maiúsculas e sempre deverá haver um espaço **entre** duas palavras impressas na mesma linha.



### Exemplo 05

![Exemplo05](.github\images\Exemplo05.JPG)



### Lições Aprendidas

- Lembrar de utilizar label para controle de fluxo do código;





## Desafio 06: Dama



### Enunciado:

O jogo de xadrez possui várias peças com movimentos curiosos: uma delas é a *dama*, que pode se mover qualquer quantidade de casas na mesma linha, na mesma coluna, ou em uma das duas diagonais, conforme exemplifica a figura abaixo:


![img](https://resources.urionlinejudge.com.br/gallery/images/problems/UOJ_1087.png)

 

O grande mestre de xadrez Kary Gasparov inventou um novo tipo de problema de xadrez: dada a posição de uma dama em um tabuleiro de xadrez vazio (ou seja, um tabuleiro 8 × 8, com 64 casas), de quantos movimentos, no mínimo, ela precisa para chegar em outra casa do tabuleiro?

Kary achou a solução para alguns desses problemas, mas teve dificuldade com outros, e por isso pediu que você escrevesse um programa que resolve esse tipo de problema.  



### Entrada

A entrada contém vários casos de teste. A primeira e única linha de cada caso de teste contém quatro inteiros *X1*, *Y1*, *X2* e *Y2* (*1 ≤ X1, Y1, X2, Y2 ≤ 8*). A dama começa na casa de coordenadas *(X1, Y1)*, e a casa de destino é a casa de coordenadas*(X2, Y2)*. No tabuleiro, as colunas são numeradas da esquerda para a direita de 1 a 8 e as linhas de cima para baixo também de 1 a 8. As coordenadas de uma casa na linha X e coluna Y são (*X, Y* ).

O final da entrada é indicado por uma linha contendo quatro zeros.

### Saída

Para cada caso de teste da entrada seu programa deve imprimir uma única linha na saída, contendo um número inteiro, indicando o menor número de movimentos necessários para a dama chegar em sua casa de destino.



### Exemplo 06:

![Exemplo06](.github\images\Exemplo06.jpg)



Maratona de Programação da SBC 2008.



### Lições Aprendidas

- Utilizar a função Math.abs para deixar os valores absolutos e positivos
- Utilizar while para abrir testes até indicar uma condição de parada;