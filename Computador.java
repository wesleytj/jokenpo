public class Computador extends Jokenpo{

    private String nome = "Joke";
    private int idade = 999;
    
    public Computador(int p, int p2, int t, String n, int i){
        super(p,p2,t);
        nome = n;
        idade = i;
    }
    
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    
    public void setNome(String n){
        nome = n;
    }
    public void setIdade(int i){
        idade = i;
    }
}