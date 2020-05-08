package pe.edu.upc.karwas.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "anuncios")
public class Anuncio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "precioServicio", length = 30, nullable = false)
	private Integer precioServicio;
	
	@Column(name = "tiempoAnuncio", length = 30, nullable = false)
	private Integer tiempoAnuncio;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sucursal_id")
	private Sucursal sucursal;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPrecioServicio() {
		return precioServicio;
	}
	public void setPrecioServicio(Integer precioServicio) {
		this.precioServicio = precioServicio;
	}
	public Integer getTiempoAnuncio() {
		return tiempoAnuncio;
	}
	public void setTiempoAnuncio(Integer tiempoAnuncio) {
		this.tiempoAnuncio = tiempoAnuncio;
	}
	public Sucursal getSucursal() {
		return sucursal;
	}
	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
}
