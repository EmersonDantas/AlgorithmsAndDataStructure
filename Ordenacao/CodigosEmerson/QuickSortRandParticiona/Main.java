public class Main{
    public static void main(String[] args){
        Comparable [] vetor = new Comparable[] {"f","e", "b", "a", "c", "d"};
        QuickSortRandParticiona.randQs(vetor, 0,5);

        for(Comparable a: vetor){
            System.out.print(a+" ");
        }
    }
}