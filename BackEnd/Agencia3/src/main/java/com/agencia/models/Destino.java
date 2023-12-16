package com.agencia.models;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;


@Entity
public class Destino {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Usuario usuario;
	private String origem;
	private String destino;
	private String dataIda;
	private String dataVolta;
	private int qtdQuartos;
	
	
	@Transient
	@OneToMany(mappedBy = "usuario")
	@JsonIgnore
	private Set<Usuario> pets = new HashSet<>();
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getDataIda() {
		return dataIda;
	}
	public void setDataIda(String dataIda) {
		this.dataIda = dataIda;
	}
	public String getDataVolta() {
		return dataVolta;
	}
	public void setDataVolta(String dataVolta) {
		this.dataVolta = dataVolta;
	}
	public int getQtdQuartos() {
		return qtdQuartos;
	}
	public void setQtdQuartos(int qtdQuartos) {
		this.qtdQuartos = qtdQuartos;
	}
	
	
}
