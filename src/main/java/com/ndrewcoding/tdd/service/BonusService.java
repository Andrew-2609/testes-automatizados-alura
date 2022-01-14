package main.java.com.ndrewcoding.tdd.service;

import main.java.com.ndrewcoding.tdd.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BonusService {

    public BigDecimal calcularBonus(Funcionario funcionario) {
        BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
        if (valor.compareTo(new BigDecimal("1000")) > 0) {
            throw new IllegalArgumentException("Um funcionário que ganhe mais de 10 mil reais não pode ser bonificado!");
        }
        return valor.setScale(2, RoundingMode.HALF_UP);
    }

}
