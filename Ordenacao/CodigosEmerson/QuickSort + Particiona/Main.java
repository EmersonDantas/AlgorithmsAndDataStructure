public class Main{
    public static void main(String[] args){
        Comparable [] vetor = new Comparable[] {"e", "f", "b", "a", "c", "d"};
        QuickSortParticiona.sort(vetor, 0,5);

        for(Comparable a: vetor){
            System.out.print(a+" ");
        }
    }
}