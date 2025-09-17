package com.aluguelSalas.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/engenhariasw2";
    private static final String USER = "root"; 
    private static final String PASSWORD = "luzanfinha123"; // coloque a senha que você configurou no MySQL

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar com o banco", e);
        }
    }
}

