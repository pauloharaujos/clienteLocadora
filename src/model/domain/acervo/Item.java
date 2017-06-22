package model.domain.acervo;

import java.util.ArrayList;
import java.util.List;


import model.domain.cliente.Locacao;


public class Item {
	

	private int idItem;
	private int numSerie;
	private String dtAquisicao;
	private String tipoItem;
	private Titulo titulo;
	private List<Locacao> locacoes;
	
	public Item(int numSerie, String dtAquisicao, String tipoItem, Titulo titulo) {
		
		this.numSerie = numSerie;
		this.dtAquisicao = dtAquisicao;
		this.tipoItem = tipoItem;
		this.titulo = titulo;
		this.setLocacoes(new ArrayList());
	}
	
	public Item(){
		
	}
        
        public int getId(){
            return this.idItem;
        }

	public int getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}

	public String getDtAquisicao() {
		return dtAquisicao;
	}

	public void setDtAquisicao(String dtAquisicao) {
		this.dtAquisicao = dtAquisicao;
	}

	public String getTipoItem() {
		return tipoItem;
	}

	public void setTipoItem(String tipoItem) {
		this.tipoItem = tipoItem;
	}

	public Titulo getTitulo() {
		return titulo;
	}

	public void setTitulo(Titulo titulo) {
		this.titulo = titulo;
	}

	public List<Locacao> getLocacoes() {
		return locacoes;
	}

	public void setLocacoes(ArrayList<Locacao> locacoes) {
		this.locacoes = locacoes;
	}
	
        public String toString(){
            return Integer.toString(this.numSerie);
        }
	
}
