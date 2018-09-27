public class BuscaBinaria{
    public static int buscaBinaria(Comparable[] vetor, Comparable chave, int min, int max){
        if(min <= max){
            int meio = min + (max-min)/2;
            if(chave.compareTo(vetor[meio]) < 0){
                return buscaBinaria(vetor, chave, min, meio-1);
            }else if(chave.compareTo(vetor[meio]) > 0){
                return buscaBinaria(vetor, chave, meio+1, max);
            }else{
                return meio;
            }
        }

        return -1;
    }
}