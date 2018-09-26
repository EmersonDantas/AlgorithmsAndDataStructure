public class Test{
    public static void main(String[]args){
        InsertionSort ordenador = new InsertionSort();

        Comparable[] vetorOrdenado = ordenador.sort(new Comparable[] {"f","d","b","C","b","a","e"});
        
        System.out.print("Vetor ordenado = [");
        for(Comparable a: vetorOrdenado){
            System.out.print(a+",");
        }
        System.out.println("]");
    }
}