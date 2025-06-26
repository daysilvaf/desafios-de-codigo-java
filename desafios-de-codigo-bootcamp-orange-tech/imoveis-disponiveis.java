DESAFIO
O seu amigo quer verificar quais os imóveis estão disponíveis em uma certa corretora na região onde ele mora. A corretora disponibilizou uma API para ele, mas como ele não entende nada de programação, 
pediu a sua ajuda. Para deixar tudo bonitinho, você resolveu criar um aplicativo para seu querido amigo, mas quando foi olhar a API retornava os dados de uma forma esquisita, separado por barras. Ajude seu 
amigo deixando a informação mais amigável possível.

ENTRADA
A entrada será a classificação do imóvel, o valor do aluguel dele e se ele está disponível no momento.

SAÍDA
A saída deverá ser as informações da entrada, porém de uma forma mais amigável. (sem as aspas)

EXEMPLO

-----------------------------------------------------------------------------
|           Entrada            |                     Saída                  | 
-----------------------------------------------------------------------------
|     Casa/1900/Disponivel     |       "Imovel: Casa R$1900 Disponivel"     | 
-----------------------------------------------------------------------------
| Apartamento/850/Indisponivel |  "Imovel: Apartamento R$850 Indisponivel"  | 
-----------------------------------------------------------------------------

RESOLUÇÃO 

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha. 
// - O método .split() quebra uma String em várias substrings a partir de um caracter definido por você e coloca em um array. 

import java.util.Scanner; 

public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.next();
        String array[] = new String[3];

// TODO: Crie a condição necessária para remover as barras da String e apresentar de forma mais amigável

array = frase.split("/");
System.out.print("Imovel: ");
for (int i=0;i<=array.length-1;i++){
    if(i==1){
        System.out.print("R$");
    }
    System.out.print(array[i]+" ");
}
    }
}
