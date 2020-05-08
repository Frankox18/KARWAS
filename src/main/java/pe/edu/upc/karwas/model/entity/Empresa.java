package pe.edu.upc.karwas.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "empresas")
public class Empresa {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
	@Column(name = "nombre", length = 30, nullable = false)
    private String nombre;
    
	@Column(name = "ruc", length = 30, nullable = false)
    private Long ruc;
   
	@OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY)
    private List<Sucursal> sucursal;

    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Long getRuc() {
        return ruc;
    }
    public void setRuc(Long ruc) {
        this.ruc = ruc;
    }
    public List<Sucursal> getSucursal() {
        return sucursal;
    }
    public void setSucursal(List<Sucursal> sucursal) {
        this.sucursal = sucursal;
    }
}