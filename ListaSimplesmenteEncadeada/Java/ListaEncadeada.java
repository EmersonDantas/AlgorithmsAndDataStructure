import java.util.NoSuchElementException;

public class ListaEncadeada<Dado>{

    private No inicio;
    private No fim;
    private int tamanho;

    public ListaEncadeada(){
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;

    }

    public void adicionaNoFim(Dado elemento){
        No<Dado> novoNo = new No<>(elemento);

        if(isEmpty()){
            this.inicio = novoNo;
            this.fim = novoNo;
        }else{
            this.fim.proximo = novoNo;
            this.fim = novoNo;
            
        }
        
        this.tamanho++;
    }

    public void adicionaNoInicio(Dado elemento){
        No<Dado> novoNo = new No<>(elemento);
        if(isEmpty()){
            this.inicio = novoNo;
            this.fim = novoNo;
        }else{
            novoNo.proximo = this.inicio;
            this.inicio = novoNo;
            
        }

        this.tamanho++;
    }

    public void removeDoFim(){
        No x = inicio;
        for(;x.proximo.proximo != null; x = x.proximo);
        x.proximo = null;
        this.fim = x;
    }

    public void removeOProximo(Dado elemento){
        No base = buscaDado(elemento);

        if(base == null || base.proximo == null){
            throw new NoSuchElementException();
            
        }else{
            No aRemover = base.proximo;
            base.proximo = base.proximo.proximo;
            aRemover.proximo = null;
        }

    }

    public No buscaDado(Dado elemento){
        No x = this.inicio;
        for(; x != null; x = x.proximo){
            if(x.dado.equals(elemento)) break;
        }
        return x;
    } 

    public void printaLista(){
        for(No<Dado> x = this.inicio; x != null; x = x.proximo){
            System.out.println(x.dado);
        }
    }

    public int getTamanho(){
        return this.tamanho;
    }

    public boolean isEmpty(){
        return (this.inicio == null);
    }

    public class No<Dado>{
        Dado dado;
        No proximo;

        public No(Dado elemento){
            this.dado = elemento;
            this.proximo = null;
        }

    }

}