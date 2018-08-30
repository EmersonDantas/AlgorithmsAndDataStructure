public class ListaDupEncSent<Item>{
    private int tamanho;
    private No sentinela;

    public ListaDupEncSent(){
        this.sentinela = new No();
        this.sentinela.proximo = this.sentinela;
        this.sentinela.anterior = this.sentinela;
    }

    public boolean isEmpty(){
        return this.tamanho == 0;
    }

    public int size(){
        return this.tamanho;
    }

    public void adicionarNoInicio(Item item){
        No novoNo = new No(item);
        if(isEmpty()){
            novoNo.anterior = this.sentinela;
            novoNo.proximo = this.sentinela;
            this.sentinela.proximo = novoNo;
            this.sentinela.anterior = novoNo;
        }else{
            novoNo.proximo = sentinela.proximo;
            novoNo.anterior = this.sentinela;
            this.sentinela.proximo.anterior = novoNo;
            this.sentinela.proximo = novoNo;
        }
        this.tamanho++;
    }

    public void adicionarNoFim(Item item){
        No ultimo = sentinela.anterior;
        No x = new No(item);

        x.proximo = sentinela;
        x.anterior = ultimo;
        sentinela.anterior = x;
        ultimo.proximo = x;
        this.tamanho++;
    }

    public void removeElemento(Item item){
        No x = this.sentinela.proximo;
        for(;x != this.sentinela; x = x.proximo){
            if(x.item.equals(item)){
                x.anterior.proximo = x.proximo;
                x.proximo.anterior = x.anterior;
                x = null;
                this.tamanho--;
                break;
            }
        }
    }

    public void printaLista(){
        No x = this.sentinela.proximo;
        for(;x != this.sentinela;x = x.proximo){
            System.out.println(x.item);
        }
    }

    private class No{
        private Item item;
        private No proximo;
        private No anterior;

        public No(){
            this.item = null;
            this.proximo = null;
            this.anterior = null;
        }

        public No(Item item){
            this();
            this.item = item;
        }
    }
}