public class MainListaEncadeada{
    public static void main (String [] args){
        ListaEncadeada<String> lista = new ListaEncadeada<>();      
        lista.adicionaNoFim("Emerson");
        lista.adicionaNoFim("Emanoelson");
        lista.adicionaNoInicio("Pedro");
        lista.printaLista();
        System.out.println(lista.getTamanho());
        lista.removeDoFim();
        lista.printaLista();
    }
}