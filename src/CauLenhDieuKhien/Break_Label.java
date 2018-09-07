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
public class Break_Label {
    public static void main(String[] args) {
        //escape a specified block 
//        for(int i=1;i<4;i++){
//            one:{
//                two:{
//                    three:{
//                        if(i==1) break one;
//                        if(i==2) break two;
//                        if(i==3) break three;
//                          System.out.println("this line never printed");
//                    }
//                    System.out.println("break loop 3"); 
//                } 
//                System.out.println("break loop 2");
//            }
//            System.out.println("break loop 1");
//        }
//        System.out.println("end the entire loop");
    
        //escape the whole loop
//done:
//    for(int i=0;i<5;i++){
//        for(int j=0;j<7;j++){
//            for(int k=0;k<10;k++){
//                System.out.println("k = "+k);
//                if(k==5) break done;
//            }
//            System.out.println("after k loop ");// not executed
//        }
//        System.out.println("after j loop ");// not executed
//    }
//     System.out.println("after i loop ");   
    
    //escape inner loop and skip outer loop's current value
    for(int i=0;i<5;i++)
       stop1:{      
           for(int j=0;j<5;j++){
                if(j==2) break stop1;
                System.out.println("i: "+", j: "+j);
            }
        }
    
    }
}
