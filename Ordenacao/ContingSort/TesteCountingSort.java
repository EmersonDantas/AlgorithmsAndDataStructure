public class TesteCountingSort{
    public static void main(String[] args){
        CountingSort ordenador = new CountingSort();

        int[] vetorOrdenado = ordenador.countingSort(new int[] {2,5,7,1,3,4,6}, 7);
        
        System.out.print("Vetor ordenado = [");
        for(int a: vetorOrdenado){
            System.out.print(a+",");
        }
        System.out.println("]");
    }
}