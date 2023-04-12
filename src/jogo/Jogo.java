package jogo;

public class Jogo {

  public static void main(String[] args) {
    Jogador jogador1 = new Jogador("Jogador 1", 'X');
    Jogador jogador2 = new Jogador("Jogador 2", 'O');
    FrikFrak jogo = new FrikFrak(jogador1, jogador2);
    
    System.out.println("Começando o jogo!");
    jogo.imprimirTabuleiro();
    

  }
}

