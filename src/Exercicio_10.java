import java.util.Scanner;

import java.lang.Math;

public class Exercicio_10 {

    public static void main(String[] args) throws Exception {

        double celcius, conversao;

        Scanner input;

        input = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celcius: ");

        celcius = input.nextDouble();

        input.close();

        conversao = (celcius * 9/5) + 32;

        conversao = Math.ceil(conversao * 100) / 100;

        System.out.print(celcius + " graus Celcius equivalem a " + conversao + " graus Fahreint");

    }
    
}
