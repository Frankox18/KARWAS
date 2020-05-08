package pe.edu.upc.karwas.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.event.SelectEvent;

import pe.edu.upc.karwas.business.AutoBusiness;
import pe.edu.upc.karwas.model.entity.Auto;

@Named
@ViewScoped
public class AutoController implements Serializable{

	private static final long serialVersionUID = 1L;
	@Inject
	private AutoBusiness autoBusiness;
	
	private Auto auto;
	private Auto autoSelected;
	private List<Auto> autos;
	
	@PostConstruct
	public void init() {
		auto = new Auto();
		autoSelected = new Auto();
		loadAutos();
	}
	public void loadAutos() {
		try {
			autos = autoBusiness.readAll();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void resetForm()
	{
		auto = new Auto();
		auto.setMarca("Kia");
		autoSelected = null;
	}
	public void saveAuto() {
		try {
			if(auto.getId()>0)
				autoBusiness.update(auto);
			else
				autoBusiness.create(auto);
			loadAutos();
			resetForm();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void selectAuto(SelectEvent e)
	{
		autoSelected = (Auto)e.getObject();
	}
	public void editAauto() {
		if(autoSelected.getId()>0)
		{
			auto = autoSelected;
		}
		else
			System.out.println("No selecciono un automovil");
	}
	public AutoBusiness getAutoBusiness() {
		return autoBusiness;
	}
	public void setAutoBusiness(AutoBusiness autoBusiness) {
		this.autoBusiness = autoBusiness;
	}
	public Auto getAuto() {
		return auto;
	}
	public void setAuto(Auto auto) {
		this.auto = auto;
	}
	public Auto getAutoSelected() {
		return autoSelected;
	}
	public void setAutoSelected(Auto autoSelected) {
		this.autoSelected = autoSelected;
	}
	public List<Auto> getAutos() {
		return autos;
	}
	public void setAutos(List<Auto> autos) {
		this.autos = autos;
	}
	
}
