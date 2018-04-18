package com.acioli.claudio.ch2;

public class LogicalOpTable{
    public static void main(String[] args){
        head();
        row(true, true);
        row(true, false);
        row(false, true);
        row(false, false);
    }

    private static void head(){
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
    }

    private static void row(boolean p, boolean q){
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));
    }
}