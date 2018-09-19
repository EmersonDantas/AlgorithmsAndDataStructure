public class Test{
    public static void main(String[] args){
        SelectionSort ordenador = new SelectionSort();

        int[] vetorOrdenado = ordenador.selectionSort(new int[] {4,8,2,-1,5,7,6,3});

        System.out.print("Vetor ordenado = [");
        for(int a: vetorOrdenado){
            System.out.print(a+",");
        }
        System.out.println("]");
    }
}