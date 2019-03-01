package com.fatec.sp.ex2.pratica2CesarSantos.service;

import com.fatec.sp.ex2.pratica2CesarSantos.model.Endereco;
import com.fatec.sp.ex2.pratica2CesarSantos.repository.EnderecoRepository;
import com.fatec.sp.ex2.pratica2CesarSantos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EnderecoService")
public class EnderecoServiceImpl implements EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepo;

    public void setUsuarioRepo(EnderecoRepository enderecoRepo) {
        this.enderecoRepo = enderecoRepo;
    }

    @Override
    public Endereco saveEndereco(Endereco endereco) {
        return enderecoRepo.save(endereco);
    }
}
