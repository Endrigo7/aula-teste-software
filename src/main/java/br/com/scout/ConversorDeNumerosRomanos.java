package br.com.scout;

public class ConversorDeNumerosRomanos {

    public static int converterParaDecimal(String numeroRomano){
        switch (numeroRomano) {
            case "I" : return 1;
            case "V" : return 5;
            case "X" : return 10;
            case "L" : return 50;
            default: throw new RuntimeException("Numero romano invalido");
        }
    }
}
