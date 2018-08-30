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
        if(this.tamanho == 1){
            this.inicio = null;
            this.fim = null;
        }else{
            this.inicio = this.inicio.proximo;
            this.inicio.anterior = this.fim;
            this.fim.proximo = this.inicio;
        }
        this.tamanho--;
        
    }

    public void removeElemento(Item item){
        if(!(isEmpty())){
            No x = this.inicio;
            
            do{
                if(this.tamanho == 1){
                    this.inicio = null;
                    this.fim = null;
                    break;
                }else{
                    if(x.item.equals(item)){
                        
                        System.out.println("asas");
                        System.out.println(this.tamanho);
                        x.anterior.proximo = x.proximo;
                        x.proximo.anterior = x.anterior;
                        x = null;
                        break;
                         
                    }
                    x = x.proximo;
                }
                
            }while(x != this.fim && x != null);
            this.tamanho--;
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
        this.fim.proximo = this.inicio;
        this.inicio.anterior = this.fim;
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
        this.fim.proximo = this.inicio;
        this.inicio.anterior = this.fim;
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
        if(this.tamanho > 0){
            do{
                System.out.println(x.item);
                x = x.proximo;
            }while(x != this.fim);
        }else{
            System.out.println("Lista vazia!");
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