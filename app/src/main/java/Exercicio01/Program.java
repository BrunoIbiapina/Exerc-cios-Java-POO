package Exercicio01;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calcular calc1 = new Calcular();

        System.out.println(calc1.soma(4, 5));
        System.out.println(calc1.soma(4, 5, 6));

    }
}
