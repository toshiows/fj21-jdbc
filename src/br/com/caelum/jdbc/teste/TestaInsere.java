package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Carlos");
		contato.setEmail("carlos@caelum.com.br");
		contato.setEndereco("R. Vergueiro 222211 cj5755");
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDao dao = new ContatoDao();
		dao.adiciona(contato);
		
		System.out.println("Adicionado");

	}

}
