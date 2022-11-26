package one.digitalinnovation.ListaEncadeada;

public class ListaEncadeada<T> {

    No<T> referenciaEntrada;

    public ListaEncadeada(){
        this.referenciaEntrada = null;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.isEmpty()) {
            referenciaEntrada = novoNo;
            return;
        }

        No<T> NoAuxiliar = referenciaEntrada;
        for(int i = 0; i < this.size()-1; i++) {
            NoAuxiliar = NoAuxiliar.getProximoNo();
        }

        NoAuxiliar.setProximoNo(novoNo);
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index){
        validaIndice(index);

        No<T> NoAuxiliar = referenciaEntrada;
        No<T> NoRetorno = null;

        for(int i = 0; i <= index; i++) {
            NoRetorno = NoAuxiliar;
            NoAuxiliar = NoAuxiliar.getProximoNo();
        }
        return NoRetorno;
    }

    public T remove(int index){
        No<T> noReferencia = this.getNo(index);
        if(index == 0) {
            referenciaEntrada = noReferencia.getProximoNo();
            return noReferencia.getConteudo();
        }
        No<T> noAnterior = getNo(index-1);
        noAnterior.setProximoNo(noReferencia.getProximoNo());
        return noReferencia.getConteudo();
    }

    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;
        while(true) {
            if(referenciaAux != null) {
                tamanhoLista++;
                if(referenciaAux.getProximoNo() != null) {
                    referenciaAux = referenciaAux.getProximoNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }

        return tamanhoLista;
    }

    public void validaIndice(int index) {
        if(index >= size()) {
            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteudo no indice " + index + " desta lista. Esta lista so vai ate o indice " + ultimoIndice);
        }
    }

    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < this.size(); i++) {
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";

        return strRetorno;
    }
}
