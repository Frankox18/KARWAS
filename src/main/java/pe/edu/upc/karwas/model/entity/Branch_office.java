package pe.edu.upc.karwas.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="branch_office")
public class Branch_office {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "id_company", length = 6, nullable = false)
	private Integer id_company;
	
	@Column(name = "district", length = 15, nullable = false)
	private String district;
	
	@Column(name = "direction", length = 15, nullable = false)
	private String direction;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_company() {
		return id_company;
	}

	public void setId_company(Integer id_company) {
		this.id_company = id_company;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	
}
