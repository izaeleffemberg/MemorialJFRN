package br.jus.jfrn.memorial.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;

import org.hibernate.bytecode.internal.javassist.FieldHandled;
import org.hibernate.bytecode.internal.javassist.FieldHandler;


@Entity
public class FotoArquivo implements  FieldHandled{
	
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_fotoArquivo")
    @SequenceGenerator(name="seq_fotoArquivo", sequenceName="seq_fotoArquivo", allocationSize=1)
	private Long id;
	
	@Lob
	@Basic(fetch=FetchType.LAZY)
	private byte[] arquivo;
	private String nome;
	
	private String permissao;
	private String descricao;

	private FieldHandler fieldHandler;
	 
	public Long getId() {
		return this.id;
	}

	
	public void setId(Long id) {
		this.id = id;
	}

	public byte[] getArquivo() {
		 if(arquivo != null) { 
	           return arquivo;
	       }

	       if (fieldHandler != null) { 
	           return (byte[]) fieldHandler.readObject(this, "arquivo", arquivo);
	       } else {
	           return null;
	       }  
	}

	public void setArquivo(byte[] arquivo) {
		this.arquivo = arquivo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPermissao() {
		return permissao;
	}

	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public FieldHandler getFieldHandler() {
		return fieldHandler;
	}

	@Override
	public void setFieldHandler(FieldHandler arg0) {
		this.fieldHandler = arg0;
		
	}
	
}
