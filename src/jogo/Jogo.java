package jogo;

import jogo.FrikFrak ;
import jogo.Jogador ;

public class Jogo {

  public static void main(String[] args) {
		    Jogador jogador1 = new Jogador("Jogador 1", 'X');
		    Jogador jogador2 = new Jogador("Jogador 2", 'O');
		    FrikFrak jogo = new FrikFrak(jogador1, jogador2);
		    
		    System.out.println("Comecando o jogo!");
		    jogo.imprimirTabuleiro();
		    

		    while (!jogo.isJogoAcabou()) {
		      jogo.jogar();
		      jogo.imprimirTabuleiro();

		      if (jogo.verificarVitoria(jogador1)) {
		        System.out.println("O jogador 1 venceu!");
		        jogo.setJogoAcabou(true);
		      } else if (jogo.verificarVitoria(jogador2)) {
		        System.out.println("O jogador 2 venceu!");
		        jogo.setJogoAcabou(true);
		      } else {
		        // Troca o jogador atual
		        if (jogo.getJogadorAtual() == jogador1) {
		          jogo.setJogadorAtual(jogador2);
		        } else {
		          jogo.setJogadorAtual(jogador1);
		        }
		      }
		    }
		  }
		}



