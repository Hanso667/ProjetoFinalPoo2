package model;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Usuario {

    private int codigo;
    private String nome;
    private String email;
    private String senha;
    private String tipo;
    private String criacao;

    public Usuario() {
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCriacao() {
        return criacao;
    }

    public void setCriacao(String criacao) {
        this.criacao = criacao;
    }
    
    public String dateToString(Date data){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String dataS = sdf.format(data);
        return dataS;
    }
}
