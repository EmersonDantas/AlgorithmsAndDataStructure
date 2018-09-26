public class Main{
    public static void main(String[] args){
        Comparable [] vetor = new Comparable[] {"emanoel","Emerson", "Emanoel", "a", "c", "d"};
        QuickSortParticiona.sort(vetor, 0,5);

        for(Comparable a: vetor){
            System.out.print(a+" ");
        }
    }
}