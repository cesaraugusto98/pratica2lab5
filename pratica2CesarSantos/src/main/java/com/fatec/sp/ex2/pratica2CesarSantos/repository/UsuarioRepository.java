package com.fatec.sp.ex2.pratica2CesarSantos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.fatec.sp.ex2.pratica2CesarSantos.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

	public Usuario findByNome(String nome);
	
	public Usuario findTop1ByNomeContains(String nome);
	
	//public List<Usuario> findByIdGreaterThan(Long id);
	
	//public List<Usuario> findByAutorizacoesNomeContainsIgnoreCase(String nome);
	
	//public List<Usuario> findByNomeContainsIgnoreCaseOrAutorizacoesNomeContainsIgnoreCase(String nomeUsuario, String nomeAutorizacao);
	
	@Query("select u from Usuario u where u.nome like %?1%")
	public List<Usuario> buscaUsuario(String nome);
}
