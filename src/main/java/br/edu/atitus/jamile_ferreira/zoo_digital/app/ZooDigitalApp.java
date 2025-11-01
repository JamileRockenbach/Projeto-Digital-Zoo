package br.edu.atitus.jamile_ferreira.zoo_digital.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.atitus.jamile_ferreira.zoo_digital.animais.Animal;
import br.edu.atitus.jamile_ferreira.zoo_digital.animais.*;
import br.edu.atitus.jamile_ferreira.zoo_digital.comportamentos.*;

public class ZooDigitalApp {

    private static List<Animal> animais = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\n======== BEM-VINDO AO ZOO DIGITAL! ========");
            System.out.println("1. Cadastrar Animal");
            System.out.println("2. Listar Todos Animais");
            System.out.println("3. Listar Animais Corredores");
            System.out.println("4. Listar Animais Nadadores");
            System.out.println("5. Listar Animais Voadores");
            System.out.println("6. Listar Animais Predadores");
            System.out.println("7. Exibir Total de Animais");
            System.out.println("0. Sair");
            System.out.print(">>> Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                	cadastrarAnimal(sc);
                	break;
                case 2:
                	listarTodos();
                	break;
                case 3:
                	listarCorredores();
                	break;
                case 4: 
                	listarNadadores();
                	break;
                case 5:
                	listarVoadores();
                	break;
                case 6:
                	listarPredadores();
                	break;
                case 7:
                	exibirTotalAnimais();
                	break;
                case 0:
                	System.out.println("Obrigada por visitar o Zoo Digital, até logo! :)");
                	sc.close();
                	return;
                default:
                	System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }

    private static void cadastrarAnimal(Scanner sc) {
        System.out.println("\n== Cadastro de Animal ==");
        System.out.println("Escolha o grupo:");
        System.out.println("1 - Mamífero");
        System.out.println("2 - Ave");
        System.out.println("3 - Peixe");
        System.out.println("4 - Réptil");
        System.out.print(">>> Digite qual grupo: ");
        int grupo = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome do animal: ");
        String nome = sc.nextLine();
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        Animal novoAnimal = null;

        switch (grupo) {
            case 1:
                System.out.println("Escolha o mamífero:");
                System.out.println("1 - Cachorro");
                System.out.println("2 - Leão");
                System.out.println("3 - Baleia");
                System.out.println("4 - Golfinho");
                System.out.print(">>> Digite sua opção: ");
                int tipoMamifero = sc.nextInt();
                sc.nextLine();

                switch (tipoMamifero) {
                    case 1 -> {
                        System.out.print("Raça do cachorro: ");
                        String raca = sc.nextLine();
                        novoAnimal = new Cachorro(nome, idade, raca);
                    }
                    case 2 -> novoAnimal = new Leao(nome, idade);
                    case 3 -> novoAnimal = new Baleia(nome, idade);
                    case 4 -> novoAnimal = new Golfinho(nome, idade);
                    default -> System.out.println("Tipo inválido de mamífero!");
                }
                break;

            case 2:
                System.out.println("Escolha a ave:");
                System.out.println("1 - Pato");
                System.out.println("2 - Pinguim");
                System.out.println("3 - Calopsita");
                System.out.println("4 - Papagaio");
                System.out.print(">>> Digite sua opção: ");
                int tipoAve = sc.nextInt();
                sc.nextLine();

                System.out.print("Cor das penas: ");
                String corPenas = sc.nextLine();

                switch (tipoAve) {
                    case 1 -> novoAnimal = new Pato(nome, idade, corPenas);
                    case 2 -> novoAnimal = new Pinguim(nome, idade, corPenas);
                    case 3 -> novoAnimal = new Calopsita(nome, idade, corPenas);
                    case 4 -> novoAnimal = new Papagaio(nome, idade, corPenas);
                    default -> System.out.println("Tipo inválido de ave!");
                }
                break;

            case 3:
                System.out.println("Escolha o peixe:");
                System.out.println("1 - Traíra");
                System.out.println("2 - Pirarucu");
                System.out.println("3 - Peixe Morcego");
                System.out.println("4 - Salmão");
                System.out.print(">>> Digite sua opção: ");
                int tipoPeixe = sc.nextInt();
                sc.nextLine();

                switch (tipoPeixe) {
                    case 1 -> novoAnimal = new Traira(nome, idade);
                    case 2 -> novoAnimal = new Pirarucu(nome, idade);
                    case 3 -> novoAnimal = new PeixeMorcego(nome, idade);
                    case 4 -> novoAnimal = new Salmao(nome, idade);
                    default -> System.out.println("Tipo inválido de peixe!");
                }
                break;

            case 4:
                System.out.println("Escolha o réptil:");
                System.out.println("1 - Cobra");
                System.out.println("2 - Lagarto");
                System.out.println("3 - Camaleão");
                System.out.println("4 - Jacaré");
                System.out.print(">>> Digite sua opção: ");
                int tipoReptil = sc.nextInt();
                sc.nextLine();

                switch (tipoReptil) {
                    case 1 -> novoAnimal = new Cobra(nome, idade);
                    case 2 -> novoAnimal = new Lagarto(nome, idade);
                    case 3 -> novoAnimal = new Camaleao(nome, idade);
                    case 4 -> novoAnimal = new Jacare(nome, idade);
                    default -> System.out.println("Tipo inválido de réptil!");
                }
                break;

            default:
                System.out.println("Grupo inválido!");
        }

        if (novoAnimal != null) {
            animais.add(novoAnimal);
            System.out.println("\nAnimal cadastrado com sucesso!");
        } else {
            System.out.println("\nCadastro cancelado.");
        }
    }
    
    private static void listarTodos() {
        System.out.println("\n== Lista de Todos os Animais ==");
        for (Animal a : animais) {
            System.out.println(a);
            a.emitirSom();
            a.comer();
            System.out.println("------------------");
        }
    }

    private static void listarCorredores() {
        System.out.println("\n== Animais Corredores ==");
        for (Animal a : animais) {
            if (a instanceof Corredor c) {
                System.out.println(a);
                c.correr();
                System.out.println("------------------");
            }
        }
    }

    private static void listarNadadores() {
        System.out.println("\n== Animais Nadadores ==");
        for (Animal a : animais) {
            if (a instanceof Nadador n) {
                System.out.println(a);
                n.nadar();
                System.out.println("------------------");
            }
        }
    }

    private static void listarVoadores() {
        System.out.println("\n== Animais Voadores ==");
        for (Animal a : animais) {
            if (a instanceof Voador v) {
                System.out.println(a);
                v.voar();
                System.out.println("------------------");
            }
        }
    }

    private static void listarPredadores() {
        System.out.println("\n== Animais Predadores ==");
        for (Animal a : animais) {
            if (a instanceof Predador p) {
                System.out.println(a);
                p.cacar();
                System.out.println("------------------");
            }
        }
    }
    
    private static void exibirTotalAnimais() {
        System.out.println("\n | Total de animais cadastrados: " + Animal.getContador());
    }
}
