package br.com.scout;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Por favor digite 2 numeros inteiros");

        Scanner leTeclado = new Scanner(System.in);
        int a = leTeclado.nextInt();
        int b = leTeclado.nextInt();
        String operacao = leTeclado.next();

        int resultado = 0;

        if(operacao.equals("+")) {
            resultado = a + b;
        }else if(operacao.equals("-")) {
            resultado = a + b;
        }

        System.out.println("O resultado da soma é " + resultado);

    }

    public static int somar(int a, int b){
        return a + b;
    }

}