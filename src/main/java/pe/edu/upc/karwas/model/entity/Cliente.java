package pe.edu.upc.karwas.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name = "cli_persona")
@Table(name = "clientes")
public class Cliente extends Persona {
	
    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
    private List<Auto> autos;
    
    public Cliente() {
    	autos = new ArrayList<>();
    }
	public List<Auto> getAutos() {
		return autos;
	}
	public void setAutos(List<Auto> autos) {
		this.autos = autos;
	}
}