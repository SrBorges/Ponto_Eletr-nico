package com.company;

public class Operador extends Funcionario{

    private double valorHora;

    public Operador(int idFunc, String nome, String email, String rg, double valorHora) {
        super(idFunc, nome, email, rg);
        this.valorHora = valorHora;

    }


    @Override
    public void imprimir(){

        System.out.println("ID: " + getIdFunc());
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("RG: " + getRg());
        System.out.println("Valor hora: " + getValorHora());

    }





    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}
