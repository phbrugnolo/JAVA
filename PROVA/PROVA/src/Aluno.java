public class Aluno {

    private String nome;
    private int idade;
    private float nota1, nota2, media;
    
    public Aluno(String nome, int idade, float nota1, float nota2) {
        this.nome = nome;
        this.idade = idade;

        if(nota1 > 0){
            this.nota1 = nota1;
        }else {
            this.nota1 = 0;
        }
        if(nota2 > 0){
            this.nota2 = nota2;
        }else {
            this.nota2 = 0;
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }
    
    public float getNota2() {
        return nota2;
    }
    
    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }
    
    public float getMedia() {
        return media;
    }

    public String setMedia(float m) {
        if (m == media) {
            this.media = m;
            return "As medias são iguais";
        } else {
            this.media = m;
            return "A media e diferente da solicitada, use o metodo de calculaMedia() para calcular";
        }
    }




    public float calculaMedia(){
        return media = (nota1 + nota2) /2;
    }

    public String status(){
        if(media >= 7){
            return "aprovado";
        }else if(media >= 2){
            return "final";
        }else {
            return "reprovado";
        }
    }

    public String exibirAluno(Disciplina d) {
        return "\nNome: " + nome + "\nIdade: " + idade + "\nEle está matriculado na máteria de " + d.getMateria() + " do professor " + d.getNome() + "\nMedia: " + calculaMedia() + " e sua situação atual é " + status();
    }

    public void setNotas1(float n1){
        if(nota1 < n1){
            setNota1(n1);
        }
    }
    
    public void setNotas2(float n2){
        if(nota2 < n2){
            setNota2(n2);
        }
    }





    
}
