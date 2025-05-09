public class App2 {
    public static void main(String[] args) {
        
        Arvore<Produto> arvore = new Arvore<>();
        arvore.inserir(new Produto(10, "maçã"));
        arvore.inserir(new Produto(1, "pimenta"));
        arvore.inserir(new Produto(20, "ervas"));
        arvore.inserir(new Produto(12, "arroz"));

        arvore.preOrdem();

    }
}
