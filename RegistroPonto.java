package com.company;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import com.company.Funcionario;

public class RegistroPonto {

    private LocalDate dataRegistro = LocalDate.of(2022, 05, 06);
    private LocalTime horaEntrada = LocalTime.of(15, 30);
    private LocalTime horaSaida = LocalTime.of(23, 00);
    Date  date = new Date();

    Funcionario Func = new Funcionario(00, "xxx", "xxx", "xxx");


    public void apresentarRegistroPonto(){

        System.out.println("Data de Registro: " + dataRegistro);
        System.out.println("Hora de Entrada: " + horaEntrada);
        System.out.println("Hora de Saída: " + horaSaida);
        System.out.println(date);


    }




    public Funcionario getFunc() {

        return Func;
    }

    public void setFunc(Funcionario func) {
        Func = func;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalTime horaSaida) {
        this.horaSaida = horaSaida;
    }
}
