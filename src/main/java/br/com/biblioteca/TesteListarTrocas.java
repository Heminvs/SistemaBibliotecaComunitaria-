package br.com.biblioteca;

import br.com.biblioteca.dao.TrocaDao;

public class TesteListarTrocas {

    public static void main(String[] args) {

        TrocaDao dao = new TrocaDao();

        dao.listarTrocas();

    }
}