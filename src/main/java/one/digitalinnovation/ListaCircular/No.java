package one.digitalinnovation.ListaCircular;

public class No<T> {

    private T conteudo;
    private No<T> NoProximo;

    public No(T conteudo) {
        this.NoProximo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getNoProximo() {
        return NoProximo;
    }

    public void setNoProximo(No<T> noProximo) {
        NoProximo = noProximo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }
}
