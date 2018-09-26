public class Test{
    public static void main(String[] args){
        SelectionSort ordenador = new SelectionSort();

        Comparable[] vetorOrdenado = ordenador.selectionSort(new Comparable[] {4,8,2,-1,5,7,6,3});

        System.out.print("Vetor ordenado = [");
        for(Comparable a: vetorOrdenado){
            System.out.print(a+",");
        }
        System.out.println("]");
    }
}