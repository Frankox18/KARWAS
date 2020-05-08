package pe.edu.upc.karwas.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.event.SelectEvent;

import pe.edu.upc.karwas.business.RolBusiness;
import pe.edu.upc.karwas.model.entity.Rol;

@Named
@ViewScoped
public class RolController implements Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private RolBusiness rolBusiness;
	
	private Rol rol;
	private Rol rolSelected;
	private List<Rol> roles;

	@PostConstruct
	public void init() {
		rol = new Rol();
		rolSelected = new Rol();
		loadRoles();
	}
	public void loadRoles() {
		try {
			roles = rolBusiness.readAll();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void resetForm()
	{
		rol = new Rol();
		rol.setNombreRol("Cliente");
		rolSelected = null;
	}
	public void saveRol() {
		try {
			if(rol.getId()>0)
				rolBusiness.update(rol);
			else
				rolBusiness.create(rol);
			loadRoles();
			resetForm();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void selectRol(SelectEvent e)
	{
		rolSelected = (Rol)e.getObject();
	}
	public void editRol() {
		if(rolSelected.getId()>0)
		{
			rol = rolSelected;
		}
		else
			System.out.println("No selecciono un rol");
	}
	public RolBusiness getRolBusiness() {
		return rolBusiness;
	}
	public void setRolBusiness(RolBusiness rolBusiness) {
		this.rolBusiness = rolBusiness;
	}
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	public Rol getRolSelected() {
		return rolSelected;
	}
	public void setRolSelected(Rol rolSelected) {
		this.rolSelected = rolSelected;
	}
	public List<Rol> getRoles() {
		return roles;
	}
	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}
	
	
}
