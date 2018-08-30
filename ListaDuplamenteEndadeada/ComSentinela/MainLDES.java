public class MainLDES{
    public static void main(String[]args){
        ListaDupEncSent<String> lista = new ListaDupEncSent<>();
        lista.adicionarNoInicio("Emerson");
        lista.printaLista();
        System.out.println("------------------");
        lista.removeElemento("Emerson");
        lista.printaLista();
        System.out.println("------------------");
    }
}