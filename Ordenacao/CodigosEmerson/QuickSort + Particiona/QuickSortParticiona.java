public class QuickSortParticiona{
    private static int particiona(Comparable[] vetor, int inicio, int fim){
        Comparable pivo = vetor[fim];
        int i = inicio -1;
        for(int j = inicio; j < fim;j++){
            if(vetor[j].compareTo(pivo) <= 0){
                i++;
                Comparable aux = vetor[j];
                vetor[j] = vetor[i];
                vetor[i] = aux;
            }
        }
        Comparable aux2 = vetor[fim];
        vetor[fim] = vetor[i+1];
        vetor[i+1] = aux2;
        return i+1;
    }

    public static void sort(Comparable[] vetor, int inicio, int fim){
        if(inicio < fim){
            int meio = particiona(vetor, inicio, fim);
            sort(vetor,inicio,meio-1);
            sort(vetor, meio  + 1, fim);
        }
    }
}