public class MainListaDup{
    public static void main(String[]args){
        ListaDupEnc<String> listaDup = new ListaDupEnc<>();
        listaDup.addNoInicio("item1");
        listaDup.addNoInicio("item2");
        listaDup.addNoFim("item3");
        listaDup.addNoInicio("Aquamen");
        listaDup.imprimeLista();

        System.out.println("------------------------");
        listaDup.removeElemento("item3");
        listaDup.imprimeLista();
    }
}