package pe.edu.upc.karwas.business;

import java.util.Optional;

import pe.edu.upc.karwas.model.entity.Usuario;

public interface UsuarioBusiness extends CrudBusiness<Usuario, Integer> {
	Optional<Usuario> readByNombreUsuario(String nombreUsuario) throws Exception;
}
