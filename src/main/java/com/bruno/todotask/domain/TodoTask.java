package com.bruno.todotask.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class TodoTask implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titulo;
	private String descricao;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private LocalDateTime dataParaFinalizar;
	private Boolean finalizado = false;

	/**
	 * 
	 */
	public TodoTask() {
		super();
	}

	/**
	 * @param id
	 * @param titulo
	 * @param descricao
	 * @param dataParaFinalizar
	 * @param finalizado
	 */
	public TodoTask(Integer id, String titulo, String descricao, LocalDateTime dataParaFinalizar, Boolean finalizado) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataParaFinalizar = dataParaFinalizar;
		this.finalizado = finalizado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getDataParaFinalizar() {
		return dataParaFinalizar;
	}

	public void setDataParaFinalizar(LocalDateTime dataParaFinalizar) {
		this.dataParaFinalizar = dataParaFinalizar;
	}

	public Boolean getFinalizado() {
		return finalizado;
	}

	public void setFinalizado(Boolean finalizado) {
		this.finalizado = finalizado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TodoTask other = (TodoTask) obj;
		return Objects.equals(id, other.id);
	}

}
