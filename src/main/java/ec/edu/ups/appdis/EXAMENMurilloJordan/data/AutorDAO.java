package ec.edu.ups.appdis.EXAMENMurilloJordan.data;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.appdis.EXAMENMurilloJordan.model.Autor;

@Stateless
public class AutorDAO {

	@PersistenceContext(name="EXAMENMurilloJordanPersistenceUnit")
	private EntityManager em;
	
	public List<Autor> listar(){
		String jpql = "SELECT Autor FROM Autor a";
		Query q = em.createQuery(jpql, Autor.class);
		return q.getResultList();
	}
	
	public Autor buscar(int idAutor) {
		return em.find(Autor.class, idAutor);
	}
}
