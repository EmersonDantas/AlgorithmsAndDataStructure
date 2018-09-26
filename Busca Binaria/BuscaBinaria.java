public class BuscaBinaria{
    public static int buscaBinaria(Comparable[] vetor, Comparable chave){
        int min = 0;
        int max = vetor.length;

        while(min < max){
            int meio = min + (max - min)/2;

            if(chave.compareTo(vetor[meio]) < 0){
                max = meio-1;
            }else if(chave.compareTo(vetor[meio]) > 0){
                min = meio+1;
            }else{
                return meio;
            }
        }

        return -1;
    }
}