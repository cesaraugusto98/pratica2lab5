package com.fatec.sp.ex2.pratica2CesarSantos.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USU_USUARIO")
public class Usuario {
	
	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "USU_ID")
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY)
	private List<Endereco> enderecos;
	 
	@Column(name = "USU_NOME", length = 50, nullable = false)
    private String nome;
	
	@Column(name = "USU_LOGIN", length = 12, nullable = false)
    private String login;
	
	@Column(name = "USU_SENHA", nullable = false)
    private Integer senha;

	@Column(name = "USU_DATA_NASCIMENTO", nullable = false)
    private LocalDate dataNascimento;

	@Column(name = "USU_CPF", length = 11, nullable = true)
    private String cpf;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Integer getSenha() {
		return senha;
	}

	public void setSenha(Integer senha) {
		this.senha = senha;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
