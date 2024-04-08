import java.util.List;

public class CadastroProduto {
    private List<Produto> produtos;
    // private Produto prod;

    public CadastroProduto(List<Produto> produtos, String nome) {

        this.produtos = produtos;

    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "CadastroProduto [produtos=" + produtos + "]";
    }

    public Produto buscarProd(int codigoBuscado) {
        return produtos
                .stream()
                .filter(p -> p.getCodigo() == codigoBuscado)
                .findFirst()
                .orElse(null);
    }

    public void addProduto(Produto prod) {
        if (buscarProd(prod.getCodigo()) == null)
            produtos.add(prod);
    }

    public void removeProduto(Produto prod) {
        if (buscarProd(prod.getCodigo()) != null)
            produtos.remove(prod);
    }

    public Produto buscarProdNome(String nomeProduto) {
        return produtos
                .stream()
                .filter(pn -> pn.getNome().equals(nomeProduto))
                .findFirst()
                .orElse(null);
    }
}
