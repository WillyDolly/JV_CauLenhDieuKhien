/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CauLenhDieuKhien;

import java.io.IOException;

/**
 *
 * @author hai
 */
public class ASC2_Code {
    public static void main(String[] args) throws IOException {
        //solution 1
//        int change = 0, asc;
//        char ch,ignore;
//        for(;;){
//            System.out.print("enter a character: ");
//            ch = (char)System.in.read();
//            do{
//                ignore = (char)System.in.read();
//            }while(ignore!='\n');
//            asc = (int)ch;
//            
//            System.out.print("uppercase / lowercase: ");
//            
//            if(asc>=65 && asc<=90){//uppercase letters
//                ch = (char)(asc+32);// change into lowercase
//                System.out.println(ch);
//                change++;
//            }else if(asc>=97 && asc <=122){//lowercase letters
//                ch = (char)(asc-32);// change into uppercase
//                System.out.println(ch);
//                change++;
//            }else if(asc==46){//full stop
//                break;
//            }else{// other characters
//                continue;
//            }
//        }
//        System.out.println("number of change: "+change);

       //solution2
       int change =0;
       char ch,ignore;
       do{
           System.out.println("input a character: ");
          ch = (char)System.in.read();
          do{
              ignore = (char)System.in.read();
          }while(ignore!='\n');
          if((ch>='a') & (ch<='z')){
              ch -= 32;
              System.out.println(ch); 
              change++;
          }else if(ch>='A'&& ch<='Z'){
              ch +=32;
              System.out.println(ch);
              change++;
          }
       }while(ch!='.');
        System.out.println("changes: "+change);
    }
}
