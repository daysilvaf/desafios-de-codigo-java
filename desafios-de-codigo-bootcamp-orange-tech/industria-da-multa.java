DESAFIO
A prefeitura de uma cidade A instalou uma câmera para verificar quem estava acima da velocidade permitida na rodovia da entrada da cidade. Porém, ela é uma cidade extremamente movimentada e a prefeitura não deu 
conta de enviar as multas necessárias para quem ultrapassasse a velocidade permitida de 60km/h.
O seu papel será o de criar um programa que verifique os dados recebidos da câmera e envie uma mensagem dizendo se o motorista será multado ou não.

ENTRADA
A entrada vai ser a velocidade do motorista.

SAÍDA
A saída será uma mensagem no console dizendo se o motorista foi multado ou não. (sem as aspas)

EXEMPLO

-----------------------------------
|  Entrada  |        Saída        |
-----------------------------------
|    60     |   "Não foi multado" | 
-----------------------------------
|    68     |     "Foi multado"   | 
-----------------------------------
|    100    |     "Foi multado"   | 
-----------------------------------

RESOLUÇÃO

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.   

import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = leitor.nextInt();
        
            if (velocidadeAtual <= 60){

     System.out.println("Nao foi multado");
        
            }
            
        // TODO: Crie a condição necessária para verificar se o motorista, de acordo com a entrada, foi multado ou não.

    else{

     System.out.println("Foi multado");

    }

  }

}
