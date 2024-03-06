/*
 Escreva um programa que leia uma letra maiúscula ou minúscula e imprima se ela
é uma vogal ou uma consoante usando switch case. Por exemplo, se a letra for A ou a, 
imprima “Vogal”.
 */
package com.mycompany.switchcaseex3;

import java.util.Scanner;

public class SwitchCaseEx3 {

    public static void main(String[] args) {

        System.out.println("Digite uma letra: ");

        Scanner teclado = new Scanner(System.in);
        char x;
        x = teclado.nextLine().charAt(0);

        switch (x) {
            case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U' ->
                System.out.println("Essa é uma vogal!");
            default ->
                System.out.println("Essa é uma consoante!");
        }

    }
}
