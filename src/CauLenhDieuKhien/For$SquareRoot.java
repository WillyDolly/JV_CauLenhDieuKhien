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
public class For$SquareRoot {
    public static void main(String[] args) {
        double loopControlVar, sroot, saiSoLamTron;
        for(loopControlVar = 1.0;loopControlVar<100.0;loopControlVar++){
            sroot = Math.sqrt(loopControlVar);
            System.out.println("Square Root of "+loopControlVar+" = "+sroot);
            
            saiSoLamTron = loopControlVar -(sroot*sroot);
            System.out.println("sai so lam tron la "+saiSoLamTron);
        }
    }
}
