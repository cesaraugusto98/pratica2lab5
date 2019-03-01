package com.fatec.sp.ex2.pratica2CesarSantos.model;

import javax.persistence.*;

@Entity
@Table(name = "END_ENDERECO")
public class Endereco {

	public Endereco(String cep, String bairro, String municipio, String uf, String numero, String complemento) {
		this.cep = cep;
		this.bairro = bairro;
		this.municipio = municipio;
		this.uf = uf;
		this.numero = numero;
		this.complemento = complemento;
	}
	
	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "END_ID")
	private Integer id;

	@Column(name = "END_CEP", length = 12, nullable = false)
    private String cep;
	
	@Column(name = "END_BAIRRO", length = 30, nullable = false)
    private String bairro;
	
	@Column(name = "END_MUNICIPIO", length = 30, nullable = false)
    private String municipio;
	
	@Column(name = "END_UF", length = 2, nullable = false)
    private String uf;
	
	@Column(name = "END_NUMERO", length = 10, nullable = false)
    private String numero;
	
	@Column(name = "END_COMPLEMENTO", length = 50, nullable = true)
    private String complemento;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "usu_id")
	private Usuario usuario;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}
