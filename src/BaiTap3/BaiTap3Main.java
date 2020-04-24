/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author nga
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
  
        SinhVien sv1, sv2, sv3;
        sv1 = new SinhVien("Nguyễn Thị Kim Nga", df.parse("02/12/1999"), 8);
        sv2 = new SinhVien("Lê Thanh Hòa", df.parse("20/05/2000"), 9);
        sv3 = new SinhVien("Trần Minh Tân", df.parse("03/11/1999"), 6);
        
        QLSV qlsv = new QLSV();
        qlsv.themSV(sv1);
        qlsv.themSV(sv2);
        qlsv.themSV(sv3);
        
        ISoSanh sxTen = new SoSanhTheoTen();
        ISoSanh sxDiem = new SoSanhTheoDiem();
        
        qlsv.inDS();
        
        System.out.println("\nSắp xếp danh sách sinh viên theo tên: ");
        qlsv.setSoSanh(sxTen);
        qlsv.sapXep();
        qlsv.inDS();
        
        System.out.println("\nSắp xếp danh sách sinh viên theo điểm: ");
        qlsv.setSoSanh(sxDiem);
        qlsv.sapXep();
        qlsv.inDS();
    } 
}
