package one.digitalinnovation.ListaDuplamenteEncadeada;

import one.digitalinnovation.ListaEncadeada.No;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();

    }

    public void add(T elemento) {
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(null); // esse No sera o ultimo No da lista
        novoNo.setNoPrevio(ultimoNo); // o antigo ultimoNo sera o previo a esse No
        if(primeiroNo == null) {
            primeiroNo = novoNo;
        }
        if (ultimoNo != null) {
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index , T elemento) {
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(noAuxiliar); // o proximo no ao novo no e o noAuxiliar

        if(novoNo.getNoProximo() != null) { // se houver um no apos o noduplo
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio()); // o no previo do proximo no sera o previo do auxiliar
            novoNo.getNoProximo().setNoPrevio(novoNo); // o proximo sera o previo do novoNo
        } else {
            novoNo.setNoPrevio(ultimoNo);
            ultimoNo = novoNo;
        }

        if(index == 0) { // se o index do novoNo for zero, ele sera o primeiro no
            primeiroNo = novoNo;
        } else {
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }

        tamanhoLista++;
    }

    public void remove(int index) {
        if(index == 0){
            primeiroNo = primeiroNo.getNoProximo();
            if(primeiroNo != null) {
                primeiroNo.setNoPrevio(null);
            }
        } else {
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
            if(noAuxiliar != ultimoNo) {
                noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
            } else {
                ultimoNo = noAuxiliar;
            }
        }
        this.tamanhoLista--;
    }

    private NoDuplo<T> getNo(int index) {
        NoDuplo<T> noAuxiliar = primeiroNo;

        for(int i = 0; (i< index) && (noAuxiliar !=null) ; i++) {
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public int size() {
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        NoDuplo<T> noAuxiliar = primeiroNo;

        for(int i = 0; i < this.size(); i++) {
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo()+ "}]--->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
