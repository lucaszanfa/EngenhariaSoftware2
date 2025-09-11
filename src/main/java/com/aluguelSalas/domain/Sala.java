package com.aluguelSalas.domain;

import java.util.ArrayList;
import java.util.List;

public class Sala {
    private String nome;
    private int capacidade;
    private String localizacao;
    private List<String> recursos;
    private List<Reserva> reservas;
    private List<Bloqueio> bloqueios;

    public Sala(String nome, int capacidade, String localizacao, List<String> recursos) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.localizacao = localizacao;
        this.recursos = recursos != null ? recursos : new ArrayList<>();
        this.reservas = new ArrayList<>();
        this.bloqueios = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getCapacidade() { return capacidade; }
    public void setCapacidade(int capacidade) { this.capacidade = capacidade; }

    public String getLocalizacao() { return localizacao; }
    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }

    public List<String> getRecursos() { return recursos; }
    public List<Reserva> getReservas() { return reservas; }
    public List<Bloqueio> getBloqueios() { return bloqueios; }

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void adicionarBloqueio(Bloqueio bloqueio) {
        bloqueios.add(bloqueio);
    }

    public boolean estaDisponivel(String dataHora) {
        for (Reserva r : reservas) {
            if (r.getDataHora().equals(dataHora)) {
                return false;
            }
        }
        for (Bloqueio b : bloqueios) {
            if (b.getDataHora().equals(dataHora)) {
                return false;
            }
        }
        return true;
    }
}
