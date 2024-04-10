import java.util.List;

public class CadastroProduto {
    private List<Produto> produtos;

    public CadastroProduto(List<Produto> produtos) {
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

    private int CriaCodigo(){
        int res = 0;

        for (Produto p : produtos) {
            if(res <= p.getCodigo()){
                res = p.getCodigo();
            }
        }

        return ++res;
    }

    public Produto buscarProd(int codigo) {
        return produtos
                .stream()
                .filter(p -> p.getCodigo() == codigo)
                .findFirst()
                .orElse(null);
    }

    public void addProduto(Produto prod) {
        prod.setCodigo(CriaCodigo());
        if (buscarProd(prod.getCodigo()) == null && buscarProdNome(prod.getNome()) == null)
            produtos.add(prod);
            
    }

    public void removeProduto(int cod) {
            produtos.remove(buscarProd(cod));
    }

    public Produto buscarProdNome(String nome) {
        return produtos
                .stream()
                .filter(pn -> pn.getNome().equals(nome))
                .findFirst()
                .orElse(null);
    }
}
