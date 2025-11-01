package br.edu.atitus.jamile_ferreira.zoo_digital.animais;

public abstract class Animal {
    private String nome;
    private int idade;
    private String especie;
    private static int contador = 0;

    public Animal(String nome, int idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        Animal.contador++;
    }

    public static int getContador() {
        return contador;
    }

    public abstract void emitirSom();
    public abstract void comer();

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEspecie() {
        return especie;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }

    public String setEspecie(String especie) {
        this.especie = especie;
        return especie;
    }

    public int setIdade(int idade) {
        this.idade = idade;
        return idade;
    }
    
    @Override
    public String toString() {
    	return getClass().getSimpleName() + " | Nome: " + nome + " | Idade: " + idade;
    }
}