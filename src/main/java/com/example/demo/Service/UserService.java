package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.User;

public interface UserService {

	/**
	 * Guarda o actualiza un usuario.
	 * 
	 * @param user.
	 * @return usuario guardado.
	 */
	User save(User user);

	/**
	 * Recupera la lista de usuarios.
	 * 
	 * @return lista de usuarios.
	 */
	List<User> findAll();

	/**
	 * Borra un usuario.
	 * 
	 * @param id del usuario.
	 */
	void delete(Long id);

}
