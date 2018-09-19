public class InsertionSort{
    public int[] insertionSort(int[] vetorDesordenado){
        int chave, i;
        for(int j = 1; j < vetorDesordenado.length;j++){
            chave = vetorDesordenado[j];
            i = j-1;

            while(i >= 0 && vetorDesordenado[i] > chave){
                vetorDesordenado[i + 1] = vetorDesordenado[i];
                i--;
            }

            vetorDesordenado[i+1] = chave;
        }

        return vetorDesordenado; // Porém ordenado :P
    }
}