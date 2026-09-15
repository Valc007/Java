// Importa a classe Scanner
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Entrada de dados do jogador
        Scanner dados = new Scanner(System.in);

        // Jogar novamente
        int jogarNovamente = 1;

        while (jogarNovamente == 1) {

            // Tela inicial
            System.out.println("=== RPG ===");
            System.out.println();

            // Nome do jogador
            System.out.println("Digite o nome do Jogador: ");
            String nome = dados.nextLine();

            // Verifica se o nome é válido
            while (!nome.matches("[\\p{L} ]+")) {

                System.out.println("Nome Inválido!");
                System.out.println("Digite o nome Novamente: ");

                nome = dados.nextLine();
            }

            // Menu de escolha de classe
            System.out.println();
            System.out.println("Escolha sua Classe: ");
            System.out.println("1 - Guerreiro");
            System.out.println("2 - Arqueiro");
            System.out.println("3 - Mago");

            System.out.print("Escolha: ");
            int escolha = dados.nextInt();

            // Verifica se a Classe Escolhida é Válida
            while (escolha < 1 || escolha > 3) {

                System.out.println("Opção Inválida!");
                System.out.print("Escolha novamente: ");

                escolha = dados.nextInt();
            }

            // Criação do personagem escolhido
            if (escolha == 1) {

                // Criação do jogador
                Guerreiro jogador = new Guerreiro(nome, 120, 20);

                System.out.println();
                System.out.println(nome + " escolheu a classe Guerreiro!");

                // Criação do inimigo
                Guerreiro inimigo = new Guerreiro("Orc", 100, 15);

                System.out.println();
                System.out.println("=== Batalha ===");

                System.out.println("Jogador: " + jogador.nome);
                System.out.println("Vida: " + jogador.vida);

                System.out.println();

                System.out.println("Inimigo: " + inimigo.nome);
                System.out.println("Vida: " + inimigo.vida);

                // Começo da batalha
                while (jogador.vida > 0 && inimigo.vida > 0) {

                    System.out.println();
                    System.out.println("=== Seu Turno ===");
                    System.out.println("1 - Atacar");

                    System.out.print("Escolha: ");
                    int acao = dados.nextInt();

                    System.out.println();

                    if (acao == 1) {

                        // Jogador ataca
                        jogador.atacar(inimigo);

                        // Inimigo ataca somente se ainda estiver vivo
                        if (inimigo.vida > 0) {
                            inimigo.atacar(jogador);
                        }

                        // Vida após o turno
                        System.out.println();
                        System.out.println("Vida de " + jogador.nome + ": " + jogador.vida);
                        System.out.println("Vida de " + inimigo.nome + ": " + inimigo.vida);
                    }

                    else {
                        System.out.println("Ação Inválida!");
                    }
                }

                // Resultado da batalha
                if (jogador.vida > 0) {

                    System.out.println();
                    System.out.println(jogador.nome + " venceu a Batalha!");
                }

                else {

                    System.out.println();
                    System.out.println(inimigo.nome + " venceu a Batalha!");
                }
            }

            else if (escolha == 2) {

                // Criação do jogador
                Arqueiro jogador = new Arqueiro(nome, 100, 15);

                System.out.println();
                System.out.println(nome + " escolheu a classe Arqueiro!");

                // Criação do inimigo
                Arqueiro inimigo = new Arqueiro("Goblin", 90, 12);

                System.out.println();
                System.out.println("=== Batalha ===");

                System.out.println("Jogador: " + jogador.nome);
                System.out.println("Vida: " + jogador.vida);

                System.out.println();

                System.out.println("Inimigo: " + inimigo.nome);
                System.out.println("Vida: " + inimigo.vida);

                // Começo da batalha
                while (jogador.vida > 0 && inimigo.vida > 0) {

                    System.out.println();
                    System.out.println("=== Seu Turno ===");
                    System.out.println("1 - Atacar");

                    System.out.print("Escolha: ");
                    int acao = dados.nextInt();

                    System.out.println();

                    if (acao == 1) {

                        // Jogador ataca
                        jogador.atacar(inimigo);

                        // Inimigo ataca somente se ainda estiver vivo
                        if (inimigo.vida > 0) {
                            inimigo.atacar(jogador);
                        }

                        // Vida após o turno
                        System.out.println();
                        System.out.println("Vida de " + jogador.nome + ": " + jogador.vida);
                        System.out.println("Vida de " + inimigo.nome + ": " + inimigo.vida);
                    }

                    else {
                        System.out.println("Ação Inválida!");
                    }
                }

                // Resultado da batalha
                if (jogador.vida > 0) {

                    System.out.println();
                    System.out.println(jogador.nome + " venceu a Batalha!");
                }

                else {

                    System.out.println();
                    System.out.println(inimigo.nome + " venceu a Batalha!");
                }
            }

            else if (escolha == 3) {

                // Criação do jogador
                Mago jogador = new Mago(nome, 80, 25);

                System.out.println();
                System.out.println(nome + " escolheu a classe Mago!");

                // Criação do inimigo
                Mago inimigo = new Mago("Feiticeiro", 85, 18);

                System.out.println();
                System.out.println("=== Batalha ===");

                System.out.println("Jogador: " + jogador.nome);
                System.out.println("Vida: " + jogador.vida);

                System.out.println();

                System.out.println("Inimigo: " + inimigo.nome);
                System.out.println("Vida: " + inimigo.vida);

                // Começo da batalha
                while (jogador.vida > 0 && inimigo.vida > 0) {

                    System.out.println();
                    System.out.println("=== Seu Turno ===");
                    System.out.println("1 - Atacar");

                    System.out.print("Escolha: ");
                    int acao = dados.nextInt();

                    System.out.println();

                    if (acao == 1) {

                        // Jogador ataca
                        jogador.atacar(inimigo);

                        // Inimigo ataca somente se ainda estiver vivo
                        if (inimigo.vida > 0) {
                            inimigo.atacar(jogador);
                        }

                        // Vida após o turno
                        System.out.println();
                        System.out.println("Vida de " + jogador.nome + ": " + jogador.vida);
                        System.out.println("Vida de " + inimigo.nome + ": " + inimigo.vida);
                    }

                    else {
                        System.out.println("Ação Inválida!");
                    }
                }

                // Resultado da batalha
                if (jogador.vida > 0) {

                    System.out.println();
                    System.out.println(jogador.nome + " venceu a Batalha!");
                }

                else {

                    System.out.println();
                    System.out.println(inimigo.nome + " venceu a Batalha!");
                }
            }

            // Pergunta se o jogador deseja jogar novamente
            System.out.println();
            System.out.println("Deseja jogar novamente?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");

            System.out.println();

            System.out.print("Escolha: ");
            jogarNovamente = dados.nextInt();

            // Verifica se a opção de Jogar Novamente é válida
            while (jogarNovamente < 1 || jogarNovamente > 2) {

                System.out.println("Opção Inválida!");
                System.out.print("Escolha Novamente: ");

                jogarNovamente = dados.nextInt();
            }

            // Separação entre partidas
            if (jogarNovamente == 1) {

                System.out.println();
                System.out.println("==============================");
                System.out.println();
            }

            // Limpa o Enter deixado pelo nextInt()
            dados.nextLine();
        }

        // Encerramento do jogo
        System.out.println();
        System.out.println("=== FIM DE JOGO ===");
        System.out.println("Obrigado por jogar!");

        dados.close();
    }
}