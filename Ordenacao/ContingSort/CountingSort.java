public class CountingSort{
    public int[] countingSort(int[] vetorDesordenado, int valorDoMaiorElemento){
        //Todos os valores do vetorDesordenado são menores que o valorDoMaiorElemento.
        //O vetor de saída é o vetor de entrada ordenado.
        int[] vetorOrdenado = new int[vetorDesordenado.length];

        //Criando o vetor dos contadores, ele é do tamanho do maior elemento do vetor desordenado.

        int[] vetorDeContadores = new int[valorDoMaiorElemento];

        //Iniciando os contadores com 0
        for(int i = 0; i < valorDoMaiorElemento; i++){
            vetorDeContadores[i] = 0;
        }

        //Contando os elementos

        for(int j = 0; j < vetorDesordenado.length;j++){
            vetorDeContadores[vetorDesordenado[j]-1]++; // Tem que ter o menos 1 porque estou começando o vetor do 0, vai de 0 à n-1
        }

        //Agora o vetorDeContadores[i] contém o número de elementos em A iguais a i
        //A próxima etapa consiste em usar essa informação para contar elementos menores ou iguais a i

        for(int i = 1; i < valorDoMaiorElemento; i++){
            vetorDeContadores[i] += vetorDeContadores[i-1];
        }

        for(int j = vetorOrdenado.length-1; j >= 0; j--){
            vetorOrdenado[vetorDeContadores[vetorDesordenado[j]-1]-1] = vetorDesordenado[j]; // Tenho que incrementar 1
            vetorDeContadores[vetorDesordenado[j]-1]--; // Tenho que incrementar 1
        }

        //ANTI CTRL Z !!!!!!!!!!!!!!!@@@@@@@@@@@@@@@@@@########################## &&&&&&&&
        return vetorOrdenado;
    }
}