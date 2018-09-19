public class Test{
    public static void main(String[] args){
        Merge m = new Merge();
        int[] v = m.merge(new int[] {1,5,2,4,3}, 0, 0, 0);

        System.out.print("Vetor ordenado = [");
        for(int a: v){
            System.out.print(a+",");
        }
        System.out.println("]");
    }
}