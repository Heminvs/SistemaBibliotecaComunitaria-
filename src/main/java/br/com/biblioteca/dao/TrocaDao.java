package br.com.biblioteca.dao;

import br.com.biblioteca.conexao.ConexaoBanco;
import br.com.biblioteca.model.Troca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TrocaDao {

    public void solicitarTroca(Troca troca) {

        String sql =
                "INSERT INTO troca(id_livro, id_solicitante, id_dono, status) " +
                        "VALUES (?, ?, ?, ?)";

        try {

            Connection conexao = ConexaoBanco.conectar();

            PreparedStatement ps =
                    conexao.prepareStatement(sql);

            ps.setInt(1, troca.getIdLivro());
            ps.setInt(2, troca.getIdSolicitante());
            ps.setInt(3, troca.getIdDono());
            ps.setString(4, troca.getStatus());

            ps.executeUpdate();

            ps.close();
            conexao.close();

            System.out.println("Troca solicitada com sucesso!");

        } catch (Exception e) {

            System.out.println("Erro ao solicitar troca:");
            System.out.println(e.getMessage());

        }
    }

    public void atualizarStatus(int idTroca, String novoStatus) {

        String sql =
                "UPDATE troca SET status = ? WHERE id = ?";

        try {

            Connection conexao = ConexaoBanco.conectar();

            PreparedStatement ps =
                    conexao.prepareStatement(sql);

            ps.setString(1, novoStatus);
            ps.setInt(2, idTroca);

            int linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("Status da troca atualizado!");
            } else {
                System.out.println("Troca não encontrada.");
            }

            ps.close();
            conexao.close();

        } catch (Exception e) {

            System.out.println("Erro ao atualizar troca:");
            System.out.println(e.getMessage());

        }
    }

    public void listarTrocas() {

        String sql = "SELECT * FROM troca";

        try {

            Connection conexao = ConexaoBanco.conectar();

            PreparedStatement ps =
                    conexao.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            System.out.println("\n===== TROCAS =====\n");

            while (rs.next()) {

                System.out.println("ID: " +
                        rs.getInt("id"));

                System.out.println("Livro: " +
                        rs.getInt("id_livro"));

                System.out.println("Solicitante: " +
                        rs.getInt("id_solicitante"));

                System.out.println("Dono: " +
                        rs.getInt("id_dono"));

                System.out.println("Status: " +
                        rs.getString("status"));

                System.out.println("--------------------");
            }

            rs.close();
            ps.close();
            conexao.close();

        } catch (Exception e) {

            System.out.println("Erro ao listar trocas:");
            System.out.println(e.getMessage());

        }
    }
}
