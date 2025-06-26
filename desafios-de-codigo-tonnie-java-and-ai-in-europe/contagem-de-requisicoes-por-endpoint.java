DESCRIÇÃO
Receba uma lista de strings representando endpoints acessados e retorne o endpoint mais acessado. Se houver empate, retorne o que apareceu primeiro na lista.

ENTRADA
Uma linha com nomes de endpoints separados por espaço.
Uma linha contendo os nomes dos endpoints separados por espaço.

SAÍDA
O nome do endpoint mais acessado.

EXEMPLOS
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

------------------------------------------------
|             ENTRADA             |    SAÍDA   | 
------------------------------------------------
|   /login /home /login /profile  |    /login  |
------------------------------------------------ 
|       /api /api /home /api      |    /api    |
------------------------------------------------ 
| /dashboard /settings /dashboard | /dashboard |
------------------------------------------------ 

Atenção: É extremamente importante que as entradas e saídas sejam exatamente iguais à descritas na descrição do desafio de código.

RESOLUÇÃO

import java.util.*;

public class EndpointMaisAcessado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê a linha com os endpoints separados por espaço
        String linha = sc.nextLine().trim();

        // Divide a linha em um array de strings
        String[] endpoints = linha.split("\\s+");

        // Mapa para contar frequência de cada endpoint
        Map<String, Integer> frequencias = new LinkedHashMap<>();

        // Contabiliza a frequência mantendo a ordem de entrada (LinkedHashMap garante isso)
        for (String endpoint : endpoints) {
            frequencias.put(endpoint, frequencias.getOrDefault(endpoint, 0) + 1);
        }

        // Variáveis para rastrear o endpoint mais acessado
        String maisAcessado = "";
        int maiorFrequencia = 0;

        // Percorre o mapa mantendo ordem de entrada
        for (Map.Entry<String, Integer> entry : frequencias.entrySet()) {
            if (entry.getValue() > maiorFrequencia) {
                maisAcessado = entry.getKey();
                maiorFrequencia = entry.getValue();
            }
        }

        // Imprime o endpoint mais acessado
        System.out.println(maisAcessado);

        sc.close();
    }
}
