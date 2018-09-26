public class MergeSort{
    private static void merge(Comparable[] vetor, int inicio, int meio, int fim){
        //Merge ordena um vetor com duas partes ordenadas
        int i = inicio;
        int j = meio + 1;

        Comparable[] aux = new Comparable[vetor.length];

        for (int a = inicio; a <= fim; a++){
            aux[a] = vetor[a];
        }

        for(int b = inicio; b <= fim; b++){
            if(i > meio){
                vetor[b] = aux[j++];
            }else if(j > fim){
                vetor[b] = aux[i++];
            }else if(aux[j].compareTo(aux[i]) < 0){
                vetor[b] = aux[j++];
            }else{
                vetor[b] = aux[i++];
            }
        }
    }

    public static void sort( Comparable[] vetor, int inicio, int fim){
        int meio;
        if(inicio < fim){
           meio = (inicio + fim) / 2;
           sort(vetor, inicio, meio);
           sort(vetor, meio + 1, fim);
           merge(vetor, inicio, meio, fim);
        }
    }
}