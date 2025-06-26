DESAFIO

Você levou sua namorada na incrível rede de lanchonetes Dc Monalds e ficou maravilhado como aquele lanche era gostoso. Porém, ficou 
horrorizado como algumas coisas no aplicativo do cardápio estavam erradas. Então, você se ofereceu para ajudá-los com seus conhecimentos
de programação. Ao conversar com o gerente, ele te explicou que a vontade da lanchonete era criar um menu com os nomes dos ingredientes 
formando o lanche, como no exemplo abaixo:

Pao
Presunto
Carne
Pao

Ajude o restaurante a programar isso.

ENTRADA

A entrada serão os ingredientes que compõem o lanche.

SAÍDA

A saída deverá ser o lanche montado com as palavras que definem os ingredientes.

EXEMPLO 

-------------------------------------
|         Entrada        |   Saída  | 
| Pao;Presunto;Carne;Pao |    Pao   |
|                        | Presunto |
|                        |   Carne  |
|                        |    Pao   |
-------------------------------------
|  Pao;Picles;Tomate;Pao |    Pao   |
|                        |  Picles  |
|                        |   Tomate |
|                        |    Pao   |
-------------------------------------
|  Pao;Tomate;Carne;Pao  |    Pao   |
|                        |   Tomate |
|                        |   Carne  |
|                        |    Pao   |
-------------------------------------

RESOLUÇÃO 

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha. 
// - O método .split() quebra uma String em várias substrings a partir de um caracter definido por você e coloca em um array. 

import java.util.Scanner; 

public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String listaIngredientes[] = new String[3];

// TODO: Crie a condição necessária para formatar e printar o texto da maneira pedida na saída

listaIngredientes = ingredientes.split(";");
for (int i=0;i<=listaIngredientes.length-1;i++){
    System.out.println(listaIngredientes[i]+" ");
}
    }
}
