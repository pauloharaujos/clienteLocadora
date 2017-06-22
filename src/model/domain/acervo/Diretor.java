package model.domain.acervo;

public class Diretor {
	

	private int idDiretor;
	private String nome;

	
	public Diretor(String nome) {
		
		this.nome = nome;
	}
        
        public int getId(){
            return this.idDiretor;
        }
	
	public Diretor(){
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
        
        public String toString(){
            return this.nome;
        }
	
	
}
