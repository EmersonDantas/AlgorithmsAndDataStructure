public class SelectionSort{
    public Comparable[] selectionSort(Comparable[] vetorDesordenado){
        int minimo;
        for(int i = 0; i < vetorDesordenado.length;i++){
            minimo = i;
            for(int j = i + 1; j < vetorDesordenado.length;j++){
                if(vetorDesordenado[j].compareTo(vetorDesordenado[minimo]) < 0){
                    minimo = j;
                }
            }

            Comparable aux = vetorDesordenado[i];
            vetorDesordenado[i] = vetorDesordenado[minimo];
            vetorDesordenado[minimo] = aux;
        }
        return vetorDesordenado; // Porém está ordenado :P
    }

    
}