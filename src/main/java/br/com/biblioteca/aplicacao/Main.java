package br.com.biblioteca.aplicacao;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        try {

            Parent root = FXMLLoader.load(
                    getClass().getResource("/view/tela-login.fxml")
            );

            Scene scene = new Scene(root);

            stage.setTitle("Biblioteca Comunitária");
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {

            System.out.println("Erro ao carregar tela:");
            System.out.println(e.getMessage());

        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}