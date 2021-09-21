package atores;

import utils.Data;

public class Bibliotecario extends Pessoa{
	
	private int idBibliotecario;
	private double salario;

	public Bibliotecario(String name, Data dataNasc, int id, double salario){
		super(name, dataNasc);
		this.idBibliotecario = id;
		this.salario = salario;
	}
	
	public int getId(){
		return this.idBibliotecario;
	}
	
	public double getSalario(){
		return this.salario;
	}
	
	public void setSalario(double novoSalario){
		this.salario = novoSalario;
	}
	
	public void imprimeDados(){
		System.out.println("---------- Bibliotecario ----------");
		System.out.println("ID: " + this.idBibliotecario);
		super.imprimeDados();
		System.out.println("Salario: " + this.salario);
	}
	
}
