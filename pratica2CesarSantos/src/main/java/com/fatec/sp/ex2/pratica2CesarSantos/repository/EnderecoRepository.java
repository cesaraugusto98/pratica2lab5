package com.fatec.sp.ex2.pratica2CesarSantos.repository;

import org.springframework.data.repository.CrudRepository;

import com.fatec.sp.ex2.pratica2CesarSantos.model.Endereco;

public interface EnderecoRepository extends CrudRepository<Endereco, Long> {
	
	public Endereco findByCep(String cep); 

}
