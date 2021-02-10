public class VetorReferencia {
    public static void main(String[] args) {
        int[] vetor = {10, 20, 30, 40};
        System.out.println("Vamos dividir cada elemento pela " +
            "metade e calcular o somatorio do vetor?");

        System.out.println("O somatório é: " + alterarVetor(vetor));
        for(int valor : vetor){
            System.out.print(valor +" ");
        }
    }

    static public double alterarVetor(int[] vetor){
        double soma = 0;
        for(int i = 0; i < vetor.length; i++){
            //altera o valor de cada elemento do vetor
            vetor[i] = vetor[i] / 2;
            soma += vetor[i];
        }
        return soma;
    }
}
