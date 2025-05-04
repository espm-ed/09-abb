public class App {
    public static void main(String[] args) throws Exception {
        
        Arvore<Integer> arvore = new Arvore<>();
        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(25);
        arvore.inserir(18);

        System.out.println("impressão na pré-ordem");
        arvore.preOrdem();
        System.out.println("\nimpressão em-ordem");
        arvore.emOrdem();
        System.out.println("\nimpressão na pós-ordem");
        arvore.posOrdem();

        //System.out.println("\n" + arvore.pesquisar(47));

        arvore.remover(18);
        arvore.remover(10);
        arvore.remover(25);
        arvore.remover(5);
        System.out.println("\nimpressão na pós-ordem");
        arvore.preOrdem();

    }
}
