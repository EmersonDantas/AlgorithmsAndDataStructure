public class testeFila{
    public static void main(String[] args){
        FilaRedimencionavel<String> fila = new FilaRedimencionavel<>();
        fila.enfileire("a");
        fila.enfileire("b");
        fila.enfileire("c");

        System.out.println(fila.length());
        System.out.println(fila.size());
        System.out.println(fila.peek());
        System.out.println(fila.desenfileire());
        System.out.println(fila.size());
        System.out.println(fila.peek());
        System.out.println(fila.desenfileire());
        System.out.println(fila.size());
        System.out.println(fila.peek());
        System.out.println(fila.desenfileire());
        System.out.println(fila.size());
    }
}