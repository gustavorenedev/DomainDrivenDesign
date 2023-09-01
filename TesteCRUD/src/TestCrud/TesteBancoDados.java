package TestCrud;

import java.sql.SQLException;

public class TesteBancoDados {
	public static void main(String[] args) throws SQLException {
		
		GerenciadorCliente gc = new GerenciadorCliente();
		gc.inserir(new Cliente(555, "Gustavo", "René"));
		
	}
}
