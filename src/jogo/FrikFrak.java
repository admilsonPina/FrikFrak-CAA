package jogo;

import java.util.Scanner;

import jogo.Jogador;

public class FrikFrak {

	private char[][] tabuleiro = new char[3][3];
	  private Jogador jogador1;
	  private Jogador jogador2;
	  private Jogador jogadorAtual;
	  private boolean jogoAcabou = false;

	  public FrikFrak(Jogador jogador1, Jogador jogador2) {
	    this.jogador1 = jogador1;
	    this.jogador2 = jogador2;
	    this.jogadorAtual = jogador1;

	    // Inicializa o tabuleiro com espaços em branco
	    for (int i = 0; i < 3; i++) {
	      for (int j = 0; j < 3; j++) {
	        tabuleiro[i][j] = ' ';
	      }
	    }
	  }

	  void jogar() {
		    int linha, coluna;
		    boolean jogadaValida = false;

		    Scanner scanner = new Scanner(System.in); 

		    while (!jogadaValida) {
		        System.out.println(jogadorAtual.getNome() + ", faca a sua jogada (linha):");
		        linha = scanner.nextInt();
		        System.out.println("coluna:");
		        coluna = scanner.nextInt();

		        if (jogadorAtual.getNumJogadasIniciais() < 3) {
		            // Jogada inicial
		            jogadaValida = jogadaValida(linha, coluna);

		            if (jogadaValida) {
		                tabuleiro[linha][coluna] = jogadorAtual.getSimbolo();
		                jogadorAtual.getNumJogadasIniciais();
		            }
		        } else {
		            // Movimento de peça
		            System.out.println(jogadorAtual.getNome() + ", mova uma de suas pecas (linhaOrigem,colunaOrigem,linhaDestino,colunaDestino):");
		            int linhaOrigem = scanner.nextInt();
		            int colunaOrigem = scanner.nextInt();
		            int linhaDestino = scanner.nextInt();
		            int colunaDestino = scanner.nextInt();

		            if (jogadorAtual.moverPeca(tabuleiro, linhaOrigem, colunaOrigem, linhaDestino, colunaDestino)) {
		                jogadaValida = true;
		            } else {
		                System.out.println("Movimento inválido, tente novamente.");
		            }
		        }
		    }
		}


	    	private boolean jogadaValida(int linha, int coluna) {
	    		  if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
	    		    System.out.println("Jogada inválida, tente novamente.");
	    		    return false;
	    		  } else if (tabuleiro[linha][coluna] != ' ') {
	    		    System.out.println("Esse espaço já foi preenchido, tente novamente.");
	    		    return false;
	    		  } else if (jogadorAtual.getNumJogadasIniciais() < 3 || tabuleiro[linha][coluna] == jogadorAtual.getSimbolo()) {
	    		    // O jogador ainda não fez suas três jogadas iniciais ou está movendo uma de suas peças
	    		    return true;
	    		  } else {
	    		    // O jogador já fez suas três jogadas iniciais e está tentando jogar com uma peça do outro jogador
	    		    System.out.println("Você já fez suas três jogadas iniciais. Agora só pode mover suas peças.");
	    		    return false;
	    		  }
	    		}

	    	boolean verificarVitoria(Jogador jogador) {
	    	char simbolo = jogador.getSimbolo();
	    	// Verifica linhas
	    	for (int i = 0; i < 3; i++) {
	    	if (tabuleiro[i][0] == simbolo && tabuleiro[i][1] == simbolo && tabuleiro[i][2] == simbolo) {
	    	return true;
	    	}
	    	}
	    	// Verifica colunas
	    	for (int j = 0; j < 3; j++) {
	    	if (tabuleiro[0][j] == simbolo && tabuleiro[1][j] == simbolo && tabuleiro[2][j] == simbolo) {
	    	return true;
	    	}
	    	}
	    	// Verifica diagonal principal
	    	if (tabuleiro[0][0] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][2] == simbolo) {
	    	return true;
	    	}
	    	// Verifica diagonal secundária
	    	if (tabuleiro[0][2] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][0] == simbolo) {
	    	return true;
	    	}
	    	// Nenhuma linha, coluna ou diagonal completa
	    	return false;
	    	}

	    	private int leInteiro() {
	    	Scanner scanner = new Scanner(System.in);
	    	while (!scanner.hasNextInt()) {
	    	scanner.next();
	    	}
	    	return scanner.nextInt();
	    	}

	    	public void imprimirTabuleiro() {
	    	    System.out.println("    0   1   2 ");
	    	    System.out.println("  +---+---+---+");
	    	    for (int i = 0; i < 3; i++) {
	    	        System.out.print((i) + " ");
	    	        for (int j = 0; j < 3; j++) {
	    	            System.out.print("| " + tabuleiro[i][j] + " ");
	    	        }
	    	        System.out.println("|");
	    	        System.out.println("  +---+---+---+");
	    	    }
	    	}

			public boolean isJogoAcabou() {
				return false;
			}

			public void setJogoAcabou(boolean b) {
				
				
			}

			public Jogador getJogadorAtual() {
				
				return null;
			}

			public void setJogadorAtual(Jogador jogador22) {
			
				
			}

	    	
	    
	}
