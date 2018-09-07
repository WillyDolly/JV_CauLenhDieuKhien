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
public class FindPrime {
    public static void main(String[] args){ 
       boolean prime; 
       int sqrt;
      for(;;){
           prime = true;
       System.out.println("enter a number: ");
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       if(n==01) break;
//       sqrt = (int)Math.sqrt(n);
//        System.out.println("sqrt= "+Math.sqrt(n));
//       for(int i=2;i<=sqrt;i++){
//           System.out.println("pass");
//           if(n%i==0){
//               prime = false;
//               break;
//           }
//       }
       
//        for(int i=2;i<=n/i;i++){
//            if(n%i==0){
//                prime = false;
//                break;
//            }
//        }

       if(prime)
         System.out.println(n+" is a prime");
       else
         System.out.println(n+" is not a prime");
       }
    }
}
