public class InsertionSort{

    public Comparable[] sort(Comparable[]vetor){
        Comparable chave;
        int i;
        for(int j = 1; j < vetor.length; j++){
            chave = vetor[j];
            i = j-1;
            while(i >= 0 && vetor[i].compareTo(chave) > 0){
                vetor[i+1] = vetor[i];
                i--;
            }
            vetor[i+1] = chave;
        }
        return vetor;
    }
}