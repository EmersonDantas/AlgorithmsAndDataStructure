public class MainPilha{
    public static void main(String[] args){
        Pilha<String> minhaPilha = new Pilha<>();;
        minhaPilha.adiciona("a");
        minhaPilha.adiciona("b");
        minhaPilha.adiciona("c");

        System.out.println(minhaPilha.remove());
        
    }
}