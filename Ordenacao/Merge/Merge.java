public class Merge{
    public int[] merge(int[] vetor, int p, int q, int r){
        int i = p;
        int j = q + 1;
        //aux é um vetor com o tamanho do vetor
        int[] aux = new int[vetor.length];
        for(int k = 0; k < vetor.length; k++){
            aux[k] = vetor[k];
        }

        for(int k = p; k < r; k++){
            if(i > q){
                vetor[k] = aux[j++];
            }else{
                if(j > r){
                    vetor[k] = aux[i++];
                }else{
                    if(aux[j] < aux[i]){
                        vetor[k] = aux[j++];
                    }else{
                        vetor[k] = aux[i++];
                    }
                }
            }
        }
        
        return vetor;
    }
}