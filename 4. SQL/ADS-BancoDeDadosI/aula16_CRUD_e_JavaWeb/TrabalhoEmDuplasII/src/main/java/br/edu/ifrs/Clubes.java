/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SAMSUNG
 */
public class Clubes {
    private int id;
    private String sigla;
    private String nome;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the sigla
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * @param sigla the sigla to set
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void inserir() {
        try {
            /* Informar qual o Driver JDBC que estou usando */
            Class.forName("com.mysql.jdbc.Driver");

            /* Abrir uma conexão com o Banco de Dados */
            /* Parâmetros necessários para estabeler uma conexão com o banco 
                1 - URL JDBC: jdbc:mysql://<<IP DA MÁQUINA ONDE ESTÁ O BANCO DE DADOS>>:3306/<<database>>
                2 - Usuário do banco de dados (nas máquinas da escola usamos o root)
                3 - Senha do usuário
            */
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/brasileirao","root","12345678");

            /* Criar uma Sentença SQL */
            PreparedStatement pstmt = conexao.prepareStatement("insert into clubes (sigla, nome) values (?, ?)");
                    
            /* Parametrizar a Setença SQL */
            pstmt.setString(1, this.sigla);
            pstmt.setString(2, this.nome);

            /* Executar a Sentença SQL */
            pstmt.execute();
            
            /* Fechar a Conexa */
            pstmt.close();
            conexao.close();
        } catch (Exception e) {
            System.out.println("Falha nossa!!! Volte mais tarde!!!");
        }
    }
    
    public void atualizar() {
        try {
            /* Informar qual o Driver JDBC que estou usando */
            Class.forName("com.mysql.jdbc.Driver");

            /* Abrir uma conexão com o Banco de Dados */
            /* Parâmetros necessários para estabeler uma conexão com o banco 
                1 - URL JDBC: jdbc:mysql://<<IP DA MÁQUINA ONDE ESTÁ O BANCO DE DADOS>>:3306/<<database>>
                2 - Usuário do banco de dados (nas máquinas da escola usamos o root)
                3 - Senha do usuário
            */
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/brasileirao","root","12345678");

            /* Criar uma Sentença SQL */
            PreparedStatement pstmt = conexao.prepareStatement("update clubes set sigla = ?, nome = ? where id = ?");
                    
            /* Parametrizar a Setença SQL */
            pstmt.setString(1, this.sigla);
            pstmt.setString(2, this.nome);
            pstmt.setInt(3, this.id);

            /* Executar a Sentença SQL */
            pstmt.execute();
            
            /* Fechar a Conexa */
            pstmt.close();
            conexao.close();
        } catch (Exception e) {
            System.out.println("Falha nossa!!! Volte mais tarde!!!");
        }
    }
    
    public void deletar() {
        try {
            /* Informar qual o Driver JDBC que estou usando */
            Class.forName("com.mysql.jdbc.Driver");

            /* Abrir uma conexão com o Banco de Dados */
            /* Parâmetros necessários para estabeler uma conexão com o banco 
                1 - URL JDBC: jdbc:mysql://<<IP DA MÁQUINA ONDE ESTÁ O BANCO DE DADOS>>:3306/<<database>>
                2 - Usuário do banco de dados (nas máquinas da escola usamos o root)
                3 - Senha do usuário
            */
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/brasileirao","root","12345678");

            /* Criar uma Sentença SQL */
            PreparedStatement pstmt = conexao.prepareStatement("delete from clubes where id = ?");
                    
            /* Parametrizar a Setença SQL */
            pstmt.setInt(1, this.id);

            /* Executar a Sentença SQL */
            pstmt.execute();
            
            /* Fechar a Conexa */
            pstmt.close();
            conexao.close();
        } catch (Exception e) {
            System.out.println("Falha nossa!!! Volte mais tarde!!!");
        }
    }
    
    public Clubes[] selecionar() {
        List<Clubes> lista = new ArrayList();
        
        try {
            /* Informar qual o Driver JDBC que estou usando */
            Class.forName("com.mysql.jdbc.Driver");

            /* Abrir uma conexão com o Banco de Dados */
            /* Parâmetros necessários para estabeler uma conexão com o banco 
                1 - URL JDBC: jdbc:mysql://<<IP DA MÁQUINA ONDE ESTÁ O BANCO DE DADOS>>:3306/<<database>>
                2 - Usuário do banco de dados (nas máquinas da escola usamos o root)
                3 - Senha do usuário
            */
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/brasileirao","root","12345678");

            /* Criar uma Sentença SQL */
            PreparedStatement pstmt = conexao.prepareStatement("select * from clubes");
                    
            /* Parametrizar a Setença SQL */
            
            /* Executar a Sentença SQL */
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Clubes club = new Clubes();
                club.setId(rs.getInt("id"));
                club.setSigla(rs.getString("sigla"));
                club.setNome(rs.getString("nome"));
                lista.add(club);
            }
            
            /* Fechar a Conexa */
            rs.close();
            pstmt.close();
            conexao.close();
        } catch (Exception e) {
            System.out.println("Falha nossa!!! Volte mais tarde!!!");
        }
        
        return lista.toArray(new Clubes[0]);
    }
}
