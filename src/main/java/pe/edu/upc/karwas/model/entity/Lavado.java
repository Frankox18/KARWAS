package pe.edu.upc.karwas.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "lavados")
public class Lavado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "tipoLavado", length = 30, nullable = false)
	private String tipoLavado;

	@Column(name = "horaInicioLavado", length = 30, nullable = false)
	private Integer horaInicioLavado;

	@Column(name = "horaFinLavado", length = 30, nullable = false)
	private Integer horaFinLavado;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "empleado_id")
	private Empleado empleado;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "auto_id")
	private Auto auto;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTipoLavado() {
		return tipoLavado;
	}
	public void setTipoLavado(String tipoLavado) {
		this.tipoLavado = tipoLavado;
	}
	public Integer getHoraInicioLavado() {
		return horaInicioLavado;
	}
	public void setHoraInicioLavado(Integer horaInicioLavado) {
		this.horaInicioLavado = horaInicioLavado;
	}
	public Integer getHoraFinLavado() {
		return horaFinLavado;
	}
	public void setHoraFinLavado(Integer horaFinLavado) {
		this.horaFinLavado = horaFinLavado;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public Auto getAuto() {
		return auto;
	}
	public void setAuto(Auto auto) {
		this.auto = auto;
	}


}