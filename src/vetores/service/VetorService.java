package vetores.service;
public class VetorService {
    // Declaração de variável
    private int[] numeros;

    // Construtor: Recebe o vetor de fora e salva ele dentro da classe para ser usado pelos outros métodos
    public VetorService(int[] numeros) {
        this.numeros = numeros;
        
    }

   // Método que percorre o vetor para encontrar e retornar o maior número par
    public Integer obterMaiorPar() {
        Integer maiorPar = null;
        for (int num : numeros) {
            if (num % 2 == 0) {
                if (maiorPar == null || num > maiorPar) {
                    maiorPar = num;
                }
            }
        }
        return maiorPar;
    }
    // Método que percorre o vetor para encontrar e retornar o menor número ímpar
    public Integer obterMenorImpar() {
        Integer menorImpar = null;
        for (int num : numeros) {
            if (num % 2 != 0) {
                if (menorImpar == null || num < menorImpar) {
                    menorImpar = num;
                }
            }
        }
        return menorImpar;
    }
    // Método que soma todos os números guardados no vetor
    public int calcularSomatorio() {
        int somatorio = 0;
        for (int num : numeros) {
            somatorio += num;
        }
        return somatorio;
    }
    // Método que calcula a média aritmética dos números do vetor
    public double calcularMedia() {

        return (double) calcularSomatorio() / numeros.length;
    }
}
