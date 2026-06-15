package br.com.biblioteca;

import br.com.biblioteca.dao.TrocaDao;

public class TesteAtualizarTroca {

    public static void main(String[] args) {

        TrocaDao dao = new TrocaDao();

        dao.atualizarStatus(1, "ACEITA");

    }
}