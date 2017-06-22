package model.domain.acervo;

public class Ator {
	 
    private int idAtor;
    private String nome;      
	
	public Ator(String nome) {		
		this.nome = nome;		
	}
	
	public Ator(){
		
	}
        
        public int getId(){
            return this.idAtor;
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