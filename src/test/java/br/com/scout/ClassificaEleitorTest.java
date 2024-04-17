package br.com.scout;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClassificaEleitorTest {

    @Test
    public void deveRetornaNaoéQuandoidadeMenorQue16(){
        TipoEleitor esperado = TipoEleitor.NAO_ELEITOR;
        TipoEleitor obtido = ClassificaEleitor.statusEleitor(15);
        Assertions.assertEquals(esperado, obtido);
    }

    @Test
    public void deveRetornaOpcionalQuandoidadeMenorIguala16(){
        TipoEleitor esperado = TipoEleitor.ELEITOR_OPCIONAL;
        TipoEleitor obtido = ClassificaEleitor.statusEleitor(16);
        Assertions.assertEquals(esperado, obtido);
    }

    @Test
    public void deveRetornaOBrigatorioQuandoidadeMenorIguala18(){
        TipoEleitor esperado = TipoEleitor.ELEITOR_OBRIGATORIO;
        TipoEleitor obtido = ClassificaEleitor.statusEleitor(18);
        Assertions.assertEquals(esperado, obtido);
    }

    @Test
    public void deveRetornaOpcionalQuandoidadeMenorIguala65(){
        TipoEleitor esperado = TipoEleitor.ELEITOR_OPCIONAL;
        TipoEleitor obtido = ClassificaEleitor.statusEleitor(65);
        Assertions.assertEquals(esperado, obtido);
    }

}
