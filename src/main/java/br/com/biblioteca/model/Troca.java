package br.com.biblioteca.model;

public class Troca {

    private int id;
    private int idLivro;
    private int idSolicitante;
    private int idDono;
    private String status;

    public Troca() {
    }

    public Troca(int id, int idLivro,
                 int idSolicitante,
                 int idDono,
                 String status) {

        this.id = id;
        this.idLivro = idLivro;
        this.idSolicitante = idSolicitante;
        this.idDono = idDono;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public int getIdSolicitante() {
        return idSolicitante;
    }

    public void setIdSolicitante(int idSolicitante) {
        this.idSolicitante = idSolicitante;
    }

    public int getIdDono() {
        return idDono;
    }

    public void setIdDono(int idDono) {
        this.idDono = idDono;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}