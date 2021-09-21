package atores;

import utils.Data;

public class Aluno extends Pessoa{
	
	private int idAluno;
	
	public Aluno(String name, Data dataNasc, int id){
		super(name, dataNasc);
		this.idAluno = id;
	}
	
	public int getId(){
		return this.idAluno;
	}
	
	public void imprimeDados(){
		System.out.println("---------- Aluno ----------");
		System.out.println("ID: " + this.getId());
		super.imprimeDados();
	}
}
