public class Main{

    public static void main(String[]args){

        MergeSort m = new MergeSort();

        int[] vetor = new int[]{12,11,13,5,6,7};
        int q = vetor.length-1;
        m.mergesort(vetor, 0, q);
        System.out.print("[");
        for(int i : vetor){
            System.out.print(i+",");
        }
        System.out.println("]");
    }
}