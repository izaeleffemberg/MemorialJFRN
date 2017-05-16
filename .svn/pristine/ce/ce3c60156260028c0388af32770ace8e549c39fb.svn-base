package br.jus.jfrn.memorial.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Acontecimento{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_acontecimento")
	@SequenceGenerator(name = "seq_acontecimento", sequenceName = "seq_acontecimento", allocationSize = 1)
	private Long id;
	
	@OneToMany (fetch = FetchType.LAZY)
	@JoinTable(name = "ACONTECIMENTO_FOTOS", joinColumns = { 
			@JoinColumn(name = "ACONTECIMENTO_ID") }, 
			inverseJoinColumns = { @JoinColumn(name = "FOTOARQUIVO_ID") })
	private List<FotoArquivo> fotos;
	
	@JoinTable(name = "ACONTECIMENTO_ARQUIVOS", joinColumns = { 
			@JoinColumn(name = "ACONTECIMENTO_ID") }, 
			inverseJoinColumns = { @JoinColumn(name = "FOTOARQUIVO_ID") })
	@OneToMany (fetch = FetchType.LAZY)
	private List<FotoArquivo> arquivos;
	
	private String titulo;
	
	private String descricao;
	
	private Date data;
		
	public List<FotoArquivo> getFotos() {
		return fotos;
	}

	public List<FotoArquivo> getArquivos() {
		return arquivos;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setFotos(List<FotoArquivo> fotos) {
		this.fotos = fotos;
	}

	public void setArquivos(List<FotoArquivo> arquivos) {
		this.arquivos = arquivos;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getId() {
		return this.id;
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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
}
