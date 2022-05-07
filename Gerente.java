package com.company;

public class Gerente  extends  Funcionario{

    private String login;
    private String senha;

    public Gerente(int idFunc, String nome, String email, String rg, String login, String senha) {
        super(idFunc, nome, email, rg);
        this.login = login;
        this.senha = senha;

    }




    @Override
    public void imprimir(){

        System.out.println("ID: " + getIdFunc());
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("RG: " + getRg());
        System.out.println("Login: " + getLogin());
        System.out.println("Senha: " + getSenha());

    }



    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
