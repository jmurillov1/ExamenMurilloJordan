package ec.edu.ups.appdis.EXAMENMurilloJordan.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Libro  implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_libro")
	private int idLibro;
	@Column(name="cod_isnn")
	private String codISNN;
	
	private String titulo;
	
	@Column(name="anio_edicion")
	private int anioEdicion;
	
	private String editorial;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="id_libro")
	private List<Capitulo> listaCapitulos;
	
	public Libro() {
		
	}

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public String getCodISNN() {
		return codISNN;
	}

	public void setCodISNN(String codISNN) {
		this.codISNN = codISNN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnioEdicion() {
		return anioEdicion;
	}

	public void setAnioEdicion(int anioEdicion) {
		this.anioEdicion = anioEdicion;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public List<Capitulo> getListaCapitulos() {
		return listaCapitulos;
	}

	public void setListaCapitulos(List<Capitulo> listaCapitulos) {
		this.listaCapitulos = listaCapitulos;
	}

	@Override
	public String toString() {
		return "Libro [idLibro=" + idLibro + ", codISNN=" + codISNN + ", titulo=" + titulo + ", anioEdicion="
				+ anioEdicion + ", editorial=" + editorial + ", listaCapitulos=" + listaCapitulos + "]";
	}
}
