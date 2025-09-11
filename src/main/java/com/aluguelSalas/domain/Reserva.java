package com.aluguelSalas.domain;

import java.util.UUID;

public class Reserva {
    private String id;
    private Usuario usuario;
    private Sala sala;
    private String dataHora;
    private int duracaoHoras;

    public Reserva(Usuario usuario, Sala sala, String dataHora, int duracaoHoras) {
        this.id = UUID.randomUUID().toString();
        this.usuario = usuario;
        this.sala = sala;
        this.dataHora = dataHora;
        this.duracaoHoras = duracaoHoras;
    }

    public String getId() { return id; }
    public Usuario getUsuario() { return usuario; }
    public Sala getSala() { return sala; }
    public String getDataHora() { return dataHora; }
    public int getDuracaoHoras() { return duracaoHoras; }

    public boolean validarDuracao() {
        return duracaoHoras >= 1 && duracaoHoras <= 8;
    }
}
