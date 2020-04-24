/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author nga
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        context ctx = new context();
        
        ctx.setTinhToan(new Cong());
        System.out.println("75 + 12 = " + ctx.tinh(75, 12) + "\n");
        
        ctx.setTinhToan(new Tru());
        System.out.println("54 - 78 = " + ctx.tinh(54, 78) + "\n");
    }
    
}
