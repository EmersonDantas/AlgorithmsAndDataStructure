public class MainListaDup{
    public static void main(String[]args){
        ListaDupEnc<String> listaDup = new ListaDupEnc<>();
        listaDup.addNoInicio("item1");
        listaDup.imprimeLista();

        System.out.println("------------------------");
        listaDup.removerDoInicio();
        listaDup.imprimeLista();
    }
}