package br.com.biblioteca;

import br.com.biblioteca.dao.LivroDao;
import br.com.biblioteca.model.Livro;

public class TesteLivro {

    public static void main(String[] args) {

        Livro livro = new Livro();

        livro.setTitulo("Dom Casmurro");
        livro.setAutor("Machado de Assis");
        livro.setGenero("Romance");
        livro.setDisponivel(true);
        livro.setIdDono(1);

        LivroDao dao = new LivroDao();

        dao.salvar(livro);
    }
}