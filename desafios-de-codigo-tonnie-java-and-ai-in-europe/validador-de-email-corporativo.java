DESAFIO
Sua empresa exige que todos os funcionários utilizem e-mails corporativos com o domínio @company.com. O objetivo deste desafio é criar um programa que valide se o e-mail informado corresponde ao domínio correto. 
Caso o e-mail não tenha o domínio correto, o sistema deverá indicar que o domínio não é válido.

ENTRADA
A entrada é um e-mail no formato nome@domínio.

SAÍDA
O programa deve verificar se o e-mail contém o domínio @company.com. Se o domínio for correto, retorna "E-mail valido", caso contrário, retorna "E-mail invalido".

EXEMPLOS
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

-----------------------------------------------
|           ENTRADA         |      SAÍDA      | 
-----------------------------------------------
| joao.silva@company.com    | E-mail valido   | 
-----------------------------------------------
| maria.silva@exemplo.com   | E-mail invalido | 
-----------------------------------------------
| pedro.almeida@company.com	| E-mail valido   | 
-----------------------------------------------

Atenção: É extremamente importante que as entradas e saídas sejam exatamente iguais às descritas na descrição do desafio de código.

RESOLUÇÃO

import java.util.Scanner;

public class CorporateEmailValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expectedDomain = "@company.com";
        String email = scanner.nextLine().trim();

        if (email.endsWith(expectedDomain)) {
            System.out.println("E-mail valido");
        } else {
            System.out.println("E-mail invalido");
        }

        scanner.close();
    }
}
