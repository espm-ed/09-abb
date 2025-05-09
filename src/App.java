public class App {
    public static void main(String[] args) throws Exception {
        
        Arvore<Integer> arvore = new Arvore<>();
        arvore.inserir(53);
        arvore.inserir(27);
        arvore.inserir(12);
        arvore.inserir(47);
        arvore.inserir(79);
        arvore.inserir(83);
        arvore.inserir(62);
        arvore.inserir(55);
        arvore.inserir(75);

        System.out.println("impressão na pré-ordem");
        arvore.preOrdem();
        System.out.println("\nimpressão em-ordem");
        arvore.emOrdem();
        System.out.println("\nimpressão na pós-ordem");
        arvore.posOrdem();

        // teste --> pesquisar
        //System.out.println(arvore.pesquisar(180));
        System.out.println();
        arvore.remover(47);
        arvore.preOrdem();

        System.out.println();
        arvore.remover(27);
        arvore.preOrdem();

        System.out.println();
        arvore.remover(53);
        arvore.preOrdem();
    }
}
