package pt.idade.provam1;

import java.util.Random;

public class Jogador {
    private String nome;
    private double salario;
    private int[] golos;
    private Random random;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Jogador(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.golos = new int[34];
        random = new Random();
        for (int i = 0; i < this.golos.length; i++){
            this.golos[i] = random.nextInt(6);
        }
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentarSalario (double percentagem) {
        if (percentagem > 0 && percentagem <= 100) {
            this.salario *= percentagem;
        }
    }

    public void modGolos(int nJornada, int nGolos) {
        int pos = nJornada - 1;
        this.golos[pos] = nGolos;
    }

    public int numGolos(int nJornada) {
        int pos = nJornada - 1;
        return this.golos[pos];
    }

    public int saldoGolos() {
        int saldoGolos = 0;
        for (int i = 0; i < this.golos.length; i++){
            saldoGolos += this.golos[i];
        }
        return saldoGolos;
    }
}
