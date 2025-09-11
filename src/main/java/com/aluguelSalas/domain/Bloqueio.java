package com.aluguelSalas.domain;

public class Bloqueio {
    private String dataHora;
    private String motivo;

    public Bloqueio(String dataHora, String motivo) {
        this.dataHora = dataHora;
        this.motivo = motivo;
    }

    public String getDataHora() { return dataHora; }
    public String getMotivo() { return motivo; }
}
