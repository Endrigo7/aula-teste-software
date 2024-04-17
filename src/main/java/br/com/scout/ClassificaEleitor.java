package br.com.scout;

import java.util.Scanner;

public class ClassificaEleitor {

    // refatoração
    // o que funcionava , continua funcionado? ---> Teste regressivo.


    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);

        System.out.println("Digite a idade do eletior");
        int idade = leTeclado.nextInt();

        System.out.println(statusEleitor(idade));
    }

    public static TipoEleitor statusEleitor(int idade) {
        if(idade < 16){
            return TipoEleitor.NAO_ELEITOR;
        } else if (idade >= 16 && idade < 18){
            return TipoEleitor.ELEITOR_OPCIONAL;
        } else if (idade >= 18 && idade < 65) {
            return TipoEleitor.ELEITOR_OBRIGATORIO;
        } else {
            return TipoEleitor.ELEITOR_OPCIONAL;
        }
    }

}
