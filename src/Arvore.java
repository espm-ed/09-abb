
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

    public boolean pesquisar(T dado) {
        return pesquisar(raiz, dado) == null ? false : true;
    }

    private T pesquisar(No<T> ref, T dado) {
        if(ref == null) {
            return null;
        }

        int cmp = dado.compareTo(ref.getDado());
        if(cmp == 0) {
            return ref.getDado();
        }
        else if(cmp < 0) {
            return pesquisar(ref.getEsquerda(), dado);
        }
        else {
            return pesquisar(ref.getDireita(), dado);
        }
    }

    public void remover(T dado) {
        remover(raiz, dado);
    }

    private No<T> remover(No<T> ref, T dado) {
        int cmp = dado.compareTo(ref.getDado());
        if(cmp < 0) {
            ref.setEsquerda(remover(ref.getEsquerda(), dado));
        }
        else if(cmp > 0) {
            ref.setDireita(remover(ref.getDireita(), dado));
        }
        else {
            // aqui acontece a remoção do elemento
            // caso 1 --> o nó é uma folha
            if(ref.getDireita() == null && ref.getEsquerda() == null) {
                return null;
            }
            // caso 2 --> o nó tem um filho na direita
            if(ref.getEsquerda() == null) {
                return ref.getDireita();
            }
            // caso 2 --> o nó tem um filho na esquerda
            if(ref.getDireita() == null) {
                return ref.getEsquerda();
            }
            else {
                No<T> menor = localizarMenor(ref.getDireita());
                ref.setDado(menor.getDado());
                ref.setDireita(remover(ref.getDireita(), menor.getDado()));
            }
        }
        return ref;

    }

    public No<T> localizarMenor(No<T> ref) {
        while(ref.getEsquerda() != null) {
            ref = ref.getEsquerda();
        }
        return ref;
    }

}


