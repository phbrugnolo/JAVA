public class Calculadora {


    private float numero1;
    private float numero2;

    

    
    public Calculadora(float numero1, float numero2) {
        
        if(numero1 < 0 && numero2 < 0 && numero1 > 50 && numero2 > 50){
            System.err.println("Os numeros não podem serem maiores que 50 e menores que 0");
        }else {
            this.numero1 = numero1;
            this.numero2 = numero2;
        }
        
        
    }
    
    public float getNumero1() {
        return numero1;
    }
    

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    
    
    
    public float getNumero2() {
        return numero2;
    }
    
    
    
    
    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    
    public float adicao(){
        return numero1 + numero2;
    }
    public float subtracao(){
        return numero1 - numero2;
    }
    public float multiplicacao(){
        return numero1 * numero2;
    }
    public float divisao(){
        return numero1 / numero2;
    }

    public float potenciacao(){
        float pot = numero1;
        for(float controle = numero1; numero2 > 1; numero2--){
            pot *= controle;
        }
        return pot;
    }

    public int fatoracao(){
        int pot = (int)numero1;
        for(int controle = (int)(numero1 -1); controle > 1; controle-- ){
            pot *= controle;
        }
        return pot;
    }


    
}
