package atividades;

import atores.Aluno;
import atores.Livro;
import utils.Data;

public class ReservaLivro {
	
	private int idAluno;
	private int idLivro;
	private Data dataReserva;
	private Data dataDevolucao;
	
	public ReservaLivro(int idAluno, int idLivro, Data reserva, Data devolucao){
		this.idAluno = idAluno;
		this.idLivro = idLivro;
		this.dataReserva = reserva;
		this.dataDevolucao = devolucao;
	}
	
	public int getIdAluno(){
		return this.idAluno;
	}
	
	public int getIdLivro(){
		return this.idLivro;
	}
	
	public String getDataReserva(){
		return this.dataReserva.pegaData();
	}
	
	public String getDataDevolucao(){
		return this.dataDevolucao.pegaData();
	}
	
	public void imprimeDadosReserva(){
		System.out.println("- Reserva -");
		System.out.println("Data da Reserva: " + this.dataReserva.pegaData());
		System.out.println("Data da Devolução: " + this.dataDevolucao.pegaData());
		System.out.println("ID Aluno Reservista: " + this.idAluno);
		System.out.println("ID livro Reservado: " + this.idLivro);
		System.out.println();
	}
}
