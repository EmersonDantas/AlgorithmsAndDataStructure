public class SelectionSort{
    public int[] selectionSort(int[] vetorDesordenado){
        int minimo;
        for(int i = 0; i < vetorDesordenado.length;i++){
            minimo = i;
            for(int j = i + 1; j < vetorDesordenado.length;j++){
                if(vetorDesordenado[j] < vetorDesordenado[minimo]){
                    minimo = j;
                }
            }

            int aux = vetorDesordenado[i];
            vetorDesordenado[i] = vetorDesordenado[minimo];
            vetorDesordenado[minimo] = aux;
        }
        return vetorDesordenado; // Porém está ordenado :P
    }

    
}