import java.util.NoSuchElementException;

public class Pilha <Item>{
    private Item[] vetor;
    private int tamanho;

    public Pilha(int tamanho){
        this.vetor = (Item[]) new Object[tamanho];
        this.tamanho = 0;
    }

    public Pilha(){
        this(10);
    }

    public void adiciona(Item item){
        if(this.tamanho == vetor.length){
            redimenciona(this.tamanho * 2);
        }
        
        this.vetor[tamanho] = item;
        tamanho++;
    }

    public Item remove(){
        if(isEmpty()){
            throw new NoSuchElementException("Pilha vazia");
        }else{
            Item topo = this.vetor[tamanho-1];
            this.vetor[tamanho-1] = null;
            tamanho--;

            if(this.tamanho == (vetor.length / 4)){
                redimenciona(this.vetor.length / 2);
            }
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