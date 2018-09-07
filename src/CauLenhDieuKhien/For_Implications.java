/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CauLenhDieuKhien;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hai
 */
public class For_Implications {
    public static void main(String[] args) {
        try {
            //        for(int i=0,j=10;i<j;i++,j--){
//            System.out.println("i = "+i+", j = "+j);
//    }

for(int i=0;(char)System.in.read()!='s';i++){
    System.out.println("vong lap so "+i);
    Scanner scanner = new Scanner(System.in);
    if(scanner.hasNextLine())//check character input has next line
        scanner.nextLine();//return input of nextLine
    }   } catch (IOException ex) {
            Logger.getLogger(For_Implications.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
