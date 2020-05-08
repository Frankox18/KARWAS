package pe.edu.upc.karwas.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="companies")
public class Company {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "name", length = 6, nullable = false)
	private String name;
	
	@Column(name = "ruc", length = 15, nullable = false)
	private Integer ruc;
	
	@Column(name = "advert_time", length = 15, nullable = false)
	private Integer advert_time;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRuc() {
		return ruc;
	}

	public void setRuc(Integer ruc) {
		this.ruc = ruc;
	}

	public Integer getAdvert_time() {
		return advert_time;
	}

	public void setAdvert_time(Integer advert_time) {
		this.advert_time = advert_time;
	}
	
	
}
