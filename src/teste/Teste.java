package teste;

import atividades.ManterLivros;
import atividades.ManterReservas;
import atividades.ReservaLivro;
import atores.Aluno;
import atores.Bibliotecario;
import atores.Livro;
import utils.Data;

public class Teste {
	
	public static void main(String[] args){
		Data dataNascimentoTeste = new Data(10, 10, 2010);
		Data reserva = new Data(22, 12, 2017);
		Data devolucao = new Data(25, 12, 2017);
		
		Aluno aluno1 = new Aluno("Aluno1", dataNascimentoTeste, 1);
		Aluno aluno2 = new Aluno("Aluno2", dataNascimentoTeste, 2);
		Aluno aluno3 = new Aluno("Aluno3", dataNascimentoTeste, 3);
		
		Livro livro1 = new Livro(1, "Título1", "ISBN1", "Autor1");
		Livro livro2 = new Livro(2, "Título2", "ISBN2", "Autor2");
		Livro livro3 = new Livro(3, "Título3", "ISBN3", "Autor3");
		
		Bibliotecario bib1 = new Bibliotecario("Bib1", dataNascimentoTeste, 1, 1.0);
		Bibliotecario bib2 = new Bibliotecario("Bib2", dataNascimentoTeste, 2, 2.0);
		Bibliotecario bib3 = new Bibliotecario("Bib3", dataNascimentoTeste, 3, 3.0);
		
		ManterLivros cadastraLivro = new ManterLivros();
		cadastraLivro.adicionarLivro(livro1);
		cadastraLivro.adicionarLivro(livro2);
		cadastraLivro.adicionarLivro(livro3);
		cadastraLivro.mostrarLivrosCadastrados();
		
		ReservaLivro reserva1 = new ReservaLivro(1, 1, reserva, devolucao);
		reserva1.imprimeDadosReserva();
		ReservaLivro reserva2 = new ReservaLivro(2, 2, reserva, devolucao);
		reserva2.imprimeDadosReserva();
		ReservaLivro reserva3 = new ReservaLivro(3, 3, reserva, devolucao);
		reserva3.imprimeDadosReserva();
		
		ManterReservas cadastraReserva = new ManterReservas();
		cadastraReserva.adicionarReserva(reserva1);
		cadastraReserva.adicionarReserva(reserva2);
		cadastraReserva.adicionarReserva(reserva3);
		cadastraReserva.mostrarLivrosReservados();
	}

}
