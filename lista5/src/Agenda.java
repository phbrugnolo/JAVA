import java.util.List;

public class Agenda {

    private List<Contato> cont;

    public Agenda(List<Contato> cont) {
        this.cont = cont;
    }

    public List<Contato> getCont() {
        return cont;
    }

    public void setCont(List<Contato> cont) {
        this.cont = cont;
    }

    public void adicionar(Contato contato) {

        if (buscar(contato.getNome()) == null) cont.add(contato);
        
    }

    public void remover(String contato) {

        Contato cont = buscar(contato);

        if (cont != null) this.cont.remove(cont);
        
    }

    public Contato buscar(String contBuscado) {
        return cont
                .stream()
                .filter(c -> c.getNome().toLowerCase().trim().equals(contBuscado.toLowerCase()))
                .findFirst()
                .orElse(null);
    }

    @Override
    public String toString() {
        return "Agenda [Contato=" + cont + "]";
    }

}
