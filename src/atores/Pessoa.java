package atores;

import utils.Data;

public abstract class Pessoa {
	
	private String name;
	private Data dataNascimento;
	
	public Pessoa(String name, Data dataNasc){
		this.name=name;
		this.dataNascimento = dataNasc;
	}
	
	public String getName(){
		return this.name;
	}
	
	public Data getDataNascimento(){
		return this.dataNascimento;
	}
	
	public void imprimeDados(){
		System.out.println("Nome: " + this.name);
		if(this.dataNascimento != null)
			System.out.println("Data de Nascimento: " + this.dataNascimento.pegaData());
	}
	
}
