package main.java.com.ndrewcoding.tdd.service;

import main.java.com.ndrewcoding.tdd.enums.Desempenho;
import main.java.com.ndrewcoding.tdd.model.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {

    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
        BigDecimal percentualDeReajuste = desempenho.retornarPercentualDeReajuste();
        BigDecimal reajuste = funcionario.getSalario().multiply(percentualDeReajuste);
        funcionario.reajustarSalario(reajuste);
    }

}
