package br.com.biblioteca;

import br.com.biblioteca.dao.LivroDao;

public class TesteListarLivros {

    public static void main(String[] args) {

        LivroDao dao = new LivroDao();

        dao.listarLivros();

    }
}