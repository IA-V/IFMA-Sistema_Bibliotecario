package atividades;

import java.util.ArrayList;
import java.util.Iterator;

public class ManterReservas {
	
	private ArrayList cadastroDeReservas;
	
	public ManterReservas(){
		this.cadastroDeReservas = new ArrayList<ReservaLivro>();
	}
	
	public void adicionarReserva(ReservaLivro reservaLivro){
		this.cadastroDeReservas.add(reservaLivro);
	}
	
	public void retirarReserva(int idLivro, int idAluno){
		Iterator it = this.cadastroDeReservas.iterator();
		while(it.hasNext()){
			ReservaLivro reservaLivro = (ReservaLivro) it.next();
			if((idAluno == reservaLivro.getIdAluno()) && idLivro == reservaLivro.getIdLivro()){
				this.cadastroDeReservas.remove(reservaLivro);
			}
		}
	}
	
	public void mostrarLivrosReservados(){
		Iterator it = this.cadastroDeReservas.iterator();
		System.out.println("- Reservas Atuais -");
		while(it.hasNext()){
			ReservaLivro reservaLivro = (ReservaLivro) it.next();
			System.out.println("Livro " + reservaLivro.getIdLivro() +
					" reservado pelo aluno " + reservaLivro.getIdLivro() + ", em " 
					+ reservaLivro.getDataReserva() + ".");	
		}
	}
}
