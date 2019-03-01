package com.fatec.sp.ex2.pratica2CesarSantos.service;

import com.fatec.sp.ex2.pratica2CesarSantos.model.Usuario;

import java.util.List;

public interface UsuarioService {

    public Usuario saveUser(Usuario user);

    public List<Usuario> findUserByFirstName(String name);
}
