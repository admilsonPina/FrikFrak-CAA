package jogo;

import java.util.Scanner;

public class FrikFrak {

		  private char[][] tabuleiro = new char[3][3];
		  private Jogador jogador1;
		  private Jogador jogador2;
		  

		  public FrikFrak(Jogador jogador1, Jogador jogador2) {
		    this.jogador1 = jogador1;
		    this.jogador2 = jogador2;
		   

		    //tabuleiro com espaços em branco
		    for (int i = 0; i < 3; i++) {
		      for (int j = 0; j < 3; j++) {
		        tabuleiro[i][j] = ' ';
		      }
		    }
		  }

		    	public void imprimirTabuleiro() {
		    	    System.out.println("    1   2   3 ");
		    	    System.out.println("  +---+---+---+");
		    	    for (int i = 0; i < 3; i++) {
		    	        System.out.print((i+1) + " ");
		    	        for (int j = 0; j < 3; j++) {
		    	            System.out.print("| " + tabuleiro[i][j] + " ");
		    	        }
		    	        System.out.println("|");
		    	        System.out.println("  +---+---+---+");
		    	    }
		    	}
		    
		}
		      