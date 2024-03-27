public class Livro {
    public String livro, autor;
    public int ano;

    public Livro(String livro, String autor, int ano){
        this.livro = livro;
        this.autor = autor;
        this.ano = ano;
    }

    public String apresentar(){
        return "O titulo do livro é " + this.livro + " e o seu autor é " + this.autor + " e sua data de publicação é " + this.ano;
    }
}
