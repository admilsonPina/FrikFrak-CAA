package jogo;

public class Jogador {
	private String nome;
	  private char simbolo;
	  private int numJogadasIniciais;

	  public Jogador(String nome, char simbolo) {
	    this.nome = nome;
	    this.simbolo = simbolo;
	  }

	  public String getNome() {
	    return nome;
	  }

	  public char getSimbolo() {
	    return simbolo;
	  }

	public int getNumJogadasIniciais() {
		  return numJogadasIniciais;
		}
	private boolean coordenadasValidas(char[][] tabuleiro, int linha, int coluna) {
		  int tamanho = tabuleiro.length;

		  return linha >= 0 && linha < tamanho && coluna >= 0 && coluna < tamanho;
		}


	public boolean moverPeca(char[][] tabuleiro, int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino) {
		  // Verifica se as coordenadas são válidas e se a peça de origem pertence ao jogador
		  if (!coordenadasValidas(tabuleiro, linhaOrigem, colunaOrigem) || tabuleiro[linhaOrigem][colunaOrigem] != simbolo) {
		    return false;
		  }

		  // Verifica se o destino está vazio ou é o centro do tabuleiro
		  if (!coordenadasValidas(tabuleiro, linhaDestino, colunaDestino) || (linhaDestino == 1 && colunaDestino == 1) || tabuleiro[linhaDestino][colunaDestino] != ' ') {
		    return false;
		  }

		  // Verifica se o movimento é válido
		  if (!movimentoValido(linhaOrigem, colunaOrigem, linhaDestino, colunaDestino)) {
		    return false;
		  }

		  // Move a peça para o destino
		  tabuleiro[linhaDestino][colunaDestino] = simbolo;
		  tabuleiro[linhaOrigem][colunaOrigem] = ' ';

		  return true;
		}

		private boolean movimentoValido(int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino) {
		  int diffLinha = Math.abs(linhaDestino - linhaOrigem);
		  int diffColuna = Math.abs(colunaDestino - colunaOrigem);

		  // Movimento válido se for para a esquerda, direita, cima, baixo ou centro
		  return (diffLinha <= 1 && diffColuna == 0) || (diffLinha == 0 && diffColuna <= 1);
		}

	
	}
