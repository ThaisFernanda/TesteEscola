package modeloDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.testeescola.beans.Aluno;
import br.com.testeescolal.util.ConnectionFactory;
import br.com.testeescolal.util.SQL;

public class AlunoDaoImpl implements InterfaceCrudDAO<Aluno> {

	private Connection conexaoJDBC;

	public AlunoDaoImpl() {
		conexaoJDBC = new ConnectionFactory().getConnection();
	}


	@Override
	public void insert(Aluno obj) {
		try {
			PreparedStatement stmt = conexaoJDBC.prepareStatement(SQL.INSERE_ALUNO);

			stmt.setString(1, obj.getNome());
			stmt.setString(2, obj.getCpf());
			stmt.setString(3, obj.getMatricula());
			stmt.setInt(4, obj.getIdade());
			stmt.setString(5, obj.getLogin());
			stmt.setString(6, obj.getSenha());

			stmt.execute();
			stmt.close();
			

		} catch (Exception e) {
			System.out.println("Erro na inclusão: " + e.getMessage());
			e.printStackTrace();

		}

	}

	@Override
	public void update(Aluno obj) {

		try {
			PreparedStatement stmt = conexaoJDBC.prepareStatement(SQL.UPDATE_ALUNO);
			stmt.setString(1, obj.getNome());
			stmt.setString(2, obj.getCpf());
			stmt.setString(3, obj.getMatricula());
			stmt.setInt(4, obj.getIdade());
			stmt.setString(5, obj.getLogin());
			stmt.setString(6, obj.getSenha());


			stmt.setString(7,  obj.getMatricula());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			System.out.println("Erro na atualização: " + e.getMessage());
			e.printStackTrace();

		}

	}


	@Override
	public void deleta(Aluno obj) {

		try {
			PreparedStatement stmt = conexaoJDBC.prepareStatement(SQL.DELETA_ALUNO);
			stmt.setString(1,  obj.getMatricula());

			stmt.execute();
			stmt.close();
			
		} catch (SQLException e) {
			System.out.println("Erro ao tentar deletar: " + e.getMessage());
			e.printStackTrace();
		}

	}


	@Override
	public List<Aluno> recuperaTodos() {
		List<Aluno> list = new ArrayList<>();

		
		try {
			PreparedStatement stmt = conexaoJDBC.prepareStatement(SQL.BUSCA_TODOS_ALUNOS);
			//executa um select
			ResultSet rs = stmt.executeQuery();			

			// inclui todos os registros provenientes do banco de dados
			//   na lista
			while (rs.next()){
				Aluno aluno = new Aluno();
				aluno.setCpf(rs.getString("cpf"));
				aluno.setMatricula(rs.getString("matricula"));
				aluno.setNome(rs.getString("nome"));
				aluno.setIdade(rs.getInt("idade"));
				aluno.setLogin(rs.getString("login"));
				aluno.setSenha(rs.getString("senha"));
				list.add(aluno);
			}

			rs.close();
			stmt.close();
			conexaoJDBC.close();

		} catch (SQLException e) {
			System.out.println("Erro ao BUSCAR TODOS: " + e.getMessage());
		}
		return list;


	}

	@Override
	public Aluno recupera(String chave) {
		Aluno aluno = new Aluno();
		try {
			PreparedStatement stmt = conexaoJDBC.prepareStatement(SQL.BUSCA_ALUNO_MATRICULA);
			stmt.setString(1, chave);
			
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				aluno.setNome(rs.getString("nome"));
				aluno.setCpf(rs.getString("cpf"));
				aluno.setMatricula(rs.getString("matricula"));
				aluno.setIdade(rs.getInt("idade"));
				aluno.setLogin(rs.getString("login"));
				aluno.setSenha(rs.getString("senha"));

				
			}

			rs.close();
			stmt.close();
			conexaoJDBC.close();
		} catch (Exception e) {
			System.out.println("Erro ao BUSCAR POR MATRICULA: " + e.getMessage());
		}
		return aluno;
	}






}
