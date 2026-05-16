package vetores.app;


import javax.swing.JOptionPane;
import vetores.service.VetorService;

public class ProgramaVetor{
public static void main(String[] args) {
    //array de números inteiros com cinco posições
        int[] numeros = new int[5];
    // Laço de repetição que roda de acordo com o tamanho do vetor para preenchê-lo
        for (int cont = 0; cont < numeros.length; cont++) {
            // Abre uma janela gráfica pedindo para o usuário digitar o número atual
            String entrada = JOptionPane.showInputDialog(
                null, 
                "Digite o " + (cont + 1) + "º número inteiro:", 
                "Entrada de Dados", 
                JOptionPane.QUESTION_MESSAGE
            );
            numeros[cont] = Integer.parseInt(entrada);
        }
        // criação do objeto
        VetorService processador = new VetorService(numeros);
        
        String resultado = "--- RESULTADOS ---\n\n";
        
        // Chama os métodos do objeto (processador) para encontrar o maior par e o menor ímpar
        // e guarda esses valores em variáveis para exibir no relatório final.
        Integer maiorPar = processador.obterMaiorPar();
        Integer menorImpar = processador.obterMenorImpar();
    
        // Verifica se foi encontrado algum número par, se sim, adiciona o valor ao texto do resultado, senão avisa que nenhum foi digitado
        if (maiorPar != null) {
            resultado += "● Maior número par: " + maiorPar + "\n";
        } else {
            resultado += "● Maior número par: Nenhum par digitado.\n";
        }
        // Faz a mesma verificação para o menor número ímpar, adicionando a mensagem correspondente ao texto final
        if (menorImpar != null) {
            resultado += "● Menor número ímpar: " + menorImpar + "\n";
        } else {
            resultado += "● Menor número ímpar: Nenhum ímpar digitado.\n";
        }

        // Chama os métodos de cálculo do objeto (processador) e concatena (soma) 
        // o somatório total e a média na string de texto do relatório final
        resultado += "● Somatório total: " + processador.calcularSomatorio() + "\n";
        resultado += "● Média dos valores: " + processador.calcularMedia();

        // Abre a janela gráfica final exibindo todo o texto acumulado na variável (resultado) 
        // com o título "Relatório Final" e um ícone de informação
        JOptionPane.showMessageDialog(
            null, 
            resultado, 
            "Relatório Final", 
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
    

