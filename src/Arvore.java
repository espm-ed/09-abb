import org.w3c.dom.Node;

public class Arvore<T extends Comparable<T>> {
    private No<T> raiz;

    public void inserir(T dado) {
        raiz = inserir(raiz, dado);
    }

    private No<T> inserir(No<T> ref, T dado) {
        if(ref == null) {
            return new No<>(dado);
        }
        if(dado.compareTo(ref.getDado()) > 0) {
            ref.setDireita(inserir(ref.getDireita(), dado));
        }
        else if(dado.compareTo(ref.getDado()) < 0) {
            ref.setEsquerda(inserir(ref.getEsquerda(), dado));
        }
        return ref;
    }

    public void preOrdem() {
        preOrdem(raiz);
    }

    private void preOrdem(No<T> ref) {
        if(ref == null) {
            return;
        }

        System.out.print(ref.getDado() + "  ");
        preOrdem(ref.getEsquerda());
        preOrdem(ref.getDireita());
    }

    public void emOrdem() {
        emOrdem(raiz);
    }

    private void emOrdem(No<T> ref) {
        if(ref == null) {
            return;
        }
        emOrdem(ref.getEsquerda());
        System.out.print(ref.getDado() + "  ");        
        emOrdem(ref.getDireita());
    }

    public void posOrdem() {
        posOrdem(raiz);
    }

    private void posOrdem(No<T> ref) {
        if(ref == null) {
            return;
        }
        posOrdem(ref.getEsquerda());               
        posOrdem(ref.getDireita());
        System.out.print(ref.getDado() + "  "); 
    }   
}


