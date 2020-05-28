package ec.edu.ups.appdis.EXAMENMurilloJordan.buseniss;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.appdis.EXAMENMurilloJordan.data.AutorDAO;
import ec.edu.ups.appdis.EXAMENMurilloJordan.data.CapituloDAO;
import ec.edu.ups.appdis.EXAMENMurilloJordan.data.LibroDAO;
import ec.edu.ups.appdis.EXAMENMurilloJordan.model.Autor;
import ec.edu.ups.appdis.EXAMENMurilloJordan.model.Capitulo;
import ec.edu.ups.appdis.EXAMENMurilloJordan.model.Libro;

@Stateless
public class LibrosON {

	@Inject
	private LibroDAO ldao;
	@Inject
	private CapituloDAO cdao;
	
	@Inject
	private AutorDAO adao;
	
	public void guardarLibro(Libro libro) {
		ldao.insertar(libro);
	}
	
	public List<Libro> listadoLibros(){
		return ldao.listar();
	}
	
	public List<Capitulo> libCapitulos(int idLibro){
		return cdao.listar(idLibro);
	}
	
	public Autor busqueda(int idAutor) {
		return adao.buscar(idAutor);
	}
}
