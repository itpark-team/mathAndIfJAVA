package com.company;

import java.util.Scanner;

public class ExampleIfProgram {
    public static void main(String[] args) {
        //вводиться символ - нужно понять буква ли это
        //понять маленькая она или большая
        //если это не буква то нужно понять цифра ли это
        //чётная она или не чётная
        //если это не цифра и не буква то вывести надпись НЕРАСПОЗНАНО

        Scanner scanner = new Scanner(System.in);

        char symb;

        System.out.print("введите символ: ");
        symb = scanner.nextLine().charAt(0);

        if (symb >= 'A' && symb <= 'Z' || symb >= 'a' && symb <= 'z') {
            System.out.print("это буква ");

            if (symb >= 'A' && symb <= 'Z') {
                System.out.println("большая");
            } else {
                System.out.println("маленькая");
            }

        } else if (symb >= '0' && symb <= '9') {
            System.out.print("это цифра ");

            if (symb % 2 == 0) {
                System.out.println("чётная");
            } else {
                System.out.println("НЕчётная");
            }

        } else {
            System.out.println("нераспознано");
        }

    }
}
