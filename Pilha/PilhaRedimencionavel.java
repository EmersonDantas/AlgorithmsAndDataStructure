import java.util.NoSuchElementException;

public class PilhaRedimencionavel <Item>{
    private Item[] vetor;
    private int tamanho;

    public PilhaRedimencionavel(int tamanho){
        this.vetor = (Item[]) new Object[tamanho];
        this.tamanho = 0;
    }

    public PilhaRedimencionavel(){
        this(10);
    }

    public void push(Item item){
        if(this.tamanho == vetor.length){
            redimenciona(this.tamanho * 2);
        }
        
        this.vetor[tamanho] = item;
        tamanho++;
    }

    public Item pop(){
        if(isEmpty()){
            throw new NoSuchElementException("Pilha vazia");
        }
        
        tamanho--;
        Item topo = this.vetor[tamanho];
        this.vetor[tamanho] = null;

        if(this.tamanho == (vetor.length / 4)){
            redimenciona(this.vetor.length / 2);
        }
        
        return topo;
    }

    public void redimenciona(int capacidade){
        assert capacidade >= tamanho;

        Item[] novoVetor = (Item[]) new Object[capacidade];
        for(int k = 0; k < this.tamanho; k++){
            novoVetor[k] = this.vetor[k];
        }

        this.vetor = novoVetor;
    }

    public boolean isEmpty(){
        return (this.tamanho == 0);
    }

}