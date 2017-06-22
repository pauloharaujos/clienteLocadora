package model.domain.cliente;

import model.domain.acervo.Item;

public class Locacao {
		
	private int idLocacao;
	private String dtLocacao;
	private String dtDevolucaoPrevista;
	private String dtDevolucaoEfetiva;
	private int valorCobrado;
	private int multaCobrada;
        
     	//@JoinColumn(name="idCliente")
        private Cliente cliente;

	//@JoinColumn(name="idItem")
	private Item item;
	
	public Locacao(String dtLocacao, String dtDevolucaoPrevista, String dtDevolucaoEfetiva,
			int valorCobrado, int multaCobrada, Item item, Cliente cliente) {
	
		this.dtLocacao = dtLocacao;
		this.dtDevolucaoPrevista = dtDevolucaoPrevista;
		this.dtDevolucaoEfetiva = dtDevolucaoEfetiva;
		this.valorCobrado = valorCobrado;
		this.multaCobrada = multaCobrada;
		this.item = item;
                this.cliente = cliente;
	}
	
	public Locacao(){
		
	}
        
        public int getId(){
            return this.idLocacao;
        }
       
	public String getDtLocacao() {
		return dtLocacao;
	}

	public void setDtLocacao(String dtLocacao) {
		this.dtLocacao = dtLocacao;
	}

	public String getDtDevolucaoPrevista() {
		return dtDevolucaoPrevista;
	}

	public void setDtDevolucaoPrevista(String dtDevolucaoPrevista) {
		this.dtDevolucaoPrevista = dtDevolucaoPrevista;
	}

	public String getDtDevolucaoEfetiva() {
		return dtDevolucaoEfetiva;
	}

	public void setDtDevolucaoEfetiva(String dtDevolucaoEfetiva) {
		this.dtDevolucaoEfetiva = dtDevolucaoEfetiva;
	}

	public int getValorCobrado() {
		return valorCobrado;
	}

	public void setValorCobrado(int valorCobrado) {
		this.valorCobrado = valorCobrado;
	}

	public int getMultaCobrada() {
		return multaCobrada;
	}

	public void setMultaCobrada(int multaCobrada) {
		this.multaCobrada = multaCobrada;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
        
	
	public String toString(){
            return Integer.toString(this.idLocacao);
        }
}
