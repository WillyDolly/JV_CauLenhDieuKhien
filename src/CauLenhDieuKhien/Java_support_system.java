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
public class Java_support_system {
    public static void main(String[] args) throws IOException {
        char choice, ignore;
        JavaSystemHelp help = new JavaSystemHelp();        
        for(;;){
            do{
                System.out.println("type one number: ");
                System.out.println("1. if ");
                System.out.println("2. switch");
                System.out.println("3. do-while");
                System.out.println("4. while");
                System.out.println("5. for");
                System.out.println("6. break");
                System.out.println("7. continue");
                
                choice = (char) System.in.read();
                do{
                    ignore = (char) System.in.read();
                }while(ignore !='\n');
            }while(choice < '1'| choice> '7' & choice !='q');
            
            if(choice =='q') break;
            
             switch(choice){
            case '1': help.if_else(); break;
            case '2': help.switch_case(); break;
            case '3': help.do_while();break;
            case '4' : help.while_loop(); break;
            case '5': help.for_loop(); break;
            case '6':  help.break_command();break; 
            case '7':  help.continue_command(); break;
            }
        }
    }
}
