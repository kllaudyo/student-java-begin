package com.acioli.claudio.ch3;

//le caracteres do teclado
public class KbIn{
    public static void main(String args[]) throws java.io.IOException{
        char ch;
        System.out.print("press a key followed by ENTER: ");

        //System.in.read retorna a tecla digitada que esta armazenada no buffer e é descarregada após o enter
        //essa tecla é inteira por isso a conversão para char, já que tecla representa um caracter ASCII
        ch = (char) System.in.read();
        System.out.println("Your key is: " + ch);
    }
}