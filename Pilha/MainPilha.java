public class MainPilha{
    public static void main(String[] args){
        PilhaRedimencionavel<Integer> minhaPilha = new PilhaRedimencionavel<>();;
        minhaPilha.push(3);

        System.out.println(minhaPilha.pop());
        minhaPilha.push(2);
        minhaPilha.push(8);
        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha.pop());
        minhaPilha.push(9);
        minhaPilha.push(1);
        System.out.println(minhaPilha.pop());
        minhaPilha.push(7);
        minhaPilha.push(6);
        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha.pop());
        minhaPilha.push(4);
        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha.pop());
    }
}