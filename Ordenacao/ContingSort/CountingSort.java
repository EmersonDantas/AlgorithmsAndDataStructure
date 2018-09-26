public class CountingSort{
    public int[] sort(int[] vetorDesordenado, int maiorElemento){
        int[] vetorContadores = new int[maiorElemento+1];

        for(int a = 0; a < vetorContadores.length; a++){
            vetorContadores[a] = 0;
        }

        for(int b = 0; b < vetorDesordenado.length; b++){
            vetorContadores[vetorDesordenado[b]]++;
        }

        for(int c = 1; c < vetorContadores.length; c++){
            vetorContadores[c] += vetorContadores[c-1];
        }

        int[] vetorOrdenado = new int[vetorDesordenado.length];

        for(int d = vetorDesordenado.length-1; d >= 0; d--){
            vetorOrdenado[vetorContadores[vetorDesordenado[d]]-1] = vetorDesordenado[d];
            vetorContadores[vetorDesordenado[d]]--;
        }

        return vetorOrdenado;
    }
}