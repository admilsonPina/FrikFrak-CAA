# FrikFrak-CAA
FrikFrak em java

### Status
* Aplicação **Fechado**
* Relatório **Em desenvolvimento** 

### Informação 
- Aplicação principal no branch main
- Modo consola(incompleto) no branch master

### SOBRE O JOGO
-------------------------------------------------------------------------------------------------

Frik Frak

E um popular jogo de tabuleiro na Africa e em outros lugares. Em que cada jogador tem tres 
pecas e o objectivo e ser o primeiro de modo a formar uma linha (vertical, horizontal ou diagonal),
ao mesmo tempo impedir que o oponente de fazer o mesmo.

Para iniciar e reiniciar o jogo só apertar o botão "Jogar" ;

A cada vitoria o jogo ira anotar a vitoria do jogador e mostra o resultado no placar do jogo.

--------------------------------------------------------------------------------------------------
## Como Jogar 

REGRA

- O jogo inicia(reinicia) quando o clicar no botão __jogar__ ;
- O jogo possui __2__ **jogador** modo __Humano__ x __Humano__;
- Possui um __tabuleiro__ matriz 3x3 ou seja __9__ posições (Ilustração abaixo); 
- Cada jogador tem direito a __3__ **peças** ;
- Ao Iniciar o jogo da-se a opcão de escolha de jogador que ira iniciar __X__ ou **O**;
- O jogador que inicia o jogo é o que venceu a disputa entre os 2 ;
- O jogador X ou O inicia a partida faz a sua jogada e o jogador O ou X faz a sua jogada a seguir;
- Alternam para criar jogadas para vencer ao mesmo tempo impedir o oponente de fazer o mesmo;
- O __objectivo__ é ser o primeiro de modo a __formar__ uma **linha (vertical, horizontal ou diagonal)**,
- Cada jogador possui 3 jogadas inicias, preenchendo os espaços em branco ;
- Depois de fazer as 3 jogadas iniciais colocando as respetivas peças, segue-se a regra :

Como a figura ilustra temos uma matriz 3x3 depois das 3  jogadas  inicias ocupando as posições

                                    "--------------"
                                    |_1__|_2__|_3__|
                                    |_4__|_5__|_6__|
                                    |_7__|_8__|_9__|

1. Se estas na posição 1, so podes deslocar pra posição 2 , 4 e 5 caso estejam vazias se não jogada é invalida;
2. Se estas na posição 2, so podes deslocar pra posição 1 , 3 e 5 caso estejam vazias se não jogada é invalida;
3. Se estas na posição 3, so podes deslocar pra posição 2 , 6 e 5 caso estejam vazias se não jogada é invalida;
4. Se estas na posição 4, so podes deslocar pra posição 1 , 7 e 5 caso estejam vazias se não jogada é invalida;
5. Se estas na posição 5 podes jogar em qualquer posição caso estejam vazias se não jogada é invalida;
6. Se estas na posição 6, so podes deslocar pra posição 3 , 9 e 5 caso estejam vazias se não jogada é invalida;
7. Se estas na posição 4, so podes deslocar pra posição 4 , 8 e 5 caso estejam vazias se não jogada é invalida;
8. Se estas na posição 8, so podes deslocar pra posição 7 , 9 e 5 caso estejam vazias se não jogada é invalida;
9. Se estas na posição 9, so podes deslocar pra posição 6 , 8 e 5 caso estejam vazias se não jogada é invalida;

--------------------------------------------------------------------------------------------------
## Algoritmo Implementado

### Linguagens e blibliotecas

A implementação do jogo é 100% em **Java**. Usando a bliblioteca *Swing* e sua classe  "AbsoluteLayout" para ter
posicionamento absoluto dos componentes.

### Desenvolvimento 

Para desenvolver o jogo criei somente uma *classe* **FrikFra**, que tinha que ter em conta em principal esses elementos : **tabuleiro**, **peças** (2) , **regra para ganhar** e **regras para as jogadas** e também uma **interface** amigável ;

#### Etapas

##### Interface
- Para interface do  jogo foi criada a *classe* **FrikFrak** com uma **extends** com **javax.swing.JFrame**;
- Criou - se os componentes ;
- Foi adicionado os componentes; 
- Interface final foi desenhada conforme o FrikFrak.demo (img) ;

##### Tabuleiro
- Para o tabuleiro adicionei 9 botões (bt01 á bt09)  posicionando na forma matrizada 3x3 ;
- Para o fazer basei-me na imagem esqueleto.png que serve de referencial para o jogo da velha identico ao frikfrak ;

##### Peças 
- Serão necessárias 2 peças **X e O** ;
- As peças que irão ficar dentro dos botões ;

##### Regras para ganhar
- As regras pra ganhar o jogo ficarão todas dentro do metodo ganhou() que recebe as condições para ganhar ;

##### Regras para as jogadas 
- Como os botões é que receben as peças então será nelas que irão se situar as condições para receberem uma jogada ;
- Exemplo quando o botão 1 (bt01) é clicada executa o metodo **bt01ActionPerformed** que irá rebeceber a condições para peencher ou mover as peças ;
- O metodo **bt01MouseReleased** nele verifica se jogo não acabou e verifica se jogada feita é de vitória do jogador ;

##### Classe FrikFrak.java
....







