package com.fatec.sp.ex2.pratica2CesarSantos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.fatec.sp.ex2.pratica2CesarSantos.model.Usuario;
import org.springframework.data.repository.query.Param;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

	public Usuario findTop1ByNomeContains(String nome);

	@Query("SELECT u FROM Usuario u WHERE u.nome LIKE :nome")
	public List<Usuario> findUserByFirstName(@Param("nome") String nome);
}
