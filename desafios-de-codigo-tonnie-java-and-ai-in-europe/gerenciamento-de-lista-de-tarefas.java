DESCRIÇÃO
Você deve criar um programa que receba uma lista de tarefas a serem feitas durante o dia. Cada tarefa possui um nome e uma prioridade (número inteiro). Ordene as tarefas pela prioridade crescente e imprima a lista organizada.

ENTRADA
A entrada receberá um número N, representando a quantidade de tarefas, seguido de N linhas, cada uma contendo o nome da tarefa e a prioridade separados por vírgula.
Um número inteiro N (quantidade de tarefas).
N linhas contendo "nome da tarefa,prioridade".

SAÍDA
Deverá retornar a lista de tarefas ordenada pela prioridade em ordem crescente, uma por linha, no formato: tarefa - prioridade.

EXEMPLOS
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

-------------------------------------------
|      ENTRADA      |        SAÍDA        | 
-------------------------------------------
|          3        |   Estudar Java - 1  | 
|  Estudar Java, 1  |    Pausa Cafe - 2   | 
|  Reuniao Tech, 3  |   Reuniao Tech - 3  | 
|   Pausa Cafe, 2   |                     |
-------------------------------------------
|          4        | Validar Codigos - 1 | 
|  Enviar Emails, 2 |  Enviar Emails - 2  | 
|     Almoco, 3     |      Almoco - 3     | 
| Validar Codigos,1 |    Exercicios - 4   | 
|   Exercicios, 4   |                     |
-------------------------------------------
|         2         |        Ler - 1      | 
| Comprar Livros, 2 |  Comprar Livros - 2 | 
|      Ler, 2       |                     |
-------------------------------------------

RESOLUÇÃO

import java.util.*;

public class GerenciamentoTarefas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê o número de tarefas
        int n = Integer.parseInt(sc.nextLine());

        // Lista para armazenar as tarefas
        List<Tarefa> tarefas = new ArrayList<>();

        // Lê cada linha, separa nome e prioridade e adiciona à lista
        for (int i = 0; i < n; i++) {
            String linha = sc.nextLine().trim();
            String[] partes = linha.split(",");
            String nome = partes[0].trim();
            int prioridade = Integer.parseInt(partes[1].trim());

            tarefas.add(new Tarefa(nome, prioridade));
        }

        // Ordena a lista pela prioridade crescente
        Collections.sort(tarefas, Comparator.comparingInt(t -> t.prioridade));

        // Imprime a lista ordenada
        for (Tarefa t : tarefas) {
            System.out.println(t.nome + " - " + t.prioridade);
        }

        sc.close();
    }

    // Classe auxiliar para armazenar nome e prioridade
    static class Tarefa {
        String nome;
        int prioridade;

        public Tarefa(String nome, int prioridade) {
            this.nome = nome;
            this.prioridade = prioridade;
        }
    }
}
