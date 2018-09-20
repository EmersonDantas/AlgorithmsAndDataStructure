public class Main{
    public static void main(String[]args){
        QuickSort q = new QuickSort();

        int[] vetor = new int[]{12,11,13,5,6,7,9,1};
        int r = vetor.length-1;
        q.quicksort(vetor, 0, r);
        System.out.print("[");
        for(int i : vetor){
            System.out.print(i+",");
        }
        System.out.println("]");
    }
}