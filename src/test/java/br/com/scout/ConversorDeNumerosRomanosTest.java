package br.com.scout;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConversorDeNumerosRomanosTest {


    // possibilidade   -- login
    //  USER STORY : eu como usuário gostaria de me logar na scout para poder realizar palpites nos boloes.

    /*
    | Cenario                | Esperado                                | Obtido                               |
    ---------------------------------------------------------------------------------------------------------
    | cpf nao preenchido     | mensagem o cpf é um campo obrigatorio   |                                      |
    | senha nao preenchido   | mensagem a senha é um campo obrigatorio |                                      |
    | cpf invalido           | mensagem cpf ou senha invalida          |                                      |
    | cpf nao existe         | mensagem cpf ou senha invalida          |                                      |
     */

    // BDD Behavior Driven Development
    // Desenvolvimento baseado em comportamentos
    // GIVEN - WHEN - THEN
    // DADO - QUANDO - ENTAO

    /*
    (GIVEN) DADO um usuário que não preenchou o CPF
    (WHEN) QUANDO tentar logar na scout
    (THEN) ENTAO o cpf é um campo obrigatorio
     */

    @Test
    public void deveRetornar1QuandoNumeroRomanoForI(){
        int valorEsperado = 1;
        int valorObtido = ConversorDeNumerosRomanos.converterParaDecimal( "I");
        Assertions.assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void deveRetornar5QuandoNumeroRomanoForV(){
        int valorEsperado = 5;
        int valorObtido = ConversorDeNumerosRomanos.converterParaDecimal( "V");
        Assertions.assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void deveRetornar10QuandoNumeroRomanoForX(){
        int valorEsperado = 10;
        int valorObtido = ConversorDeNumerosRomanos.converterParaDecimal( "X");
        Assertions.assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void deveRetornar50QuandoNumeroRomanoForL(){
        int valorEsperado = 50;
        int valorObtido = ConversorDeNumerosRomanos.converterParaDecimal( "L");
        Assertions.assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void deveLancarExcecaoQuandoNumeroRomanoNaoExistir(){
        Assertions.assertThrows(
                RuntimeException.class, () -> {
                    ConversorDeNumerosRomanos.converterParaDecimal("10");
                }
        );
    }
}
