DESCRIÇÃO
Uma loja de roupas está modernizando seu sistema e deseja registrar seus produtos de forma organizada. Para isso, você deve criar uma classe chamada Produto com três atributos: nome, preco e categoria. O programa deverá ler os dados do produto (nome, preço e categoria) fornecidos pelo usuário, criar um objeto da classe Produto com esses valores e, por fim, exibir as informações em uma única linha, seguindo o formato estabelecido.
Para obter a saída correta, o programa deve:
Ler os três dados de entrada digitados pelo usuário, na mesma linha (separados por espaço).
Criar um objeto da classe Produto utilizando os dados recebidos.
Exibir os dados no formato: Produto: [nome] | Categoria: [categoria] | Preco: R$ [preco]
Esse formato padronizado vai permitir que a loja imprima ou exiba em sistemas de estoque as informações de cada produto de maneira organizada.

ENTRADA
O programa deve receber os seguintes dados, digitados na mesma linha e separados por espaços:
Nome do produto (String);
Preço do produto (double);
Categoria do produto (String).

SAÍDA
O programa deve exibir uma única linha com as informações do produto formatadas, seguindo exatamente o modelo:
Produto: [nome] | Categoria: [categoria] | Preco: R$ [preco]
O nome e a categoria devem aparecer exatamente como foram digitados. O preço deve ser exibido com ponto decimal e duas casas decimais, como foi inserido na entrada.

EXEMPLOS
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

-------------------------------------------------------------------------------------
|        ENTRADA         |                           SAÍDA                          | 
-------------------------------------------------------------------------------------
| Camiseta 49.90 Roupas  | Produto: Camiseta | Categoria: Roupas | Preco: R$ 49.90  |
------------------------------------------------------------------------------------- 
| Calca 89.90 Jeans      | Produto: Calca | Categoria: Jeans | Preco: R$ 89.90      |
------------------------------------------------------------------------------------- 
| Jaqueta 199.90 Inverno | Produto: Jaqueta | Categoria: Inverno | Preco: R$ 199.90 |
------------------------------------------------------------------------------------- 
| Bone 29.90 Acessorios  | Produto: Bone | Categoria: Acessorios | Preco: R$ 29.90  |
------------------------------------------------------------------------------------- 

RESOLUÇÃO

import java.util.Scanner;

// Classe Produto
class Produto {
    private String nome;
    private double preco;
    private String categoria;

    // Construtor
    public Produto(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    // Método para exibir no formato solicitado
    public String exibir() {
        return String.format("Produto: %s | Categoria: %s | Preco: R$ %.2f", nome, categoria, preco);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo os dados do produto
        String nome = scanner.next();
        double preco = scanner.nextDouble();
        String categoria = scanner.next();

        // Criando o objeto Produto
        Produto produto = new Produto(nome, preco, categoria);

        // Exibindo a saída formatada
        System.out.println(produto.exibir());

        scanner.close();
    }
}
