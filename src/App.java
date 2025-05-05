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

        // teste --> pesquisar
        System.out.println(arvore.pesquisar(180));

    }
}
