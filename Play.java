import java.util.Random;

public class Play{

    //metodo para jogar
    public void jogar(){
        String jokerPedra = "Pedra";
        String jokerPapel = "Papel";
        String jokerTesoura = "Tesoura";                

        int jogar = Teclado.leInt("Você quer iniciar a partida? (1- Sim 0- Não)");

        if(jogar == 1){
            //Boas vindas e instruções
            System.out.println("!!! Bem-vindo ao Jokenpô !!!");
            System.out.println("Como jogar:");
            System.out.println("Pedra = 1, Papel = 2, Tesoura = 3");
            System.out.println("Regra:");
            System.out.println("Partidas serão melhor de 3.");

            //criando objetos
            Jogador j = new Jogador(1,2,3,Teclado.leString("Digite seu nome: "),Teclado.leInt("Digite sua idade: "));
            Random aleatorio = new Random();
            Jokenpo jokenpo = new Jokenpo(1,2,3);
            Computador c = new Computador(1,2,3,"Joker",999);
            System.out.println(j.getNome() + " VS "+c.getNome()); 

            int pontosPlayer = 0;
            int pontosComputer = 0;

            for(int round = 0; round < 3; round ++){  
                //atributos

                int numPlayer = Teclado.leInt("Qual joken você escolhe? ");
                int numComputer = aleatorio.nextInt(3) + 1;

                //sistema de vitorias
                if(numPlayer == 1 && numComputer == 2){
                    System.out.println("");
                    System.out.println(j.getNome()+" escolheu Pedra");
                    System.out.println(c.getNome()+" escolheu "+jokerPapel);
                    System.out.println(c.getNome()+" Venceu!");
                    pontosComputer++;
                }
                else if(numPlayer == 1 && numComputer == 3){
                    System.out.println("");
                    System.out.println(j.getNome()+" escolheu Pedra");
                    System.out.println(c.getNome()+" escolheu "+jokerTesoura);
                    System.out.println(j.getNome()+" Venceu!");
                    pontosPlayer++;
                }
                else if(numPlayer == 2 && numComputer == 1){
                    System.out.println("");
                    System.out.println(j.getNome()+" escolheu Papel");
                    System.out.println(c.getNome()+" escolheu "+jokerPedra);
                    System.out.println(j.getNome()+" Venceu!");
                    pontosPlayer++;
                }
                else if(numPlayer == 2 && numComputer == 3){
                    System.out.println("");
                    System.out.println(j.getNome()+" escolheu Papel");
                    System.out.println(c.getNome()+" escolheu "+jokerTesoura);
                    System.out.println(c.getNome()+" Venceu!");
                    pontosComputer++;
                }
                else if(numPlayer == 3 && numComputer == 1){
                    System.out.println("");
                    System.out.println(j.getNome()+" escolheu Tesoura");
                    System.out.println(c.getNome()+" escolheu "+jokerPedra);
                    System.out.println(c.getNome()+" Venceu!");
                    pontosComputer++;
                }
                else if(numPlayer == 3 && numComputer == 2){
                    System.out.println("");
                    System.out.println(j.getNome()+" escolheu Tesoura");
                    System.out.println(c.getNome()+" escolheu "+jokerPapel);
                    System.out.println(j.getNome()+" Venceu!");
                    pontosPlayer++;
                }
                else if(numPlayer == 1 && numComputer == 1){
                    System.out.println("");
                    System.out.println(j.getNome()+" escolheu Pedra");
                    System.out.println(c.getNome()+" escolheu "+jokerPedra);
                    System.out.println("Empate");
                }
                else if(numPlayer == 2 && numComputer == 2){
                    System.out.println("");
                    System.out.println(j.getNome()+" escolheu Papel");
                    System.out.println(c.getNome()+" escolheu "+jokerPapel);
                    System.out.println("Empate");
                }
                else if(numPlayer == 3 && numComputer == 3){
                    System.out.println("");
                    System.out.println(j.getNome()+" escolheu Tesoura");
                    System.out.println(c.getNome()+" escolheu "+jokerTesoura);
                    System.out.println("Empate");
                }

            }
            System.out.println(j.getNome()+" "+pontosPlayer+" pontos VS "+c.getNome()+" "+pontosComputer+" pontos");
            if(pontosPlayer<pontosComputer)
                System.out.println(c.getNome()+" é o Vencedor! Mais sorte na próxima vez.");
            else if(pontosPlayer>pontosComputer)
                System.out.println(j.getNome()+" é o Vencedor! Parabéns.");
            else
                System.out.println("EMPATE");
        }else
            System.out.println("Partida encerrada.");
    }

    public static void main (String [] args){       
        Play p = new Play();

        p.jogar();
        //Jokenpo joke = new Jogador(1,2,3,Teclado.leString("Digite o seu nome: "),Teclado.leInt("Digite a sua idade:"));
        //((Jokenpo)joke).exibeDados();
    }
}
