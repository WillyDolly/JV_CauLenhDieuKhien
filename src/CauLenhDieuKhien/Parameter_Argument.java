/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CauLenhDieuKhien;

import java.util.Scanner;

/**
 *
 * @author hai
 */
class evenTest{
    public boolean isEven(int i){
        if(i%2 == 0){ 
            System.out.println("it's an even number");
            return true;
        }else{
            System.out.println("it's not an even number");
            return false;
        }
        
    }
}
public class Parameter_Argument {
    public static void main(String[] args) {
        for(;;){
            System.out.println("enter a number");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            if(n==0) break;
            
        evenTest e = new evenTest();
        e.isEven(n);  
        }
    }
}
