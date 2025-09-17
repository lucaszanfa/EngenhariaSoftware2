package com.aluguelSalas.repository;

import com.aluguelSalas.domain.Usuario;
import java.util.List;

public interface UsuarioRepository {
    void salvar(Usuario usuario);
    List<Usuario> listar();
}

