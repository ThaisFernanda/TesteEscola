package br.com.testeescolal.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
	
	private static final String URL = "jdbc:mysql://localhost/escola";		        
	private static final String USER ="root";
	private static final String PASS = "";
   

	// atributo que representa uma conexï¿½o ao banco de dados
	public Connection getConnection() {
		Connection con = null;
		try {
			 Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection(URL,USER,PASS);
			System.out.println("Conexão estabelecida com sucesso!!");
		} catch (SQLException e) {
			System.out.println("Erro ao tentar conectar com o banco");
		}catch (Exception e) {
			System.out.println("Erro ao tentar criar nova conexao");
		}
		
		return con;
		
	}
/*	
	public class ConexaoJDBC {

		// atributo que representa uma conex�o ao banco de dados
		private Connection conexao;
				
		public boolean conecta() {
			
			
			//  CONECTA A UM BANCO DE DADOS MYSQL
			try {

			    String mysql_driver = "com.mysql.jdbc.Driver";		        
	            String usuario = "root";
	            String senha = "";
	            String servidor = "localhost";
	            String banco = "escola";
	            
	            Class.forName(mysql_driver);
	            
		        String mysqlURL = "jdbc:mysql://" + servidor +  "/" + banco;
	            
		        conexao = DriverManager.getConnection(mysqlURL,usuario, senha);
		        conexao.setAutoCommit(true);
	            
	            return true;
	            

		        
		    } // fim do try

	        catch(SQLException e ) {
	        	e.printStackTrace();
	        } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return false;
			
		}
		
			
		public PreparedStatement preparaDeclaracao(String sql) {
			
			// a classe Statement representa uma declara��o a ser enviada ao banco de dados
			PreparedStatement declaracaoPrep = null;
	      
	        // executa um comando DML (update ou insert)
			try {
				declaracaoPrep = conexao.prepareStatement(sql);
		
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return declaracaoPrep;
			
		}
		
		

		
			
			
		public ResultSet consulta(String sql) {
				
			ResultSet dbResultado = null;
			
			try {
				
				Statement declaracao = conexao.createStatement();
				
				 a classe ResultSet respresenta uma matrix
				  com os dados da consulta select 
				dbResultado = declaracao.executeQuery(sql);	
				
				if (dbResultado != null)
				    dbResultado.first();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return dbResultado;
	      
			
			//this.conectaDB();
		}
		
		
	}*/
	}
