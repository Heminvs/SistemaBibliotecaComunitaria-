package br.com.biblioteca;

import br.com.biblioteca.dao.UsuarioDao;
import br.com.biblioteca.model.Usuario;

public class TesteLogin {

    public static void main(String[] args) {

        UsuarioDao dao = new UsuarioDao();

        Usuario usuario =
                dao.fazerLogin(
                        "ulysses.barreto",
                        "75950256"
                );

        if (usuario != null) {

            System.out.println("Login realizado!");

            System.out.println(
                    usuario.getNome() + " " +
                            usuario.getSobrenome()
            );

        } else {

            System.out.println("Usuário ou senha inválidos");

        }
    }
}