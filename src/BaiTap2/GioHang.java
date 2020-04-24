/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.ArrayList;

/**
 *
 * @author nga
 */
public class GioHang {
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> dsHH = new ArrayList<>();

    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }

    public void themHangHoa(HangHoa HH){
        dsHH.add(HH);
    }
    
    public int tinhTienHang(){
        int tongtien = 0;
        for (int i=0; i<dsHH.size(); i++){
            tongtien = tongtien + dsHH.get(i).getGia();
        }
        return tongtien;
    }
    
    public double SoTienKhachPhaiTra(){
        return hinhThucTT.thanhToan(tinhTienHang());
    }
    
    public void Xuat(){
         for (int i=0; i<dsHH.size(); i++){
            System.out.println("\nHàng hóa thứ " + (i+1));
            dsHH.get(i).XuatTT();
        }
    }
}
