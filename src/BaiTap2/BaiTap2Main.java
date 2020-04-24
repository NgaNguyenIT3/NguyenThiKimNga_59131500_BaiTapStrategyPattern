/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author nga
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GioHang gh1 = new GioHang();
        GioHang gh2 = new GioHang();
       
        gh1.setHinhThucTT(new ThanhToanOnline());
        gh2.setHinhThucTT(new ThanhToanCOD());
       
        HangHoa hh1 = new HangHoa("Máy xoay sinh tố", 500000, "Máy xoay sinh tố chất chất lượng tốt");
        HangHoa hh2 = new HangHoa("Tủ lạnh", 4000000, "Tủ lạnh chất lượng Nhật Bản bền đẹp");
        
        gh1.themHangHoa(hh1);
        gh1.themHangHoa(hh2);
        
        gh2.themHangHoa(hh1);
        gh2.themHangHoa(hh2);
       
        System.out.println("\nDanh sách hàng hóa của giỏ hàng 1:");
        gh1.Xuat();
        System.out.println("\nThanh toán theo hình thức online của GH1:\nTổng tiền hàng: " + gh1.tinhTienHang() + 
                "\n" + "Tiền khách phải trả: "+gh1.SoTienKhachPhaiTra());

        System.out.println("\nDanh sách hàng hóa của giỏ hàng 2:");
        gh2.Xuat();
        System.out.println("\nThanh toán theo hình thức COD của GH2:\nTổng tiền hàng: " + gh2.tinhTienHang() + 
                "\n" + "Tiền khách phải trả: "+gh2.SoTienKhachPhaiTra());
    }
    
}
