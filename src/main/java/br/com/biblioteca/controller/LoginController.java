package br.com.biblioteca.controller;

import br.com.biblioteca.dao.UsuarioDao;
import br.com.biblioteca.model.Usuario;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.Objects;

public class LoginController {

    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField txtSenha;

    @FXML
    private Button btnEntrar;

    @FXML
    private Button btnCadastrar;

    @FXML
    public void entrar() {

        String usuario = txtUsuario.getText();
        String senha = txtSenha.getText();

        UsuarioDao dao = new UsuarioDao();

        Usuario usuarioLogado =
                dao.fazerLogin(usuario, senha);

        if (usuarioLogado != null) {

            System.out.println("Login realizado!");
            System.out.println(
                    usuarioLogado.getNome() +
                            " " +
                            usuarioLogado.getSobrenome()
            );

        } else {

            System.out.println(
                    "Usuário ou senha inválidos"
            );

        }
    }

    @FXML
    public void abrirCadastro() {

        try {

            Parent root =
                    FXMLLoader.load(
                            Objects.requireNonNull(getClass().getResource(
                                    "/view/tela-cadastro.fxml"
                            ))
                    );

            Stage stage =
                    (Stage) btnCadastrar
                            .getScene()
                            .getWindow();

            Scene scene =
                    new Scene(root);

            stage.setScene(scene);

            stage.show();

        } catch (Exception e) {

            System.out.println(
                    "Erro ao abrir cadastro"
            );

            System.out.println(
                    e.getMessage()
            );

        }
    }

    public Button getBtnEntrar() {
        return btnEntrar;
    }

    public void setBtnEntrar(Button btnEntrar) {
        this.btnEntrar = btnEntrar;
    }
}