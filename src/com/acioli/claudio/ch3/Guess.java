package com.acioli.claudio.ch3;

//Advinha a letra do jogo
public class Guess{

    public static void main(String[] args)
            throws java.io.IOException{
        char ch, answer = 'K';

        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Can you guess it? ");

        ch = (char) System.in.read();

        if(ch == answer)

            System.out.println("** Right **");

        else {

            if(ch < answer)
                System.out.println("too low...");
            else
                System.out.println("too hight...");

            System.out.println("Sorry, try again...");
        }
    }

}