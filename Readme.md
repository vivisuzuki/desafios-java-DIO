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

![Exemplo01](C:\Users\User\Documents\Bootcamp - Spread\15 - Desafios de codigo\imagens\Exemplo01.JPG)



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

![Exemplo02](C:\Users\User\Documents\Bootcamp - Spread\15 - Desafios de codigo\imagens\Exemplo02.JPG)



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

![Exemplo03](C:\Users\User\Documents\Bootcamp - Spread\15 - Desafios de codigo\imagens\Exemplo03.JPG)



### Lições Aprendidas

- 
- 