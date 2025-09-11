package com.aluguelSalas.domain;

import com.aluguelSalas.domain.enums.TipoUsuario;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private String telefone;
    private String senha;
    private TipoUsuario tipo;
    private List<Reserva> reservas;

    public Usuario(String nome, String email, String telefone, String senha, TipoUsuario tipo) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
        this.tipo = tipo;
        this.reservas = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public TipoUsuario getTipo() { return tipo; }
    public void setTipo(TipoUsuario tipo) { this.tipo = tipo; }

    public List<Reserva> getReservas() { return reservas; }

    public void adicionarReserva(Reserva reserva) {
        this.reservas.add(reserva);
    }

    public void cancelarReserva(Reserva reserva) {
        this.reservas.remove(reserva);
    }
}
