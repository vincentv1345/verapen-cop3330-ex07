package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Summer 2021 Assignment 1 Solutions
 * Copyright 2021 Vincent Verapen
 */
public class Area
{
    public static void main( String[] args )
    {
        System.out.println( "What is the length of the room in feet? ");
        Scanner length = new Scanner(System.in);
        double len = length.nextDouble();
        System.out.println("What is the width of the room in feet? ");
        Scanner width = new Scanner(System.in);
        double wid = width.nextDouble();
        AreaOutput n = new AreaOutput();
        n.outPut(len, wid);
    }
}
