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
public class TroChoiDoanChu {
    public static void main(String[] args) throws IOException {
        char ch, ignore, answer = 'K';
        do{
        System.out.println("nhap ki tu ban dang nghi den: ");
        ch = (char)System.in.read();
            System.out.println("CH = "+ch);
//        do{
//            ignore = (char)System.in.read();         
//        }while(ignore != '\n');
        
        if(ch == answer)
            System.out.println("your guess is right");
        else{
            if(ch < answer)
                System.out.println("your guess is lower ");
            else
                System.out.println("your guess is higher ");
        }
        
        }while(ch != answer);   
    }
}
