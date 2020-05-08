package pe.edu.upc.karwas.business;

import java.util.List;
import java.util.Optional;

public interface CrudBusiness<T,ID> {
	Integer create(T t) throws Exception;
	Integer update(T t) throws Exception;
	Integer delete(T t) throws Exception;
	List<T> readAll() throws Exception;
	Optional<T> readById(ID id) throws Exception; 
}
