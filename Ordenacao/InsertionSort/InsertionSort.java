public class InsertionSort{

    public int[] sort(int[]vetor){
        int chave;
        int i;
        for(int j = 1; j < vetor.length; j++){
            chave = vetor[j];
            i = j-1;
            while(i >= 0 && vetor[i] > chave){
                vetor[i+1] = vetor[i];
                i--;
            }

            vetor[i+1] = chave;
        }

        return vetor;
    }

}