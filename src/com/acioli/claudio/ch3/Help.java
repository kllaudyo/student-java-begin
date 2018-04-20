package com.acioli.claudio.ch3;

import java.io.IOException;

public class Help{

    public static void main(String args[])
            throws IOException {

        System.out.println("Help on:");
        System.out.println("\t1. if");
        System.out.println("\t2. switch");
        System.out.print("Choose one: ");

        char choice = (char) System.in.read();

        System.out.println("\n");

        switch (choice){
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch(expression) {");
                System.out.println("\tcase constant");
                System.out.println("\t\t statement sequence");
                System.out.println("\t\t break;");
                System.out.println("\t...");
                System.out.println("}");
                break;
            default:
                System.out.println("Selection not found");
        }


    }

}
