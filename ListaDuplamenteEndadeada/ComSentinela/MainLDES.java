public class MainLDES{
    public static void main(String[]args){
        ListaDupEncSent<String> lista = new ListaDupEncSent<>();
        lista.adicionarNoInicio("Emerson");
        lista.adicionarNoFim("Francivaldo");
        lista.adicionarNoInicio("Emanoel");
        lista.printaLista();
        System.out.println("------------------");
        lista.removeElemento("Francivaldo");
        lista.printaLista();
        System.out.println("------------------");
    }
}