package model.domain.acervo;

import java.util.ArrayList;
import java.util.List;

public class Titulo {

    private int idTitulo;
	private String nome;
	private int ano;
	private String sinopse;
	private String categoria;
	

	private List<Ator> atores = new ArrayList();	
	private Diretor diretor;
	private Classe classe;
	
	public Titulo(String nome, int ano, String sinopse, String categoria, Diretor diretor, Classe classe, List atores) {
	
		this.nome = nome;
		this.ano = ano;
		this.sinopse = sinopse;
		this.categoria = categoria;
		this.diretor = diretor;
		this.classe = classe;
		this.atores = atores;
	}
        
        public int getId(){
            return this.idTitulo;
        }

	public Titulo(){
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public List<Ator> getAtores() {
		return atores;
	}

	public void setAtores(ArrayList<Ator> atores) {
		this.atores = atores;
	}

	public Diretor getDiretor() {
		return diretor;
	}

	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	
        public String toString(){
            return this.nome;
        }
	
}
