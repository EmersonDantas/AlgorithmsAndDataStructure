public class ListaDupEnc<Item>{
    private No inicio;
    private No fim;
    private int tamanho;

    public ListaDupEnc(){
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public void removerDoInicio(){
        this.inicio = this.inicio.proximo;
        this.inicio.anterior = null;
    }

    public void removeElemento(Item item){
        if(!(isEmpty())){
            No x = this.inicio;
            
            for(;x != null; x = x.proximo){
                if(x.item.equals(item)){
                    if(x == this.inicio){
                        x.proximo.anterior = null;
                        this.inicio = x.proximo;
                    }else if(x == this.fim){
                        this.fim = x.anterior;
                        this.fim.proximo = null;
                    }else{
                        x.anterior.proximo = x.proximo;
                        x.proximo.anterior = x.anterior;
                    }
                    x = null;
                    this.tamanho--;
                    break;  
                }
            }
        }
    }

    public void addNoInicio(Item item){
        No<Item> novoNo = new No<>(item);
        if(isEmpty()){
            this.inicio = novoNo;
            this.fim = novoNo;
        }else{
            this.inicio.anterior = novoNo;
            novoNo.proximo = this.inicio;
            this.inicio = novoNo;
        }
        this.tamanho++;
    }

    public void addNoFim(Item item){
        No<Item> novoNo = new No<>(item);
        if(isEmpty()){
            this.inicio = novoNo;
            this.fim = novoNo;
        }else{
            this.fim.proximo = novoNo;
            novoNo.anterior = this.fim;
            this.fim = novoNo;
        }
        this.tamanho++;
    }

    public boolean isEmpty(){
        return this.inicio == null;
    }

    public int getTamanho(){
        return this.tamanho;
    }

    public void imprimeLista(){
        No x = this.inicio;
        for(;x != null; x = x.proximo){
            System.out.println(x.item);
        }
    }

    public class No<Tipo>{
        No proximo;
        No anterior;
        Item item;
        public No(Item item){
            this.item = item;
            proximo = null;
            anterior = null;
        }
    }
}