package pe.edu.upc.karwas.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name = "emp_persona")
@Table(name="empleados")
public class Empleado extends Persona {
			
	@Column(name = "codigoEmpleado", length = 10, nullable = false)
	private long codigoEmpleado;

	@ManyToMany
	@JoinTable(name="empleado_sucursal", 
		joinColumns = { @JoinColumn(name = "empleado_id", referencedColumnName = "id") }, 
		inverseJoinColumns = { @JoinColumn(name = "sucursal_id", referencedColumnName = "id") } )
	private List<Sucursal> sucursales;
	
	@OneToMany(mappedBy = "empleado", fetch = FetchType.LAZY)
	private List<Lavado> lavados; 
	
	public Empleado() {
		sucursales = new ArrayList<>();
		lavados = new ArrayList<>();
	}

	public List<Sucursal> getSucursales() {
		return sucursales;
	}

	public void setSucursales(List<Sucursal> sucursales) {
		this.sucursales = sucursales;
	}

	public List<Lavado> getLavados() {
		return lavados;
	}

	public void setLavados(List<Lavado> lavados) {
		this.lavados = lavados;
	}
	public long getCodigoEmpleado() {
		return codigoEmpleado;
	}

	public void setCodigoEmpleado(long codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}
	
}
