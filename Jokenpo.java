public class Jokenpo{
    //atributos
    private int pedra = 1;
    private int papel = 2;
    private int tesoura = 3;
    private int qtdCartas = 3;
    
    //construtor
    public Jokenpo(int pedra, int papel, int tesoura){
    
        this.pedra = pedra;
        this.papel = papel;
        this.tesoura = tesoura;
    
    }
    
    //gets
    public int getPedra(){
        return pedra;
    }
    public int getPapel(){
        return papel;
    }
    public int getTesoura(){
        return tesoura;
    }
    public int getQtdCartas(){
        return tesoura;
    }
    
    //sets    
    public void setPedra(int p){
        pedra = p;
    }
    public void setPapel(int p2){
        papel = p2;
    }
    public void setTesoura(int t){
        tesoura = t;
    }    
    
    public void exibeDados(){
        System.out.println("Pedra = 1 / Papel = 2 / Tesoura = 3");
    }
    

}