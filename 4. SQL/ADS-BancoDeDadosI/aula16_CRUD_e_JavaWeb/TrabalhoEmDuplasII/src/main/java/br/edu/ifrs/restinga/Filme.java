package br.edu.ifrs.restinga;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Filme {
    private int idFilme;
    private String nomePTBR;
    private String nomeOriginal;
    private String sinopse;
    private int anoLancamento;

    public Filme(int idFilme, String nomePTBR, String nomeOriginal, String sinopse, int anoLancamento) {
        this.idFilme = idFilme;
        this.nomePTBR = nomePTBR;
        this.nomeOriginal = nomeOriginal;
        this.sinopse = sinopse;
        this.anoLancamento = anoLancamento;
    }

    public Filme() {

    }

    public int getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }

    public String getNomePTBR() {
        return nomePTBR;
    }

    public void setNomePTBR(String nomePTBR) {
        this.nomePTBR = nomePTBR;
    }

    public String getNomeOriginal() {
        return nomeOriginal;
    }

    public void setNomeOriginal(String nomeOriginal) {
        this.nomeOriginal = nomeOriginal;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void insereFilme() {
        try {
            /* Informar qual o Driver JDBC que estou usando */
            Class.forName("com.mysql.cj.jdbc.Driver");

            /* Abrir uma conexão com o Banco de Dados */
            /* Parâmetros necessários para estabeler uma conexão com o banco
                1 - URL JDBC: jdbc:mysql://<<IP DA MÁQUINA ONDE ESTÁ O BANCO DE DADOS>>:3306/<<database>>
                2 - Usuário do banco de dados (nas máquinas da escola usamos o root)
                3 - Senha do usuário
            */
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema","root","@Senh4mySQL");

            /* Criar uma Sentença SQL */
            PreparedStatement pstmt = conexao.prepareStatement("insert into filme (nomePTBR, nomeOriginal, sinopse, anoLancamento) values (?, ?, ?, ?, ?)");

            /* Parametrizar a Setença SQL */
            pstmt.setString(2, this.nomePTBR);
            pstmt.setString(3, this.nomeOriginal);
            pstmt.setString(4, this.sinopse);
            pstmt.setInt(5, this.anoLancamento);

            /* Executar a Sentença SQL */
            pstmt.execute();

            /* Fechar a Conexa */
            pstmt.close();
            conexao.close();
        } catch (Exception e) {
            System.out.println("Falha de banco de dados. Tente novamente mais tarde.");
        }
    }

    public void atualizaFilme() {
        try {
            /* Informar qual o Driver JDBC que estou usando */
            Class.forName("com.mysql.jdbc.Driver");

            /* Abrir uma conexão com o Banco de Dados */
            /* Parâmetros necessários para estabeler uma conexão com o banco
                1 - URL JDBC: jdbc:mysql://<<IP DA MÁQUINA ONDE ESTÁ O BANCO DE DADOS>>:3306/<<database>>
                2 - Usuário do banco de dados (nas máquinas da escola usamos o root)
                3 - Senha do usuário
            */
            // Configuração do banco do Norton
            // Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/brasileirao","root","12345678");

            // Configuração do banco da Vic
             Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/brasileirao","root","12345678");


            /* Criar uma Sentença SQL */
            PreparedStatement pstmt = conexao.prepareStatement("update Filme set nomePTBR = ?, nomeOriginal = ? where id = ?");

            /* Parametrizar a Setença SQL */
            pstmt.setString(1, this.nomePTBR);
            pstmt.setString(2, this.nomeOriginal);
            pstmt.setInt(3, this.idFilme);

            /* Executar a Sentença SQL */
            pstmt.execute();

            /* Fechar a Conexa */
            pstmt.close();
            conexao.close();
        } catch (Exception e) {
            System.out.println("Falha nossa!!! Volte mais tarde!!!");
        }
    }

    public void deletaFilme() {
        try {
            /* Informar qual o Driver JDBC que estou usando */
            Class.forName("com.mysql.jdbc.Driver");

            /* Abrir uma conexão com o Banco de Dados */
            /* Parâmetros necessários para estabeler uma conexão com o banco
                1 - URL JDBC: jdbc:mysql://<<IP DA MÁQUINA ONDE ESTÁ O BANCO DE DADOS>>:3306/<<database>>
                2 - Usuário do banco de dados (nas máquinas da escola usamos o root)
                3 - Senha do usuário
            */
            // Configuração do banco do Norton
            // Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/brasileirao","root","12345678");

            // Configuração do banco da Vic
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/brasileirao","root","12345678");

            /* Criar uma Sentença SQL */
            PreparedStatement pstmt = conexao.prepareStatement("delete from Filme where idFilme = ?");

            /* Parametrizar a Setença SQL */
            pstmt.setInt(1, this.idFilme);

            /* Executar a Sentença SQL */
            pstmt.execute();

            /* Fechar a Conexa */
            pstmt.close();
            conexao.close();
        } catch (Exception e) {
            System.out.println("Falha nossa!!! Volte mais tarde!!!");
        }
    }

    public List<Filme> selecionaFilme() {
        List<Filme> lista = new ArrayList<>();

        try {
            /* Informar qual o Driver JDBC que estou usando */
            Class.forName("com.mysql.jdbc.Driver");

            /* Abrir uma conexão com o Banco de Dados */
            /* Parâmetros necessários para estabeler uma conexão com o banco
                1 - URL JDBC: jdbc:mysql://<<IP DA MÁQUINA ONDE ESTÁ O BANCO DE DADOS>>:3306/<<database>>
                2 - Usuário do banco de dados (nas máquinas da escola usamos o root)
                3 - Senha do usuário
            */
            // Configuração do banco do Norton
            // Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/brasileirao","root","12345678");

            // Configuração do banco da Vic
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/brasileirao","root","12345678");

            /* Criar uma Sentença SQL */
            PreparedStatement pstmt = conexao.prepareStatement("select * from Filme");

            /* Parametrizar a Setença SQL */

            /* Executar a Sentença SQL */
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Filme filme = new Filme();
                filme.setIdFilme(rs.getInt("idFilme"));
                filme.setNomePTBR(rs.getString("NomePTBR"));
                filme.setNomeOriginal(rs.getString("nomeOriginal"));
                lista.add(filme);
            }

            /* Fechar a Conexa */
            rs.close();
            pstmt.close();
            conexao.close();
        } catch (Exception e) {
            System.out.println("Falha nossa!!! Volte mais tarde!!!");
        }

        return lista;
    }
}
