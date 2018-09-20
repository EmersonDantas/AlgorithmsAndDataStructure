public class Merge{

    public int[] merge(int[] vetorOriginal,int p,int q,int r){//p inicio da primeira sequencia, q final da primeira sequencia
        //r final da segunda sequencia

        int i = p;
        int j = q + 1;

        int[] aux = new int[vetorOriginal.length];

        //faz uma copia do vetor original
        for(int k = p;k <= r;k++){
            aux[k] = vetorOriginal[k];
        }

        //ordenado o vetor
        for(int k = p;k <= r;k++){
            if(i > q){
                vetorOriginal[k] = aux[j++];
            }else{
                if(j > r){
                    vetorOriginal[k] = aux[i++];
                }else{
                    if(aux[j] < aux[i]){
                        vetorOriginal[k] = aux[j++];
                    }else{
                        vetorOriginal[k] = aux[i++];
                    }
                }
            }
        }

        return vetorOriginal;

    }
}