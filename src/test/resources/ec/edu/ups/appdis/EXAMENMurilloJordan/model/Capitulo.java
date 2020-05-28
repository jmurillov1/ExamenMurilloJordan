package ec.edu.ups.appdis.EXAMENMurilloJordan.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Capitulo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_capitulo")
	private int idCapitulo;
	
	@Column(name="cap_titulo")
	private String capTitulo;
	
	private int paginas;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_autor")
	private Autor autor;
	
	public Capitulo() {
		
	}
	
	public int getIdCapitulo() {
		return idCapitulo;
	}

	public void setIdCapitulo(int idCapitulo) {
		this.idCapitulo = idCapitulo;
	}

	public String getCapTitulo() {
		return capTitulo;
	}

	public void setCapTitulo(String capTitulo) {
		this.capTitulo = capTitulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Capitulo [idCapitulo=" + idCapitulo + ", capTitulo=" + capTitulo + ", autor=" + autor + "]";
	}
	
}
