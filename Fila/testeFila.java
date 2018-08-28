public class testeFila{
    public static void main(String[] args){
        FilaRedimencionavel<String> fila = new FilaRedimencionavel<>();
        fila.adicionarAFila("a");
        fila.adicionarAFila("b");
        fila.adicionarAFila("c");

        System.out.println(fila.peek());
        System.out.println(fila.removerDaFila());
        System.out.println(fila.peek());
        System.out.println(fila.removerDaFila());
        System.out.println(fila.peek());
        System.out.println(fila.removerDaFila());
    }
}