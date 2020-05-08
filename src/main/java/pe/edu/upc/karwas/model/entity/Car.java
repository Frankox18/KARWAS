package pe.edu.upc.karwas.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cars")
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "plate", length = 6, nullable = false)
	private Integer plate;
	
	@Column(name = "brand", length = 15, nullable = false)
	private String brand;
	
	@Column(name = "model", length = 15, nullable = false)
	private String model;
	
	@Column(name = "auto_type", length = 15, nullable = false)
	private String auto_type;
	
	@Column(name = "id_client", length = 15, nullable = false)
	private Integer id_client;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPlate() {
		return plate;
	}

	public void setPlate(Integer plate) {
		this.plate = plate;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getAuto_type() {
		return auto_type;
	}

	public void setAuto_type(String auto_type) {
		this.auto_type = auto_type;
	}

	public Integer getId_client() {
		return id_client;
	}

	public void setId_client(Integer id_client) {
		this.id_client = id_client;
	}
	
	
}