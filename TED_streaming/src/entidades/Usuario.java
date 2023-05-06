package entidades;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private List<String> favoritos;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.favoritos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public boolean validarSenha(String senha) {
        return this.senha.equals(senha);
    }

    public List<String> getFavoritos() {
        return favoritos;
    }

    public void adicionarFavorito(String titulo) {
        favoritos.add(titulo);
    }

    public void removerFavorito(String titulo) {
        favoritos.remove(titulo);
    }
}

