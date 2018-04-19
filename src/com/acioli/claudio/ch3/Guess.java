package com.acioli.claudio.ch3;

//Advinha a letra do jogo
public class Guess{

    public static void main(String[] args)
            throws java.io.IOException{
        char ch, ignore, answer = 'K';

        do {

            System.out.println("I'm thinking of a letter between A and Z.");
            System.out.print("Can you guess it? ");
            ch = (char) System.in.read();

            //para que use apenas o primeiro caracter
            //o buffer sempre adiciona apos o enter a \n que é o ultimo char
            do ignore = (char) System.in.read(); while(ignore != '\n');

            if(ch==answer)
                System.out.println("** Right **");
            else{
                System.out.println("Game Over ;-)");
                if(ch < answer)
                    System.out.println("too low...");
                else
                    System.out.println("too high...");
            }

        }while(ch != answer);

    }

}