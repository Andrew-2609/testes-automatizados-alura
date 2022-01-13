package test.java.com.ndrewcoding.tdd.service;

import main.java.com.ndrewcoding.tdd.enums.Desempenho;
import main.java.com.ndrewcoding.tdd.model.Funcionario;
import main.java.com.ndrewcoding.tdd.service.ReajusteService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {

    @Test
    public void reajusteDeveriaSerDeTresPorCentoQuandoDesempenhoForADesejar() {
        ReajusteService reajusteService = new ReajusteService();
        Funcionario funcionario = new Funcionario("Andrew", LocalDate.of(2003, 2, 5), new BigDecimal("2000"));

        reajusteService.concederReajuste(funcionario, Desempenho.A_DESEJAR);

        assertEquals(new BigDecimal("2060.00"), funcionario.getSalario());
    }

}
