public class Test{
    public static void main(String[]args){
        InsertionSort ordenador = new InsertionSort();

        int[] vetorOrdenado = ordenador.insertionSort(new String[]{"a","n","v","c"});
        
        System.out.print("Vetor ordenado = [");
        for(int a: vetorOrdenado){
            System.out.print(a+",");
        }
        System.out.println("]");
    }
}