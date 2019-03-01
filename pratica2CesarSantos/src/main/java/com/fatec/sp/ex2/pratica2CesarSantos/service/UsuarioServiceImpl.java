package com.fatec.sp.ex2.pratica2CesarSantos.service;

import com.fatec.sp.ex2.pratica2CesarSantos.model.Endereco;
import com.fatec.sp.ex2.pratica2CesarSantos.model.Usuario;
import com.fatec.sp.ex2.pratica2CesarSantos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UsuarioService")
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepo;

    public void setUsuarioRepo(UsuarioRepository usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    @Override
    public Usuario saveUser(Usuario user) {
        return usuarioRepo.save(user);
    }

    @Override
    public List<Usuario> findUserByFirstName(String name) {
        return usuarioRepo.findUserByFirstName(name);
    }
}
