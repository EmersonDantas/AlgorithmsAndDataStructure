public class Test{
    public static void main(String[]args){
        InsertionSort ordenador = new InsertionSort();

        int[] vetorOrdenado = ordenador.insertionSort(new int[] {2,5,7,1,3,4,6});
        
        System.out.print("Vetor ordenado = [");
        for(int a: vetorOrdenado){
            System.out.print(a+",");
        }
        System.out.println("]");
    }
}