package com.company;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.lang.Thread;
import com.company.RegistroPonto;
public class main {

    public static void main(String[] args){



        int opcao;
        int recadastro;

        RegistroPonto RP = new RegistroPonto();

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Informe o ID: ");
            int id = sc.nextInt();
            System.out.println("Informe o Nome: ");
            String nome = sc.next();
            System.out.println("Informe o Email: ");
            String email = sc.next();
            System.out.println("Informe o RG: ");
            String rg = sc.next();


            List<Funcionario> list = new ArrayList<>();

            System.out.println("1 - Gerente. ");
            System.out.println("2 - Secretária. ");
            System.out.println("3 - Operador. ");

            System.out.println("Informe a opção: ");
            opcao = sc.nextInt();

            try {
                System.out.println("Carregando... ");
                Thread.sleep(10000);
            } catch (Exception erro) {
            }

            switch (opcao) {

                case 1:
                    list.add(new Gerente(id, nome, email, rg, "root", "toor-Default"));

                    for (Funcionario Glist : list) {
                        Glist.imprimir();
                        RP.apresentarRegistroPonto();
                    }

                    break;

                case 2:
                    list.add(new Secretaria(id, nome, email, rg, "(19) 3804-5387", "ADS"));


                    for (Funcionario Gsec : list) {

                        Gsec.imprimir();
                        RP.apresentarRegistroPonto();

                    }

                    break;

                case 3:
                    list.add(new Operador(id, nome, email, rg, 7.35));


                    for (Funcionario Gop : list) {

                        Gop.imprimir();
                        RP.apresentarRegistroPonto();

                    }

                    break;

                default:
                    System.out.println("Opção inválida. ");


            }

            System.out.println("Deseja repetir operação ? ");
            System.out.print("Recadastro (1): ");
            recadastro = sc.nextInt();

        }while(recadastro == 1);

        System.out.println("Até a próxima. ");



        sc.close();

    }

}
