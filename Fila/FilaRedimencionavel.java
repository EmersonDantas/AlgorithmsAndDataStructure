import java.util.NoSuchElementException;

public class FilaRedimencionavel<Item>{
    private Item[] vetor;
    private int tamanho;
    private int primeiro;
    private int ultimo;

    public FilaRedimencionavel(int capacidade){
        this.tamanho = 0;
        this.vetor = (Item[]) new Object[capacidade];
        this.primeiro = 0;
        this.ultimo = 0;
    }

    public FilaRedimencionavel(){
        this(2);
    }

    public boolean isEmpty(){
        return (tamanho == 0);
    }

    public int size(){
        return tamanho;
    }

    public int length(){
        return this.vetor.length;
    }

    public void redimenciona(int capacidade){
        assert capacidade >= this.tamanho;
        Item[] novoVetor = (Item[]) new Object[capacidade];

        for(int k = 0; k < this.tamanho; k++){
            novoVetor[k] = this.vetor[(primeiro + k) % this.vetor.length]; 
        }

        this.vetor = novoVetor;
        this.primeiro = 0;
        this.ultimo = this.tamanho;
    }

    public void enfileire(Item item){
        if(this.tamanho == this.vetor.length){
            redimenciona(2*this.vetor.length);
        }

        this.vetor[this.ultimo] = item;
        this.ultimo++;

        if(this.ultimo == vetor.length){
            this.ultimo = 0;
        }

        this.tamanho++;
    }

    public Item desenfileire(){
        if(isEmpty()){
            throw new NoSuchElementException("Fila vazia!");
        }

        Item item = this.vetor[this.primeiro];
        this.tamanho--;

        this.primeiro++;

        if(this.primeiro == this.vetor.length){
            this.primeiro = 0;
        }

        if(this.tamanho > 0 && this.tamanho == this.vetor.length/4){
            redimenciona(this.vetor.length / 2);
        }

        return item;
    }

    public Item peek(){
        if(isEmpty()){
            throw new NoSuchElementException("Fila vazia!");
        }

        return this.vetor[this.primeiro];
    }
}