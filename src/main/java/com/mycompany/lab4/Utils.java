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
public class Utils {
    
    public int getCube(int num){
        
        return num * num * num;
    }
    
 public static boolean getprime(int x) {
     
     for(int i = 2; i<x; i++){
         if(x%1 == 0){
             return false;
         }
     }
     return true;
     
 }
 
 int getIntFromFile(String fileName) throws FileNotFoundException {
     
     int num;
     Scanner sc = new Scanner(new File(fileName));
     num = sc.nextInt();
     
     return num;
 }
 
 
    
}
