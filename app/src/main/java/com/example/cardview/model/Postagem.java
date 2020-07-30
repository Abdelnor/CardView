package com.example.cardview.model;

public class Postagem {

    private String Nome;
    private String Postagem;
    private int imagem;

    public Postagem() {
    }

    public Postagem(String nome, String postagem, int imagem) {
        Nome = nome;
        Postagem = postagem;
        this.imagem = imagem;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getPostagem() {
        return Postagem;
    }

    public void setPostagem(String postagem) {
        Postagem = postagem;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
