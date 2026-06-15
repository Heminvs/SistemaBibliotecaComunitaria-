package br.com.biblioteca;

import br.com.biblioteca.dao.TrocaDao;
import br.com.biblioteca.model.Troca;

public class TesteTroca {

    public static void main(String[] args) {

        Troca troca = new Troca();

        troca.setIdLivro(1);
        troca.setIdSolicitante(1);
        troca.setIdDono(1);
        troca.setStatus("PENDENTE");

        TrocaDao dao = new TrocaDao();

        dao.solicitarTroca(troca);
    }
}