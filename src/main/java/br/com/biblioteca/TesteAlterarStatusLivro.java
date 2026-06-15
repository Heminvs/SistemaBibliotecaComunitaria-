package br.com.biblioteca;

import br.com.biblioteca.dao.LivroDao;

public class TesteAlterarStatusLivro {

    public static void main(String[] args) {

        LivroDao dao = new LivroDao();

        dao.alterarStatus(1, "INDISPONIVEL");

    }
}