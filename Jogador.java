public class Jogador extends Jokenpo{

    private String nome;
    private int idade;
    
    public Jogador(int pedra, int papel, int tesoura, String n, int i){
        super(pedra,papel,tesoura);
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
    
    public void exibeDados(){
        System.out.println("***** Dados do Jogador *****");
        super.exibeDados();
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Quantidade de Cartas: "+getQtdCartas());
    }
}