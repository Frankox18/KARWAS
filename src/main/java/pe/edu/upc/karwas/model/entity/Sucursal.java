package pe.edu.upc.karwas.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sucursales")
public class Sucursal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "distrito", length = 30, nullable = false)
	private String distrito;
	@Column(name = "direccion", length = 30, nullable = false)
	private String direccion;
	
	private List<Anuncio> anuncio;
	
	public List<Anuncio> getAnuncio() {
		return anuncio;
	}
	public void setAnuncio(List<Anuncio> anuncio) {
		this.anuncio = anuncio;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
}
