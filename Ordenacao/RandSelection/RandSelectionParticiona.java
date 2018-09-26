public class RandSelectionParticiona{
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

    private static int rand(int inicio, int fim){
        return new Random().nextInt((fim - inicio)+1)+inicio;
    }

    private static int randParticiona(Comparable[] vetor, int inicio, int fim){
        int i = rand(inicio, fim);
        Comparable aux = vetor[i];
        vetor[i] = vetor[fim];
        vetor[fim] = aux;
        return particiona(vetor, inicio, fim);
    }

    private static Comparable randSelection(Comparable[] vetor, int inicio, int fim, int i){
        if(inicio == fim){
            return vetor[inicio];
        }

        int meio = randParticiona(vetor, inicio, fim);

        int k = meio - inicio + 1;

        if(i == k){
            return vetor[meio];
        }else if(i < k){
            return randSelection(vetor, inicio, meio-1, i);
        }else{
            return randSelection(vetor, meio+1, fim, i-k);
        }
    }
}