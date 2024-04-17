package br.com.scout;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {


    @Test
    public void deveRetornar15QuandoValoresForem10e5(){
        int resultadoEsperado = 15;
        int resultadoObtido = Main.somar(10, 5);

        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }

}
