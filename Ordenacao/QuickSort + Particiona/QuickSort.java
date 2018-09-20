public class QuickSort{

    public int particiona(int[] vetor, int p,int r){//p primeiro index, r ultimo indece

        int pivo = vetor[r];//pode ser tanto o ultimo item do vetor quanto o primeiro

        int i = p - 1;

        for(int j = p;j < r;j++){
            if(vetor[j] <= pivo){
                i++;
                int auxL = vetor[j];
                vetor[j] = vetor[i];
                vetor[i] = auxL;
            }
        }
        int auxG = vetor[r];
        vetor[r] = vetor[i+1];
        vetor[i+1] = auxG;
        return i+1;
    }

    public void quicksort(int[] vetor,int p,int r){
        if(p < r){
            int q = particiona(vetor, p, r);
            quicksort(vetor, p, q-1);
            quicksort(vetor, q+1, r);
        }
    }
    
}