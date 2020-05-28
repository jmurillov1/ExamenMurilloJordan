package ec.edu.ups.appdis.EXAMENMurilloJordan.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import ec.edu.ups.appdis.EXAMENMurilloJordan.buseniss.LibrosON;
import ec.edu.ups.appdis.EXAMENMurilloJordan.model.Autor;
import ec.edu.ups.appdis.EXAMENMurilloJordan.model.Capitulo;
import ec.edu.ups.appdis.EXAMENMurilloJordan.model.Libro;

@ManagedBean
@ViewScoped
public class LibroBean {

	@Inject
	private LibrosON libON;
	
	private Libro newLibro;
	
	private List<Libro> listado;
	
	private String codAutor;
	
	private List<Capitulo> caps;
	
	@PostConstruct
	public void init() {
		newLibro = new Libro();
		Capitulo c = new Capitulo();
		newLibro.addCapitulo(c);
		loadDataLibros();
	}
	
	
	
	public List<Capitulo> getCaps() {
		return caps;
	}

	public String cargarCaps(int idLibro) {
		System.out.println(idLibro);
		caps = libON.libCapitulos(idLibro);
		return null;
	}

	public void setCaps(List<Capitulo> caps) {
		this.caps = caps;
	}



	public LibrosON getLibON() {
		return libON;
	}


	public void setLibON(LibrosON libON) {
		this.libON = libON;
	}


	public Libro getNewLibro() {
		return newLibro;
	}


	public void setNewLibro(Libro newLibro) {
		this.newLibro = newLibro;
	}


	public List<Libro> getListado() {
		return listado;
	}


	public void setListado(List<Libro> listado) {
		this.listado = listado;
	}

	
	public String getCodAutor() {
		return codAutor;
	}

	public void setCodAutor(String codAutor) {
		this.codAutor = codAutor;
	}

	public String guardarDatos() throws Exception {
		System.out.println(this.toString());
		
		libON.guardarLibro(newLibro);
		
		return "listado";
	}
	
	public String addCapitulo() {
		Capitulo c = new Capitulo();
		newLibro.addCapitulo(c);
		return null;
	}

	private void loadDataLibros() {
		listado = libON.listadoLibros();
	}
	
	public Autor busAutor() {
		System.out.println(libON.busqueda(Integer.parseInt(codAutor)));
		Autor au= libON.busqueda(Integer.parseInt(codAutor));
		codAutor=au.getNombre() + " " + au.getCorreo();
		return au;
	}
}
