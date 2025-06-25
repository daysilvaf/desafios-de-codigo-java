DESCRIÇÃO 
Simule um endpoint que recebe uma lista de nomes e retorna a lista ordenada alfabeticamente, formatada como um array JSON simples.

ENTRADA
Uma linha com nomes separados por espaço.
Uma linha contendo nomes separados por espaço.

SAÍDA
Os nomes ordenados alfabeticamente, formatados como uma lista JSON, ou seja, entre colchetes [] e cada nome entre aspas duplas, separados por vírgulas e espaços.

EXEMPLOS
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

-----------------------------------------------------
|       ENTRADA      |             SAÍDA            |
----------------------------------------------------- 
| Carlos Ana Beatriz | ["Ana", "Beatriz", "Carlos"] |
----------------------------------------------------- 
|  Maria Joao Pedro  |  ["Joao", "Maria", "Pedro"]  |
----------------------------------------------------- 
|    Zeca Ana Ana    |    ["Ana", "Ana", "Zeca"]    |
-----------------------------------------------------

RESOLUÇÃO

import java.util.*;

public class EndpointGetLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leia a linha com os nomes separados por espaço:
        String linha = sc.nextLine().trim();

        // Divide os nomes em um array:
        String[] nomes = linha.split("\\s+");

        // Ordena os nomes alfabeticamente:
        Arrays.sort(nomes);

        // Usa StringBuilder para construir a saída no formato JSON:
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < nomes.length; i++) {
            sb.append("\"").append(nomes[i]).append("\"");
            if (i < nomes.length - 1) {
                sb.append(", ");
            }
        }

        sb.append("]");

        // Imprime a lista formatada
        System.out.println(sb.toString());

        sc.close();
    }
}
