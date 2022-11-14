package br.com.dio.model;

import java.util.Objects;

public class Gato {
    private String nome;
    private String cor;
    public Gato() {}

    public Gato(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(nome, gato.nome) && Objects.equals(cor, gato.cor) && Objects.equals(Integer, gato.Integer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, Integer);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getInteger() {
        return Integer;
    }

    public void setInteger(String integer) {
        Integer = integer;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", Integer='" + Integer + '\'' +
                '}';
    }
}
