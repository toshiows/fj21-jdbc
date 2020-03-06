package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaAltera {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setId(1L);
		contato.setNome("Jorjao");
		contato.setEmail("jorjao@caelum.com.br");
		contato.setEndereco("R. Veraaso 1111 cj5755");
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDao dao = new ContatoDao();
		dao.altera(contato);
		
		System.out.println("Alterado");

	}

}
