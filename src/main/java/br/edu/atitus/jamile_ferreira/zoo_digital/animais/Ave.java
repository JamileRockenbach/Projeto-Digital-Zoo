package br.edu.atitus.jamile_ferreira.zoo_digital.animais;

public abstract class Ave extends Animal {
    private String corPenas;

    public Ave(String nome, int idade, String corPenas) {
        super(nome, idade, "Ave");
        this.corPenas = corPenas;
    }

    public String getCorPenas() {
        return corPenas;
    }

    public void setCorPenas(String corPenas) {
        this.corPenas = corPenas;
    }

    public void botarOvo() {
        System.out.println(this.getNome() + " está botando um ovo.");
    }
    
    @Override
    public String toString() {
        return super.toString() + " | Cor das penas: " + corPenas;
    }

}
