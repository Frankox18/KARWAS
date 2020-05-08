package pe.edu.upc.karwas.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="employee_branch_office")
public class Employee_branch_office {
	
	@Column(name = "id_branch_office", length = 6, nullable = false)
	private Integer id_branch_office;
	
	@Column(name = "id_employee", length = 6, nullable = false)
	private Integer id_employee;
	
	@Column(name = "shift_work", length = 15, nullable = false)
	private String shift_work;
	
	@Column(name = "working_hours", length = 15, nullable = false)
	private Integer working_hours;
	
	@Column(name = "start_time", length = 15, nullable = false)
	private Integer start_time;
	
	@Column(name = "final_hour", length = 15, nullable = false)
	private Integer final_hour;

	public Integer getId_branch_office() {
		return id_branch_office;
	}

	public void setId_branch_office(Integer id_branch_office) {
		this.id_branch_office = id_branch_office;
	}

	public Integer getId_employee() {
		return id_employee;
	}

	public void setId_employee(Integer id_employee) {
		this.id_employee = id_employee;
	}

	public String getShift_work() {
		return shift_work;
	}

	public void setShift_work(String shift_work) {
		this.shift_work = shift_work;
	}

	public Integer getWorking_hours() {
		return working_hours;
	}

	public void setWorking_hours(Integer working_hours) {
		this.working_hours = working_hours;
	}

	public Integer getStart_time() {
		return start_time;
	}

	public void setStart_time(Integer start_time) {
		this.start_time = start_time;
	}

	public Integer getFinal_hour() {
		return final_hour;
	}

	public void setFinal_hour(Integer final_hour) {
		this.final_hour = final_hour;
	}

	
	
	
}
