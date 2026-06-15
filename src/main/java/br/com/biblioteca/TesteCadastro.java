package br.com.biblioteca;

import br.com.biblioteca.dao.UsuarioDao;
import br.com.biblioteca.model.Usuario;

public class TesteCadastro {

    public static void main(String[] args) {

        Usuario usuario = new Usuario();

        usuario.setNome("Ulysses");
        usuario.setSobrenome("Barreto");
        usuario.setCpf("12345678900");
        usuario.setUsuario("ulysses.barreto");
        usuario.setSenha("75950256");

        UsuarioDao dao = new UsuarioDao();;

        dao.salvar(usuario);

    }
}