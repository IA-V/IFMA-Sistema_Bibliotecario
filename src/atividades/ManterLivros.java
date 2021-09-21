package atividades;

import java.util.ArrayList;
import java.util.Iterator;

import atores.Livro;

public class ManterLivros {
	
	private ArrayList cadastroDeLivros;
	
	public ManterLivros(){
		this.cadastroDeLivros = new ArrayList<Livro>();
	}
	
	public void adicionarLivro(Livro livro){
		this.cadastroDeLivros.add(livro);
		
	}
	
	public void excluirLivro(int id){
		Iterator it = this.cadastroDeLivros.iterator();
		while(it.hasNext()){
			Livro livro = (Livro) it.next();
			if(livro.getId() == id){
				this.cadastroDeLivros.remove(livro);
			}
		}
	}
	
	public void mostrarLivrosCadastrados(){
		System.out.println("- Livros cadastrados -");
		Iterator it = this.cadastroDeLivros.iterator();
		while(it.hasNext()){
			Livro livro = (Livro) it.next();
			livro.imprimeDados();
		}
		System.out.println();
	}
}
