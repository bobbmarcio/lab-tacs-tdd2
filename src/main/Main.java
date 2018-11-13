package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcao;

        System.out.println("1 - Validador de ano bissexto\n2 - Conversor de numeral romano");

        Scanner scanner = new Scanner(System.in);

        opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                bissexto();
                break;
            case 2:
                romano();
                break;
        }

    }

    public static void bissexto(){
        int ano;
        Bissexto bissexto = new Bissexto();

        System.out.println("Entre com o ano para verificar se este é bissexto: ");

        Scanner scanner = new Scanner(System.in);
        ano = scanner.nextInt();

        if (bissexto.isBissexto(ano) == true){
            System.out.println("O ano "+ano+" é bissexto.");
        }else {
            System.out.println("O ano "+ano+" não é bissexto.");
        }
    }

    public static void romano(){
        String ano;
        NumeralRomano numeralRomano = new NumeralRomano();

        System.out.println("Entre com o numeral romano a ser convertido: ");

        Scanner scanner = new Scanner(System.in);
        ano = scanner.next();

        System.out.println(numeralRomano.getAno(ano));
    }
}
