public class Produto implements Comparable<Produto>  {
    private int id;
    private String nome;

    public Produto(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Produto p) {
        /*if(id == p.getId()) {
            return 0;
        }
        else if(id < p.getId()) {
            return -1;
        }
        else {
            return 1;
        }*/

        return id - p.getId();

    }
    
    @Override
    public String toString() {
        return id + " " + nome;
    }


    
    

}
