public class Batalha {
    
    private int totalBatalhas;

    


    public Batalha(int totalBatalhas) {
        this.totalBatalhas = totalBatalhas;
    }




    public void batalhar(Personagem p1, Personagem p2) {
  
    
        if(p1.getNivel() < p2.getNivel()){
            p2.atualizaPont();
            p2.subirNivel();
            p2.atualizaBatalha();
            p1.atualizaBatalha();
        }else if(p1.getNivel() == p2.getNivel()){
            p2.atualizaPont();
            p2.subirNivel();
            p2.atualizaBatalha();
            p1.atualizaBatalha();
        }else {
            p1.atualizaPont();
            p1.subirNivel();
            p2.atualizaBatalha();
            p1.atualizaBatalha();
        }
    }




    public int getTotalBatalhas() {
        return totalBatalhas;
    }




    public void setTotalBatalhas(int totalBatalhas) {
        this.totalBatalhas = totalBatalhas;
    }

}
