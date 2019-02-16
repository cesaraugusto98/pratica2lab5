package com.fatec.sp.ex2.pratica2CesarSantos.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.projetolab4.model.Endereco;

import br.gov.sp.fatec.model.Autorizacao;

@Entity
@Table(name = "USU_USUARIO")
public class Usuario {
	
	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "USU_ID")
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinC
    private List<Autorizacao> autorizacoes;

	 
	
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
	
	
}
