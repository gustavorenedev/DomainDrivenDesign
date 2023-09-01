package TestCrud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

/**
 * @author Gustavo
 * - Driver JDBC - Java Database Connectivity
 * - Executar instruções SQL
 * - Pacote java.sql (biblioteca java)
 * - Classe DriverManager
 * - Interfaces (Driver, Connection, Statement, PreparedStatement, ResultSet)
 */
public class GerenciadorCliente {
	
	private String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
	private Connection conn;
	
	public GerenciadorCliente() throws SQLException {
		OracleDataSource ods = new OracleDataSource();
		
		//configurando a URL
		ods.setURL(url);
		//configurando o usuário
		ods.setUser(Credenciais.user);
		//configurando a senha
		ods.setPassword(Credenciais.pwd);
		
		//obter uma conexão com o SGBD
		conn = ods.getConnection();
	}
	
	//Método inserir(cliente)
	public String inserir(Cliente c) {
		String sql = "INSERT INTO persons VALUES(?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, c.getId());
			ps.setString(2, c.getNome());
			ps.setString(3, c.getSobrenome());
			ps.execute();
		} catch (SQLException e) {
			if (conn == null) {
				System.err.println("Conexão nula!");
			}
			e.printStackTrace();
		}
		return "Cliente Adicionado com sucesso!";
	}
}
