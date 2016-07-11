package br.com.testeescola.teste;

import java.sql.Connection;

import br.com.testeescolal.util.ConnectionFactory;

public class TestaConexao {
	public static void main(String[] args) {
		try {
			Connection connection = new ConnectionFactory().getConnection();
			connection.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
