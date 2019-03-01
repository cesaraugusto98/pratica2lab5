package com.fatec.sp.ex2.pratica2CesarSantos;

import com.fatec.sp.ex2.pratica2CesarSantos.model.Endereco;
import com.fatec.sp.ex2.pratica2CesarSantos.model.Usuario;
import com.fatec.sp.ex2.pratica2CesarSantos.service.EnderecoService;
import com.fatec.sp.ex2.pratica2CesarSantos.service.UsuarioService;
import com.fatec.sp.ex2.pratica2CesarSantos.service.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Pratica2CesarSantosApplication implements CommandLineRunner {

	@Autowired
	private UsuarioService usuarioService;
	private List<Endereco> enderecoList = new ArrayList<Endereco>();
	private Endereco endereco;
	private Usuario user;
	private List<Usuario> user2;

	public static void main(String[] args) {
		SpringApplication.run(Pratica2CesarSantosApplication.class, args);
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	@Override
	public void run(String... args) throws Exception {
		//endereco = new Endereco("1", "Santa Luzia", "Aaaaa", "sp", "1", "Cccc");
		//enderecoList.add(endereco);
		//user = new Usuario("Gustavo", "gsoares", 123, LocalDate.now(), "123123", enderecoList);
		//usuarioService.saveUser(user);
		//user2 = usuarioService.findUserByFirstName("Gustavo");
		//System.out.println(user2.get(0).getNome());
		System.out.println(usuarioService.findUserByFirstName("Gustavo").get(0).getNome());
	}
}

