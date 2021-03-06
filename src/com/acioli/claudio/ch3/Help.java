package com.acioli.claudio.ch3;

import java.io.IOException;

public class Help{

    public static void main(String args[])
            throws IOException{

        for(;;){
            char choice, ignore;

            do {

                System.out.println("Help on:");
                System.out.println("\t1. if");
                System.out.println("\t2. switch");
                System.out.println("\t3. for");
                System.out.println("\t4. while");
                System.out.println("\t5. do-while");
                System.out.println("\t6. break");
                System.out.println("\t7. continue\n");
                System.out.print("Choose one: ");

                choice = (char) System.in.read();
                do ignore = (char) System.in.read(); while (ignore != '\n');

            }while(choice < '1' | choice > '7' & choice != 'q');

            System.out.println('\n');

            if(choice == 'q') break;

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
                case '3':
                    System.out.println("The for:\n");
                    System.out.println("for(inicializacao; condição; iteração)");
                    System.out.println("\tinstrução;");
                    break;
                case '4':
                    System.out.println("The while:\n");
                    System.out.println("while(condição)");
                    System.out.println("\tinstrução;");
                    break;
                case '5':
                    System.out.println("The do-while:\n");
                    System.out.println("do {");
                    System.out.println("\tinstrução;");
                    System.out.println("} while (condição);");
                    break;
                case '6':
                    System.out.println("The break:\n");
                    System.out.println("break; or break label;");
                    break;
                case '7':
                    System.out.println("The continue:\n");
                    System.out.println("continue; or continue label;");
                    break;
                default:
                    System.out.println("Selection not found");
            }
            System.out.println('\n');
        }

    }

}
