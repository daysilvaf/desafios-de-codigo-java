DESAFIO
Você é o novo gerente de uma rede de lojas de departamento e precisa organizar o estoque de produtos. Cada loja possui um código único e você deve calcular o total de produtos disponíveis em cada uma delas. Aceite o desafio e ajude a empresa a otimizar seu estoque!

ENTRADA
A entrada deve receber uma string contendo os códigos das lojas e a quantidade de produtos, separados por vírgulas. Cada loja e sua quantidade devem ser representadas no formato "codigo:quantidade". A entrada terá no máximo 1000 caracteres.

SAÍDA
Deverá retornar uma string com os códigos das lojas e o total de produtos disponíveis em cada uma, no formato "codigo:total", separados por vírgulas.

EXEMPLOS
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

-------------------------------------------------
|          Entrada          |       Saída       | 
-------------------------------------------------
| LOJA1:10,LOJA2:5,LOJA1:3  | LOJA1:13,LOJA2:5  | 
-------------------------------------------------
| LOJA3:20,LOJA3:15,LOJA4:7 | LOJA3:35,LOJA4:7  |
------------------------------------------------- 
| LOJA5:8,LOJA6:12,LOJA5:4  | LOJA5:12,LOJA6:12 |
------------------------------------------------- 

RESOLUÇÃO

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OrganizandoEstoque {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String entrada = scanner.nextLine();
        String saida = organizarEstoque(entrada);

        System.out.println(saida);

        scanner.close();
    }

    public static String organizarEstoque(String entrada) {
        // Mapa para armazenar os códigos e suas quantidades
        Map<String, Integer> estoque = new LinkedHashMap<>();

        String[] lojas = entrada.split(",");

        for (String loja : lojas) {
            String[] partes = loja.split(":");
            String codigo = partes[0].trim();
            int quantidade = Integer.parseInt(partes[1].trim());

            // Soma no mapa se já existir, senão adiciona
            estoque.put(codigo, estoque.getOrDefault(codigo, 0) + quantidade);
        }

        // Monta a saída no formato pedido
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : estoque.entrySet()) {
            sb.append(entry.getKey()).append(":").append(entry.getValue()).append(",");
        }

        // Remove a última vírgula
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }

        return sb.toString();
    }
}
