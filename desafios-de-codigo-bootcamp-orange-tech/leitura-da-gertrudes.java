DESAFIO
Sua tia Gertrudes é uma leitora assídua. E ela gostaria de ter um aplicativo que dissesse para ela, de acordo com o número de páginas de um livro, quanto tempo ela levaria para ler lendo apenas 3 páginas por dia. 
Como você está aprendendo Java, você se disponibilizou para ajudá-la com esse desenvolvimento.

ENTRADA
A entrada será o número de páginas de um determinado livro.

SAÍDA
A saída deverá ser quanto tempo ela vai levar para ler esse livro.

EXEMPLO

---------------------------
|  Entrada |     Saída    |
---------------------------
|    30    |   "10 dias"  | 
---------------------------
|    15    |   "5 dias"   | 
---------------------------
|    90    |   "30 dias"  | 
---------------------------

RESOLUÇÃO

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.   

import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;
        
        // TODO: Crie a condição necessária para que Getrudes saiba em quanto tempo terminará seus livros

    int total = paginas / paginasLidas;

    System.out.println(total+" dias");

  }

}
