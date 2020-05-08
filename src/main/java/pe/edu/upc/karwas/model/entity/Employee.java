package pe.edu.upc.karwas.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "id_person", length = 10, nullable = false)
	private Integer id_person;
	
	@Column(name = "code_employee", length = 10, nullable = false)
	private Integer code_employee;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_person() {
		return id_person;
	}

	public void setId_person(Integer id_person) {
		this.id_person = id_person;
	}

	public Integer getCode_employee() {
		return code_employee;
	}

	public void setCode_employee(Integer code_employee) {
		this.code_employee = code_employee;
	}
	
}
