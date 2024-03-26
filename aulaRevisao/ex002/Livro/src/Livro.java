import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Livro {

    private String titulo;
    private String autor;
    private LocalDate anoPublicacao;

    public Livro(String titulo, String autor, LocalDate anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(LocalDate anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    
    public int calculoAno(){

        Period data = Period.between(anoPublicacao, LocalDate.now());
        return data.getYears();

        // LocalDate dataAtual = LocalDate.now();

        // if(dataAtual.getDayOfMonth() < anoPublicacao.getDayOfMonth() && dataAtual.getMonthValue() < anoPublicacao.getMonthValue()){
        //     return dataAtual.getYear() - anoPublicacao.getYear();
        // }else{
        //     return (dataAtual.getYear() - anoPublicacao.getYear()) - 1;
        // }
    }

    public String exibirInfos() {
        return "Titulo: " + titulo + "\nAutor: " + autor + "\nFoi lançado há: " + calculoAno() + " anos";
    }

    
}
