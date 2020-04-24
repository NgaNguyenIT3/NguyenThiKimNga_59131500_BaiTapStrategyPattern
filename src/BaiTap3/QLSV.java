/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.ArrayList;

/**
 *
 * @author nga
 */
public class QLSV {
    ISoSanh<SinhVien> soSanh;
    ArrayList<SinhVien> dsSV = new ArrayList<>();

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }
    
    public ISoSanh<SinhVien> getSoSanh() {
        return soSanh;
    }
    
    public void themSV(SinhVien sv){
        dsSV.add(sv);
    }
    
    public void sapXep(){
        SinhVien t;
        for (int i=0;i<dsSV.size();i++)
            for (int j=i+1;j<dsSV.size();j++)
                if (soSanh.soSanh(dsSV.get(i), dsSV.get(j))==1) {
                    t=dsSV.get(i);
                    dsSV.set(i, dsSV.get(j));
                    dsSV.set(j, t);
                }
    }
    
    public void inDS() {
        for (int i=0;i<dsSV.size();i++)
            System.out.println("Danh sách sinh viên:" + 
                        "\n" + "Sinh viên thứ: " + (i+1) + 
                        "\n" + dsSV.get(i).XuatTT());   
    }
}
