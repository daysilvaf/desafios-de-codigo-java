DESCRIÇÃO
Você deve criar um programa que recebe uma lista de horários de reuniões agendadas durante o dia, cada uma representada por uma string no formato "HH:mm". Seu programa deve identificar e listar os horários únicos, 
ordenados do mais cedo ao mais tarde, ignorando horários repetidos.
Além disso, imprima quantos horários únicos foram informados.

ENTRADA
A primeira linha contém um número N, representando a quantidade de horários. Nas próximas N linhas, cada linha contém um horário no formato "HH:mm".
Um número inteiro N (quantidade de horários).
N linhas contendo um horário no formato "HH:mm".

SAÍDA
Imprima os horários únicos ordenados, um por linha, e ao final uma linha com:
Total de horarios unicos: X, onde X é a quantidade de horários únicos.

Atenção: Os "horarios unicos" são os horários diferentes, ou seja, cada horário aparece uma única vez na listagem, mesmo que tenham sido informados múltiplas vezes na entrada. Dessa forma, a saída apresenta os horários distintos organizados do mais cedo ao mais tarde, eliminando duplicatas da entrada.

EXEMPLOS
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

-----------------------------------------
| ENTRADA |            SAÍDA            | 
-----------------------------------------
|    3    |            12:00            | 
|  15:00  |            15:00            | 
|  12:00  | Total de horarios unicos: 2 | 
|  15:00  |                             |
-----------------------------------------
|    4    |            09:00            | 
|  11:30  |            11:30            | 
|  09:00  | Total de horarios unicos: 2 | 
|  11:30  |                             |
|  09:00  |                             |
-----------------------------------------
|    5    |            08:00            | 
|  08:00  |            09:00            | 
|  08:00  |            10:00            | 
|  08:00  | Total de horarios unicos: 3 | 
|  09:00  |                             |
|  10:00  |                             |
-----------------------------------------

RESOLUÇÃO

import java.util.*;

public class OrganizadorHorarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê a quantidade de horários
        int n = Integer.parseInt(sc.nextLine());

        // TreeSet mantém os horários únicos e automaticamente ordenados
        Set<String> horarios = new TreeSet<>();

        // Lê os horários e adiciona ao conjunto
        for (int i = 0; i < n; i++) {
            String horario = sc.nextLine().trim();
            horarios.add(horario);
        }

        // Imprime os horários únicos em ordem crescente
        for (String horario : horarios) {
            System.out.println(horario);
        }

        // Imprime o total de horários únicos
        System.out.println("Total de horarios unicos: " + horarios.size());

        sc.close();
    }
}
