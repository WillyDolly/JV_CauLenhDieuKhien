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
public class WhileLoop {
    public static void main(String[] args) {
        // exercise 1:
//       int tong =0, tich =1, i=1;
//       while(i<=5){
//           tong += i;
//           tich *= i;
//           i++;
//       }
//        System.out.println("tong tu 1 -> 5: "+tong);
//        System.out.println("giai thua 5! "+tich);
        
        //exe 2: 
//        char ch = 'a';
//        while(ch<='z'){
//            System.out.print(ch+"  ");
//            ch++;
//        }
        
        //exe 3:
        int luythua = 0, tich;
        while(luythua<10){
//            if(luythua ==0){
//                tich = 1;
//            }else{
//                tich *= 2;
//            }
            tich = (int)Math.pow(2, luythua);
            System.out.println("luy thua "+luythua+" cua 2 = "+tich);
            luythua++;
        }
    } 
}
