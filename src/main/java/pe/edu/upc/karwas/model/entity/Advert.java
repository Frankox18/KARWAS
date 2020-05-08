package pe.edu.upc.karwas.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="adverts")
public class Advert {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "id_company", length = 6, nullable = false)
	private Integer id_company;
	
	@Column(name = "service_price", length = 15, nullable = false)
	private Integer service_price;
	
	@Column(name = "advert_time", length = 15, nullable = false)
	private String advert_time;

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

	public Integer getService_price() {
		return service_price;
	}

	public void setService_price(Integer service_price) {
		this.service_price = service_price;
	}

	public String getAdvert_time() {
		return advert_time;
	}

	public void setAdvert_time(String advert_time) {
		this.advert_time = advert_time;
	}
	
	

}
