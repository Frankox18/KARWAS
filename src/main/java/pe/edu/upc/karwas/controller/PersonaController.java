package pe.edu.upc.karwas.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.event.SelectEvent;

import pe.edu.upc.karwas.business.PersonaBusiness;
import pe.edu.upc.karwas.model.entity.Persona;

@Named
@ViewScoped
public class PersonaController implements Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private PersonaBusiness personaBusiness;

	private Persona persona;
	private Persona personaSelected;
	private List<Persona> personas;

	@PostConstruct
	public void init() {
		persona = new Persona();
		personaSelected = new Persona();
		loadPersonas();
	}
	public void loadPersonas() {
		try {
			personas = personaBusiness.readAll();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void resetForm()
	{
		persona = new Persona();
		persona.setDistrito("Chorrillos");
		personaSelected = null;
	}
	public void savePersona() {
		try {
			if(persona.getId()>0)
				personaBusiness.update(persona);
			else
				personaBusiness.create(persona);
			loadPersonas();
			resetForm();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void selectPersona(SelectEvent e)
	{
		personaSelected = (Persona)e.getObject();
	}
	public void editPersona() {
		if(personaSelected.getId()>0)
		{
			persona = personaSelected;
		}
		else
			System.out.println("No selecciono una persona");
	}
	public PersonaBusiness getPersonaBusiness() {
		return personaBusiness;
	}
	public void setPersonaBusiness(PersonaBusiness personaBusiness) {
		this.personaBusiness = personaBusiness;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public Persona getPersonaSelected() {
		return personaSelected;
	}
	public void setPersonaSelected(Persona personaSelected) {
		this.personaSelected = personaSelected;
	}
	public List<Persona> getPersonas() {
		return personas;
	}
	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}
	
}
