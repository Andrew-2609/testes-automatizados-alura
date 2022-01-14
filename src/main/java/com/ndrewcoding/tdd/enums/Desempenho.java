package main.java.com.ndrewcoding.tdd.enums;

import java.math.BigDecimal;

public enum Desempenho {

    A_DESEJAR {
        @Override
        public BigDecimal retornarPercentualDeReajuste() {
            return new BigDecimal("0.03");
        }
    }, BOM {
        @Override
        public BigDecimal retornarPercentualDeReajuste() {
            return new BigDecimal("0.20");
        }
    }, OTIMO {
        @Override
        public BigDecimal retornarPercentualDeReajuste() {
            return new BigDecimal("0.30");
        }
    };

    public abstract BigDecimal retornarPercentualDeReajuste();

}
