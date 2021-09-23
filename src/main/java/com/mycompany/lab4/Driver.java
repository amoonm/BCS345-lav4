/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author amoonmainali
 */
public class Driver {
    public static void main(String[] args) throws FileNotFoundException {
    
        Utils ut = new Utils();
            System.out.println("The cube of 5 is " + ut.getCube(5));
            System.out.println("5 is  " + Utils.getprime(8));
            System.err.println("Read from file m.txt value of " +
                    ut.getIntFromFile("m.txt"));
    }
    
}
