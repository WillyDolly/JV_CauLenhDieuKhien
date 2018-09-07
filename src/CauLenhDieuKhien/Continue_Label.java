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
public class Continue_Label {
    public static void main(String[] args) {
        outerloop:
        for(int i=1;i<10;i++){
            System.out.print("\n"+"outerloop number "+i+" innerloop: ");
            for(int j=1;j<10;j++){
                if(j==5) continue outerloop;
                System.out.print(j);
            }
       
        }
    }
}
