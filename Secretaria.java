package com.company;

public class Secretaria extends Funcionario {

    private String telefone;
    private String ramal;


    public Secretaria(int idFunc, String nome, String email, String rg, String telefone, String ramal) {
        super(idFunc, nome, email, rg);
        this.telefone = telefone;
        this.ramal = ramal;

    }


    @Override
    public void imprimir(){

        System.out.println("ID: " + getIdFunc());
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("RG: " + getRg());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Ramal: " + getRamal());

    }



    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }
}
