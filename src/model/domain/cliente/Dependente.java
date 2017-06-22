package model.domain.cliente;

public class Dependente extends Cliente{
	

	private Socio socio;

	public Dependente(String nome,  String dtNascimento, String sexo, int estahAtivo, Socio socio) {
		super(nome, dtNascimento, sexo, estahAtivo);
		this.socio = socio;
	}
	
	public Dependente(){
		
	}

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}

}
