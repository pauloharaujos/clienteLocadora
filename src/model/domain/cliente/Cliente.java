package model.domain.cliente;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	
	private int numIncricao;
	private String nome;        
	private String dtNascimento;
	private String sexo;
	private int estahAtivo;	

	
	
       public Cliente(String nome, String dtNascimento, String sexo, int estahAtivo) {
		
		this.nome = nome;		
		this.dtNascimento = dtNascimento;
		this.sexo = sexo;
		this.estahAtivo = estahAtivo;
		//this.locacoes = new ArrayList();
	}
	
	public Cliente(){
		
	}        

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumIncricao() {
		return numIncricao;
	}

	public void setNumIncricao(int numIncricao) {
		this.numIncricao = numIncricao;
	}

	public String getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEstahAtivo() {
		return estahAtivo;
	}

	public void setEstahAtivo(int estahAtivo) {
		this.estahAtivo = estahAtivo;
	}
		
	
	public String toString(){
            return this.nome;
        }

}
