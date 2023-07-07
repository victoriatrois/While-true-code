import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Casas {
    private int id;
    private String sigla;
    private String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void insereNoBanco() throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.jdbc.Driver");

        Connection conexaoComOBanco = DriverManager.getConnection("jdbc:mysql://localhost:3306/escolaDeMagia", "root", "@Z03yS2mySQL");
        PreparedStatement preparedStatement = conexaoComOBanco.prepareStatement("insert into Casas(sigla, nome) values(?,?");
        preparedStatement.setString(1, nome);
        preparedStatement.setString(2,sigla);

        preparedStatement.execute();

        preparedStatement.close();

    }
}
