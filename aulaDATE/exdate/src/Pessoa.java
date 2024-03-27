import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    private String nome, sobrenome, email;
    private LocalDate dataNasc;
    private DateTimeFormatter frm = DateTimeFormatter.ofPattern("ddMMyyyy");

    public Pessoa(String nome, String sobrenome, String email, String dtNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        adicionarEmail(email);
        dataNasc = LocalDate.parse(validaData(dtNasc), frm);
    }

    private String validaData(String data){
        String[] padrao = {"\\\\", "/", "\\*", "\\.", "\\-"};
        for (String s : padrao) {
            data = data.replaceAll(s, "");
        }
        return data;
    }

    private int getIdade(){
        /*LocalDate dataAtual = LocalDate.now();
        int idade = dataAtual.getYear() - dataNasc.getYear();

        if (dataAtual.getMonthValue() < dataNasc.getMonthValue() || (dataAtual.getMonthValue() == dataNasc.getMonthValue() && dataAtual.getDayOfMonth() < dataNasc.getDayOfMonth())) {
            idade--;
        }
       // return idade;*/
       
       Period periodo = Period.between(dataNasc, LocalDate.now());
       return periodo.getYears();
    }

    public boolean maior(){
        return getIdade() >= 18;
    }

    private boolean validaEmail(String email){
        return email.contains("@") && email.contains(".") && email.indexOf("@") < email.lastIndexOf(".");
    }

    public void adicionarEmail(String email){
        if(validaEmail(email)) this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", sobrenome=" + sobrenome + ", email=" + email + ", dataNasc=" + dataNasc
                + "]";
    }


    
}
