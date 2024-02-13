# FrikFrak-CAA
FrikFrak em java

### Status
* **Fechado**

### Informação 
- Aplicação principal no branch main

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

### Classe FrikFrak.java

#### Métodos

* vez() 
É responsável por mudar os jogadores do jogo "Frikfrak". Sempre que o jogador executa a ação ele é chamado e atualiza a mensagem exibida na interface do usuário para indicar o jogador que deve fazer a jogada.

O método funciona da seguinte maneira: ele verifica se a variável "cont" é par ou ímpar. Se for par, significa que é a vez do jogador X, e o método atualiza a mensagem exibida na tela para indicar isso. Caso contrário, a variável "cont" é ímpar, o que significa que é a vez do jogador O, e o método atualiza a mensagem para indicar isso.

* podeColocarPeca()
O método verifica se o número de jogadas realizadas até o momento (armazenado na variável "jogada") é menor do que 6. Se for o caso, o método retorna verdadeiro, indicando que ainda é possível colocar mais peças no tabuleiro do jogo. Caso contrário, o método retorna falso, indicando que não é possível colocar mais peças.

* moverPecaBt()
O método recebe um parâmetro booleano chamado "isVazio", que indica se a posição onde a peça atualmente se encontra está vazia.

Se a posição estiver vazia, o código verifica se o número de jogadas já realizadas (variável "jogada") é maior do que 4 (ou seja a ultima jogada para cada peça "jogada 5 X ou O e jogada 6 para O ou X"). Se for, então algumas outras posições no tabuleiro são habilitadas ou desabilitadas, dependendo se a peça pode se mover para elas ou não.
Para cada botão possui um método moverPecaBt(01 á 09), é ativado quando os botões realizam ações ;

* checarBloqueioBotoes()
O método recebe um parâmetro booleano chamado "aberto", que indica se os botões devem estar habilitados ou desabilitados.
O método percorre todos os botões do jogo (bt01 a bt09) e seta o estado de habilitação de cada um para o valor do parâmetro "aberto". Se o valor de "aberto" for verdadeiro, todos os botões serão habilitados. Se for falso, todos os botões serão desabilitados.

Esse método criei para que quando a jogadas forem feitas ela será ativada retornando true desbloqueando todos os botões.

* ganhou()
O método booleano é responsável por verificar se houve um vencedor. Ele checa todas as possibilidades de combinação de símbolos X e O nos botões do jogo e, caso encontre uma combinação de vitoria, muda a cor do as peças noo botões correspondentes para vermelho e retorna true. Caso nenhuma combinação de vitoria seja encontrada, ele retorna false.

* bt0_ActionPerformed (java.awt.event.ActionEvent evt)
Metodo aciona quando o botão é clicado. Verifica se o jogador atual pode colocar uma peça naquele botão. Depois Verifica se o botão já está ocupado com uma peça. Se já estiver, mostra uma mensagem na label "lblInfo" informando que a jogada é inválida. Caso contrário, prossegue com a jogada.
Define a jogada atual com o marcador "X" ou "O", dependendo de qual jogador é a vez de jogar, e atualiza a contagem de jogadas. Também verifica se uma peça foi bloqueada em uma posição específica do tabuleiro e exibe uma mensagem de erro se necessário. O método "checarBloqueioBotoes" é chamado para verificar se algum botão deve ser bloqueado.
Se o jogador não pode colocar uma peça no botão "bt0*", o método exibe uma mensagem de erro e reverte a jogada anterior, removendo a peça e chamando o método "moverPecaBt0*" para mover a peça para outra posição no tabuleiro.

Para cada botão acontece a mesma performece (0 á 9 excepto o bt05 que não verifica só se botão está bloqueada pois ela nunca estará).

*  bt0_MouseReleased(java.awt.event.MouseEvent evt)
Aciona quando quando o botão é solto pelo mouse .
Verifica se o jogo ainda não acabou através da variável "jogoAcabou".
Verifica se uma peça pode ser colocada no botão através da função "podeColocarPeca()".
Chama a função "vez()" que alterna entre os jogadores e coloca a peça no botão.
Verifica se um dos jogadores ganhou através da função "ganhou()".
Se um jogador ganhou, exibe a mensagem indicando qual jogador venceu e atualiza as estatísticas de vitórias na interface gráfica.
Define a variável "jogoAcabou" como verdadeira para indicar que o jogo terminou e impede que mais jogadas sejam feitas.

* btNovoJogoMouseClicked(java.awt.event.MouseEvent evt)
Botão para iniciar e reiniciar o jogo quando é clicada . Apagando e abrindo os conteúdos nos botões e reiniciando as varíaveis de controlo pra realizar as jogadas (jogada, e cont ) ;
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
###### Autor: Admilson De Pina

###### Abril/2023
