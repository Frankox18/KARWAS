package pe.edu.upc.karwas.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="washed")
public class Washed {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "id_auto", length = 6, nullable = false)
	private Integer id_auto;
	
	@Column(name = "id_employee", length = 15, nullable = false)
	private Integer id_employee;
	
	@Column(name = "wash_type", length = 15, nullable = false)
	private String wash_type;
	
	@Column(name = "auto_type", length = 15, nullable = false)
	private String auto_type;
	
	@Column(name = "wash_start_time", length = 5, nullable = false)
	private Integer wash_start_time;
	
	@Column(name = "final_hour_wash", length = 5, nullable = false)
	private Integer final_hour_wash;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_auto() {
		return id_auto;
	}

	public void setId_auto(Integer id_auto) {
		this.id_auto = id_auto;
	}

	public Integer getId_employee() {
		return id_employee;
	}

	public void setId_employee(Integer id_employee) {
		this.id_employee = id_employee;
	}

	public String getWash_type() {
		return wash_type;
	}

	public void setWash_type(String wash_type) {
		this.wash_type = wash_type;
	}

	public String getAuto_type() {
		return auto_type;
	}

	public void setAuto_type(String auto_type) {
		this.auto_type = auto_type;
	}

	public Integer getWash_start_time() {
		return wash_start_time;
	}

	public void setWash_start_time(Integer wash_start_time) {
		this.wash_start_time = wash_start_time;
	}

	public Integer getFinal_hour_wash() {
		return final_hour_wash;
	}

	public void setFinal_hour_wash(Integer final_hour_wash) {
		this.final_hour_wash = final_hour_wash;
	}
	
	
}