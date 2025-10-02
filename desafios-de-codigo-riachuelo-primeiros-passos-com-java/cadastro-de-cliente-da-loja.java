DESCRIÇÃO
Uma loja de roupas está começando a criar um sistema para cadastrar clientes. Você deve criar uma classe chamada Cliente que armazene as informações nome e email. Depois, o programa deve instanciar um objeto dessa classe usando os dados fornecidos pelo usuário e exibir uma mensagem de boas-vindas para o cliente.
Esse será o primeiro passo para construir um sistema mais completo de fidelidade, que será expandido no próximo desafio.

ENTRADA
O programa deve receber os seguintes dados, digitados na mesma linha e separados por espaços:
Nome do cliente (String, apenas uma palavra);
Email do cliente (String).

SAÍDA
O programa deve exibir uma mensagem de boas-vindas no seguinte formato:
Cliente [nome] cadastrado com sucesso! Email: [email]

EXEMPLOS
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

----------------------------------------------------------------------------------------
|        ENTRADA        |                            SAÍDA                             | 
----------------------------------------------------------------------------------------
| Ana ana@email.com     | Cliente Ana cadastrado com sucesso! Email: ana@email.com     |
---------------------------------------------------------------------------------------- 
| Joao joao@email.com   | Cliente Joao cadastrado com sucesso! Email: joao@email.com   |
---------------------------------------------------------------------------------------- 
| Maria maria@email.com | Cliente Maria cadastrado com sucesso! Email: maria@email.com |
----------------------------------------------------------------------------------------

RESOLUÇÃO

 import java.util.Scanner;

// Classe Cliente
class Cliente {
    private String nome;
    private String email;

    // Construtor
    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê nome e email do cliente
        String nome = scanner.next();
        String email = scanner.next();

        // Cria o objeto Cliente
        Cliente cliente = new Cliente(nome, email);

        // Exibe a mensagem no formato pedido
        System.out.println("Cliente " + cliente.getNome() + " cadastrado com sucesso! Email: " + cliente.getEmail());

        scanner.close();
    }
}
