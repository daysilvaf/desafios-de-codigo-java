DESAFIO
Você está criando um utilitário interno que ajuda a converter temperaturas de Celsius para Fahrenheit. No entanto, o sistema deve evitar falhas por entradas inválidas, como strings ou valores negativos em 
contextos indevidos.
Implemente um programa que:
Leia uma temperatura em Celsius.
Converta para Fahrenheit usando a fórmula: F = (C × 9/5) + 32

ENTRADA 
Um número decimal representando graus Celsius.
Caso a entrada não seja um número ou seja menor que -273.15, o sistema deve tratar a exceção.

SAÍDA
A temperatura convertida para Fahrenheit, com uma casa decimal.
Em caso de erro, exibir: "Entrada invalida"

EXEMPLOS
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

------------------------------
| ENTRADA |       SAÍDA      |
------------------------------ 
|   25.0  |       77.0       |
------------------------------ 
|  -300.0 | Entrada invalida |
------------------------------ 
|   abc   | Entrada invalida |
------------------------------

Atenção: É extremamente importante que as entradas e saídas sejam exatamente iguais às descritas na descrição do desafio de código.

RESOLUÇÃO

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Verifica se a próxima entrada é um número do tipo double
        if (scanner.hasNextDouble()) {
            // Lê o valor em Celsius fornecido pelo usuário
            double celsius = scanner.nextDouble();

            // Verifica se a temperatura fornecida é maior ou igual ao zero absoluto (-273.15°C)
            if (celsius >= -273.15) {
                // Converte para Fahrenheit
                double fahrenheit = (celsius * 9 / 5) + 32;

                // Exibe o resultado formatado com uma casa decimal
                System.out.printf("%.1f%n", fahrenheit);
            } else {
                // Temperatura abaixo do zero absoluto
                System.out.println("Entrada invalida");
            }
        } else {
            // Caso a entrada não seja um número válido
            System.out.println("Entrada invalida");
        }

        scanner.close();
    }
}
