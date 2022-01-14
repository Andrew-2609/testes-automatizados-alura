package test.java.com.ndrewcoding.tdd.service;

import main.java.com.ndrewcoding.tdd.enums.Desempenho;
import main.java.com.ndrewcoding.tdd.model.Funcionario;
import main.java.com.ndrewcoding.tdd.service.ReajusteService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {

    ReajusteService reajusteService;
    Funcionario funcionario;

    @BeforeEach
    public void inicializar() {
        reajusteService = new ReajusteService();
        funcionario = new Funcionario("Andrew", LocalDate.of(2003, 2, 5), new BigDecimal("2000"));
    }

    @Test
    public void reajusteDeveriaSerDeTresPorCentoQuandoDesempenhoForADesejar() {
        reajusteService.concederReajuste(funcionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("2060.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDeVintePorCentoQuandoDesempenhoForBom() {
        reajusteService.concederReajuste(funcionario, Desempenho.BOM);
        assertEquals(new BigDecimal("2400.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDeTrintaPorCentoQuandoDesempenhoForOtimo() {
        reajusteService.concederReajuste(funcionario, Desempenho.OTIMO);
        assertEquals(new BigDecimal("2600.00"), funcionario.getSalario());
    }

}
