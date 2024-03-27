public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private float velocidade;

    public Carro(String marca, String modelo, int ano, float velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public void acelerar() {
        if (velocidade >= 0) {
            velocidade += 20;
        } else {
            System.out.println("Você não pode acelerar um carro com velocidade negativa");
            velocidade = 0;
        }
    }

    public void frear() {
        velocidade -= 10;
    }


    public String ligadoParado(){
        if(velocidade >= 0){
            return "andando";
        }else {
            return "parado";
        }
    }

    public String info() {
        return "Informações do carro \nMarca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano + " \nEstado atual do carro é " + ligadoParado() + " e sua velocidade é de " + velocidade + " km/h";
    }



    

}
