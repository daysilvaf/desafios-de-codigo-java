DESAFIO
Um recrutador atribui uma pontuação técnica para cada candidato em um processo seletivo. Você deve criar um programa que classifica os candidatos da maior para a menor pontuação e exibe seus nomes nessa ordem.

ENTRADA
A entrada deve receber:
Um número inteiro N representando o número de candidatos.
Para cada candidato: o nome e a pontuação técnica (inteiro de 0 a 100), separados por vírgula.

SAÍDA
Deverá retornar os nomes dos candidatos, ordenados da maior para a menor pontuação, um por linha. Se dois candidatos tiverem a mesma pontuação, o nome deve aparecer em ordem alfabética.

EXEMPLOS
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

--------------------
| ENTRADA  | SAÍDA | 
--------------------
|     3    | Bruno | 
|  Ana,85  |  Ana  | 
| Bruno,90 | Clara | 
| Clara,75 |       |
--------------------
|    2     | Julia | 
| Pedro,95 | Pedro | 
| Julia,95 |       |
--------------------
|     1    | Mario | 
| Mario,60 |       |
--------------------

Atenção: É extremamente importante que as entradas e saídas sejam exatamente iguais às descritas na descrição do desafio de código.

RESOLUÇÃO

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ClassificacaoCandidatos {

    static class Candidato {
        String nome;
        int pontuacao;

        Candidato(String nome, int pontuacao) {
            this.nome = nome;
            this.pontuacao = pontuacao;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());
        List<Candidato> candidatos = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String linha = scanner.nextLine().trim();
            String[] partes = linha.split(",");
            String nome = partes[0].trim();
            int pontuacao = Integer.parseInt(partes[1].trim());

            candidatos.add(new Candidato(nome, pontuacao));
        }

        // Ordena por pontuação decrescente; se igual, por nome em ordem alfabética
        Collections.sort(candidatos, new Comparator<Candidato>() {
            @Override
            public int compare(Candidato c1, Candidato c2) {
                if (c2.pontuacao != c1.pontuacao) {
                    return Integer.compare(c2.pontuacao, c1.pontuacao); // maior primeiro
                } else {
                    return c1.nome.compareTo(c2.nome); // alfabética
                }
            }
        });

        // Imprime nomes na ordem definida
        for (Candidato c : candidatos) {
            System.out.println(c.nome);
        }

        scanner.close();
    }
}
