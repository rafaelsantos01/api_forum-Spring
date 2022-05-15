package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.modelo.Topico;

public class TopicoDto {
	
	private Long id;
	private String titulo;
	private String Mensagem;
	private LocalDateTime dataCriacao;
	
	
	
	public TopicoDto(Topico topico) {
		this.id = topico.getId();
		this.titulo=topico.getTitulo();
		this.Mensagem=topico.getMensagem();
		this.dataCriacao=topico.getDataCriacao();
	}
	
	
	
	public Long getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getMensagem() {
		return Mensagem;
	}
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}



	public static List<TopicoDto> converter(List<Topico> topicos) {
		return topicos.stream().map(TopicoDto::new).collect(Collectors.toList());
	}

}
