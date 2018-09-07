/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CauLenhDieuKhien;

/**
 *
 * @author hai
 */
public class JavaSystemHelp{ 
        
    public void if_else(){
         System.out.println("if(condition){");
         System.out.println("code block}");
         System.out.println("else{"); 
         System.out.println("code block}"); 
    }
    
    public void switch_case(){
        System.out.println("switch(variable){");  
        System.out.println("case constant1 : code; break;");
        System.out.println("case constant2 : code; break;");
        System.out.println("default : code; break;");
    }
    
    public void for_loop(){
         System.out.println("for(initialize variable;condition;loop variable){");
         System.out.println("code};");
    }
    
    public void do_while(){
        System.out.println("do{");
        System.out.println("code");
        System.out.println("}while(condition);");
    }
    
    public void while_loop(){
         System.out.println("while(condition){");
         System.out.println("code}");
    }
    
    public void break_command(){
        System.out.println("break or break_label");
    }
    
    public void continue_command(){
        System.out.println("continue or continue_label");
    }
}
