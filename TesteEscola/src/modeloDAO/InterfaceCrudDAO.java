package modeloDAO;

import java.util.List;

//Toda Classe que DAO deverá implementar esta interfaceCRUD
public interface InterfaceCrudDAO<T> {
	
	public void insert(T obj);  // (INSERT/CREATE)
	
	public void update(T obj);  // (UPDATE)
	
	public void deleta(T obj);  // (DELETE)
		
	public List<T> recuperaTodos(); // (RECUPERA CONJUNTO)
	
	public T recupera(String chave);  //  (RECUPERA UM ELEMENTO)
	

	
	
}
