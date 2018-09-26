public class Test{
    public static void main(String[]args){
        InsertionSort ordenador = new InsertionSort();

        int[] vetorOrdenado = ordenador.sort(new int[] {7,4,1,2,0,3,0,-1});
        
        System.out.print("Vetor ordenado = [");
        for(int a: vetorOrdenado){
            System.out.print(a+",");
        }
        System.out.println("]");
    }
}