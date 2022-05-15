package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.modelo.StatusTopico;
import br.com.alura.forum.modelo.Topico;

public class DetalhesDoTopicoDto {
	
	private Long id;
	private String titulo;
	private String Mensagem;
	private LocalDateTime dataCriacao;
	private String nomeAutor;
	private StatusTopico status;
	
	
	private List<RespostaDto> repostas;
	
	
	public DetalhesDoTopicoDto(Topico topico) {
		this.id = topico.getId();
		this.titulo=topico.getTitulo();
		this.Mensagem=topico.getMensagem();
		this.dataCriacao=topico.getDataCriacao();
		this.nomeAutor = topico.getAutor().getNome();
		this.status = topico.getStatus();
		this.repostas = new ArrayList<>();
		this.repostas.addAll(topico.getRespostas().stream().map(RespostaDto::new).collect(Collectors.toList()));
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getMensagem() {
		return Mensagem;
	}


	public void setMensagem(String mensagem) {
		Mensagem = mensagem;
	}


	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}


	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}


	public String getNomeAutor() {
		return nomeAutor;
	}


	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}


	public StatusTopico getStatus() {
		return status;
	}


	public void setStatus(StatusTopico status) {
		this.status = status;
	}


	public List<RespostaDto> getRepostas() {
		return repostas;
	}


	public void setRepostas(List<RespostaDto> repostas) {
		this.repostas = repostas;
	}
	
	
	

}
